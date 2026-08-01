package Problems;

public class VariableExample {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // Modify a
    a = 23;
    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // Modify b
    b = 35;
    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();
  }
}
