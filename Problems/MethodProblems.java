package Problems;

public class MethodProblems {
  /* Prints "Hello world" three times. */
  static void printHelloWorldThrice() {
    System.out.println("Hello world");
    System.out.println("Hello world");
    System.out.println("Hello world");
  }

  /* Prints learning experience statements. */
  static void learningExperience() {
    System.out.println("I have created my first variable");
    System.out.println("I have created my first method");
    System.out.println("I have created my first loop");
    System.out.println("I am excited to learn java");
  }

  /* Prints numbers from 1 to the given limit. */
  static void printNumbers(int limit) {
    for (int i = 1; i <= limit; i++) {
      System.out.println(i);
    }
  }

  /* Prints squares of numbers from 1 to the given limit. */
  static void printSquaresOfNumbers(int limit) {
    for (int i = 1; i <= limit; i++) {
      System.out.println(i * i);
    }
  }

  /* Prints the multiplication table of 5. */
  static void printMultiplicationTable() {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
    }
  }

  /* Prints the multiplication table of the given number. */
  static void printMultiplicationTable(int table) {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", table, i, table * i).println();
    }
  }

  /* Returns the sum of three numbers. */
  static int sumOfThreeNumbers(int num1, int num2, int num3) {
    int sum = num1 + num2 + num3;
    return sum;
  }

  /* Returns the third angle of a triangle given the other two angles. */
  static int findThirdAngleInATriangle(int angle1, int angle2) {
    int angle3 = 180 - (angle1 + angle2);
    return angle3;
  }

  public static void main(String[] args) {
    // Print Hello World thrice by calling printHelloWorldThrice method
    MethodProblems.printHelloWorldThrice();

    // Print learning experience by calling learningExperience method
    MethodProblems.learningExperience();

    // Passing an argument to the printNumbers method
    MethodProblems.printNumbers(5);

    // Passing an argument to the printSquaresOfNumbers method
    MethodProblems.printSquaresOfNumbers(4);

    // Print multiplication table by passing table value
    MethodProblems.printMultiplicationTable(5);

    // Print multiplication table which uses default 5 value in the code
    MethodProblems.printMultiplicationTable();

    // Calling sumOfThreeNumbers with arguments and storing the result in total
    int total = MethodProblems.sumOfThreeNumbers(3, 4, 5);
    System.out.println(total);

    // Calling findThirdAngleInATriangle with arguments and storing the result in
    // thirdAngle and printing it
    int thirdAngle = MethodProblems.findThirdAngleInATriangle(45, 55);
    System.out.println(thirdAngle);
  }
}
