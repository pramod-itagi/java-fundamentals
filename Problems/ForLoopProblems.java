package Problems;

public class ForLoopProblems {
  public static void main(String[] args) {
    // 7 table
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 7, i, 7 * i).println();
    }

    // 6 table
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 6, i, 6 * i).println();
    }

    // 10 table
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 10, i, 10 * i).println();
    }

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

    // print squares of first 10 odd numbers
    for (int i = 1; i <= 10; i++) {
      System.out.println(((2 * i) - 1) * ((2 * i) - 1));
    }
  }
}
