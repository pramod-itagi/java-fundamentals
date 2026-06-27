package Programs.Quiz_programs;

public class MethodQuiz {
  public static void main(String[] args) {
    // call a method
    printHelloWorldThrice();
    printLearningSteps();
    printNumbers(12);
    printSquaresOfNumbers(4);
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
}
