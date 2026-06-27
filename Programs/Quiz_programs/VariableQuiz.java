package Programs.Quiz_programs;

public class VariableQuiz {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    int c = 15;

    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // Modify value of a
    a = 20;

    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // modify value of b:
    b = 11;

    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();
  }
}
