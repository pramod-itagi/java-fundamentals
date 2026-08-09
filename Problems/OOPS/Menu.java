package Problems.OOPS;

import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.print("Enter number 1: ");
      int number1 = scanner.nextInt();

      System.out.print("Enter number 2: ");
      int number2 = scanner.nextInt();

      System.out.println("Choices available are:");
      System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Exit");

      System.out.print("Enter choice: ");
      choice = scanner.nextInt();
      if (choice != 5) {
        System.out.println("First number is: " + number1);
        System.out.println("Second number is: " + number2);
        System.out.println("Choice entered is: " + choice);

        /*
         * using nested if:
         * 
         * Commenting this as we have used switch below.
         * performOperationsUsingNestedIf(number1, number2, choice);
         */
      }
      // Using switch
      performOperationsUsingSwitch(number1, number2, choice);

    } while (choice != 5);
  }

  private static void performOperationsUsingSwitch(int number1, int number2, int choice) {
    switch (choice) {
      case 1:
        System.out.println("You have chosen Addition");
        System.out.printf("%d + %d = %d", number1, number2, number1 + number2).println();
        break;
      case 2:
        System.out.println("You have chosen Subtraction");
        System.out.printf("%d - %d = %d", number1, number2, number1 - number2).println();
        break;
      case 3:
        System.out.println("You have chosen Multiplication");
        System.out.printf("%d * %d = %d", number1, number2, number1 * number2).println();
        break;
      case 4:
        System.out.println("You have chosen Division");
        System.out.printf("%d / %d = %d", number1, number2, number1 / number2).println();
        break;
      default:
        System.out.println("Exiting..");
        break;
    }
  }

  private static void performOperationsUsingNestedIf(int number1, int number2, int choice) {
    if (choice == 1) {
      System.out.println("You have chosen Addition");
      System.out.printf("%d + %d = %d", number1, number2, number1 + number2).println();
    } else if (choice == 2) {
      System.out.println("You have chosen Subtraction");
      System.out.printf("%d - %d = %d", number1, number2, number1 - number2).println();
    } else if (choice == 3) {
      System.out.println("You have chosen Multiplication");
      System.out.printf("%d * %d = %d", number1, number2, number1 * number2).println();
    } else if (choice == 4) {
      System.out.println("You have chosen Division");
      System.out.printf("%d / %d = %d", number1, number2, number1 / number2).println();
    } else {
      System.out.println("Invalid choice");
    }
  }
}
