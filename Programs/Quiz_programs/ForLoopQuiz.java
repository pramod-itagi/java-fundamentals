package Programs.Quiz_programs;

public class ForLoopQuiz {
  public static void main(String[] args) {
    // print numbers from 1 to 10
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // print numbers from 10 to 1
    for (int i = 10; i >= 1; i--) {
      System.out.println(i);
    }

    // print squares of first 10 numbers
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * i);
    }

    // print squares of first 10 even numbers
    for (int i = 1; i <= 10; i++) {
      System.out.println((2 * i) * (2 * i));
    }

    // print squares of first 10 even numbers
    for (int i = 1; i <= 10; i++) {
      System.out.println(((2 * i) - 1) * ((2 * i) - 1));
    }
  }
}
