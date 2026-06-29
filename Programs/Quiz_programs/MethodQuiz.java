package Programs.Quiz_programs;

public class MethodQuiz {
  public static void main(String[] args) {
    // call a method
    printHelloWorldThrice();
    printLearningSteps();
    printNumbers(12);
    printSquaresOfNumbers(4);
    printMultiplicationTable();
    printMultiplicationTable(6);

    printSumOfTwoNumbers(5, 6);
    printSumOfThreeNumbers(1, 2, 3);

    int total = sumOfThreeNumbers(1, 2, 3);
    System.out.println(total);

    int thirdAngle = findThirdAngle(60, 90);
    System.out.println(thirdAngle);
  }

  // Define a method
  static void printHelloWorldThrice() {
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
  }

  // Define a method
  static void printLearningSteps() {
    System.out.println("I have created my first variable");
    System.out.println("I have created my first method");
    System.out.println("I have created my first loop");
    System.out.println("I am excited to learn java");
  }

  // Print numbers to n
  static void printNumbers(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }

  static void printSquaresOfNumbers(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i * i);
    }
  }

  /*
   * Note: Here we are performing Method overloading for printMultiplicationTable
   * as it has same method name but differ in parameters
   */

  // By default it will print multiplication table of 5
  static void printMultiplicationTable() {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
    }
  }

  // Print multiplication table based on passed value
  static void printMultiplicationTable(int table) {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", table, i, table * i).println();
    }
  }

  static void printSumOfTwoNumbers(int num1, int num2) {
    int sum = num1 + num2;
    System.out.println(sum);
  }

  static void printSumOfThreeNumbers(int num1, int num2, int num3) {
    int sum = num1 + num2 + num3;
    System.out.println(sum);
  }

  // Return value
  static int sumOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
    return firstNumber + secondNumber + thirdNumber;
  }

  // Return value
  static int findThirdAngle(int firstAngle, int secondAngle) {
    return 180 - (firstAngle + secondAngle);
  }
}
