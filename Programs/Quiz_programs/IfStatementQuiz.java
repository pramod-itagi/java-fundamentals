package Programs.Quiz_programs;

public class IfStatementQuiz {
  public static void main(String[] args) {
    int a = 1, b = 2, c = 3, d = 4;
    if (a + b > c + d) {
      System.out.println("a + b is greater than c + d");
    }

    int angle1 = 60, angle2 = 60, angle3 = 60;
    if (angle1 + angle2 + angle3 == 180) {
      System.out.println("It is a triangle");
    }

    int number = 10;
    if (number % 2 == 0) {
      System.out.println("It is an even number");
    }
  }
}
