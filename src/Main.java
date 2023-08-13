import java.util.Scanner;

public class Main {

    public static void spotTheError(){
        System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the base of the triangle " +
                "(in inches).");
        double base = input.nextDouble();
        while (base <= 0) {
            System.out.println("That's invalid. Please input the" +
                    " base of the triangle (in inches).");
            base = input.nextDouble();
        }
        System.out.println("Please input the height of the triangle " +
                "(in inches).");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the " +
                    "height of the triangle (in inches).");
            height = input.nextDouble();
        }
        double area = (base * height) / 2;
        System.out.println("The area is " + area);
    }

    public static void whatIsTheDay(){
        String question = "what day is today?";
        String choiceOne = "monday";
        String choiceTwo = "tuesday";
        String choiceThree = "friday";
        String correctAnswer = choiceThree;

        System.out.println(question);
        System.out.println("Is today " + choiceOne + " or " + choiceTwo + " or "  + choiceThree +"?");

        Scanner input = new Scanner(System.in);
        String inputtedText = input.next();

        if(inputtedText.equals(correctAnswer.toLowerCase())){
            System.out.println("Congratulations! You got the correct day!");
        } else {
            System.out.println("The correct answer is " + correctAnswer);
        }
    }

    public static int salaryCalculator (int numberOfHours, int moneyPerHour, int vacationDay){
        int unpaidVacationHours = vacationDay*8 *moneyPerHour;
        int salaryPerWeek = (numberOfHours) * moneyPerHour;
        int weeksPerYear = 52;
        int yearlySalary = salaryPerWeek*weeksPerYear -unpaidVacationHours;
        System.out.println("yearly salary: "+ yearlySalary);
        return yearlySalary;
    }


    public static void main(String[] args) {
//        whatIsTheDay();
//        spotTheError();
//        salaryCalculator(40,15,8);
        StudentProfile student1 = new StudentProfile("Emily", "Tan", "Computer Science", 4.0, 2025);
        student1.incrementExpectedYearToGraduate();;
        System.out.println(student1.expectedYearToGraduate);
    }
}