package Theory;

import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    /*
     * print: Using print here instead of println as we want the input to be on the
     * same line.
     */
    System.out.print("Enter your name: ");
    /*
     * Scanner:
     * Scanner is class from java.util package used to get the input from the user.
     * 
     * Syntax:
     * Scanner scanner = new Scanner(System.in);
     * scanner is an object of Scanner class.
     * 
     * Here System.in is the input stream from the user.
     * System.out is providing output to user. Just like System.out.println();
     * 
     * Then we can use any of these following based on our requirements.
     * 
     * scanner.next(): Used to get the String from the input stream. It will stop
     * when it encounters a space.
     * 
     * scanner.nextInt(); // Used to get the next integer from the input stream.
     * 
     * scanner.nextDouble(); // Used to get the next double from the input stream.
     * 
     * scanner.nextFloat(); // Used to get the next float from the input stream.
     * 
     * scanner.nextLine(); // Used to get the next line from the input stream.
     * 
     * scanner.nextBoolean(); // Used to get the next boolean from the input stream.
     * 
     * scanner.nextByte(); // Used to get the next byte from the input stream.
     * 
     * scanner.nextShort(); // Used to get the next short from the input stream.
     * 
     * scanner.nextLong(); // Used to get the next long from the input stream.
     * 
     * scanner.nextChar(); // Used to get the next character from the input stream.
     */
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    scanner.nextLine(); // to clear the buffer
    System.out.printf("Hello %s, welcome to Java learning", name).println();

    /*
     * nextInt():
     * Used to get the next integer from the input stream.
     * Syntax:
     * int number = scanner.nextInt();
     * 
     */
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    System.out.printf("You are %d years old", age).println();

    /*
     * nextFloat():
     * Used to get the next float from the input stream.
     * 
     * Syntax:
     * float number = scanner.nextFloat();
     * 
     */
    System.out.print("Enter your salary in Float: ");
    float salary = scanner.nextFloat();
    System.out.printf("Your salary is %f", salary).println();

    /*
     * nextDouble():
     * Used to get the next double from the input stream.
     * Syntax:
     * double number = scanner.nextDouble();
     * 
     */
    System.out.print("Enter your salary in Double: ");
    double salary2 = scanner.nextDouble();
    System.out.printf("Your salary is %f", salary2).println();

    /*
     * nextBoolean():
     * Used to get the next boolean from the input stream.
     * Syntax:
     * boolean isTrue = scanner.nextBoolean();
     * 
     */
    System.out.print("Is it true or false ? ");
    boolean isTrue = scanner.nextBoolean();
    System.out.printf("It is %b", isTrue).println();

    /*
     * next():
     * Used to get the next token from the input stream.
     * Syntax:
     * String name2 = scanner.next();
     * 
     */
    System.out.print("Enter your name: ");
    String name2 = scanner.next();
    System.out.printf(name2); // Prints only Hello as it will stop at the space.

    /*
     * nextLine():
     * Used to get the next line from the input stream.
     * Syntax:
     * String name3 = scanner.nextLine();
     * 
     */
    System.out.print("Enter your name: ");
    String name3 = scanner.nextLine();
    System.out.printf(name3); // Prints the entire line.
  }
}
