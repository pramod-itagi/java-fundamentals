package Problems;

import java.util.Scanner;

public class Cube {

  static int findCube(int number) {
    return number * number * number;
  }

  public static void main(String[] args) {
    int number = 0;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Enter a number: ");
      number = sc.nextInt();
      int result = findCube(number);
      if (number > 0)
        System.out.println("Cube is: " + result);
    } while (number >= 0);
    System.out.println("Thank you! Have fun!");
  }
}
