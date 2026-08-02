package Problems;

public class ConditionalStatementsProblems {
  public static void main(String[] args) {
    // Check if a + b is greater than c + d
    int a = 10;
    int b = 20;
    int c = 15;
    int d = 5;
    if (a + b > c + d) {
      System.out.println("a + b is greater than c + d");
    }

    // Check if three angles form a triangle
    int angle1 = 65;
    int angle2 = 35;
    int angle3 = 80;
    if (angle1 + angle2 + angle3 == 180) {
      System.out.println("Three angles form a triangle");
    }

    // Check of the number is even or not
    int number = 5;
    if (number % 2 == 0) {
      System.out.println("Number is even");
    }
  }
}
