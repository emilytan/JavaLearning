package com.example;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Greetings greetings = new HelloGreeting();
    greetings.sayHello();

    // declaration
    Greetings greetings1 = new Greetings() {
      @Override
      public void sayHello() {
        greetings.sayHello();
      }
    };
    greetings1.sayHello();

    //lamda
    Greetings greetings2 = () -> System.out.println("Hello World");
    greetings2.sayHello();

    // lamba with input parameter
    Calculator calculator = (int x, int y) -> {
      Random random = new Random();
      int randomNumber = random.nextInt(50);
      return x*y+randomNumber;
    };
    System.out.println("calculate:" + calculator.calculate(1,2));
  }

}
