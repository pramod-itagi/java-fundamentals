package Theory;

public class InbuiltFunctions {
  public static void main(String[] args) {
    /*
     * System.out.println():
     * 
     * To print something on the console, we use System.out.println() method. It is
     * a predefined method.
     * 
     * System: System is package from java.lang package.
     * 
     * out: out is public static final PrintStream out object.
     * 
     * println(): It is a method of PrintStream class.
     * println is called as "print line"
     * It provides an extra line break after the output.
     * It can accept any data type as argument(String, expression etc.) or it can be
     * empty as well.
     * 
     * Note: Case of the method (System.out.println()) should be same. Otherwise, it
     * will throw an error.
     */
    System.out.println("Hell World");
    System.out.println(3 * 4);

    /*
     * Statement: Statements are the instructions given to the computer to perform
     * certain tasks.
     * 
     * System.out.println(3 * 4) is a statement where we are saying to calculate 3 *
     * 4 and print the output on the screen.
     */

    /*
     * String: String is a textual data which is enclosed in double quotes ("").
     * When anything is put under the double quotes and pass it in
     * System.out.println() method, it will be printed as it is.
     * 
     * Note: For Strings, spaces matters will printing. But for expressions, spaces
     * don't matter.
     * 
     * Example:
     * System.out.println("5 * 2        = 10"); // 5 * 2 = 10"
     * System.out.println(5 * 2); // 10
     */
    System.out.println("5 * 2 = 10");
    System.out.println(5 * 2);

    /*
     * Note:
     * Parameters which we are passing in a method, if they are multiple, they
     * should be separated by comma (,)
     */

    /*
     * Math.random():
     * random() is a method of Math class.
     * This will provide random numbers between 0 and 1.
     * It will not expect any parameters.
     * 
     * Note: These methods are static methods. So, we can call them directly using
     * the class name.
     * 
     * Example: Math.method_name()
     */
    System.out.println(Math.random()); // 0.8912312412
    System.out.println(Math.random()); // 0.1232102131

    /*
     * Math.max(12, 25):
     * max() is a method of Math class.
     * This will provide the maximum of two values.
     * This will expect 2 parameter values.
     */
    System.out.println(Math.max(12, 25));

    /*
     * Math.min(12, 25):
     * min() is a method of Math class.
     * This will provide the minimum of two values.
     * This will expect 2 parameter values.
     */
    System.out.println(Math.min(12, 25));

    /*
     * printf: This method is used to print the formatted output to the console.
     * This is same as println() but only difference is, println() just prints
     * whereas printf() will do formatting and prints.
     * 
     * Example: System.out.printf("Hello World");
     * This will print "Hello World" on console and also PrintStream object.
     * To avoid printing that PrintStream object, we can add .println() after
     * printf() to print the output on the console.
     * 
     * We can use modifiers to format the output and print values.
     * 
     * Here are the modifiers for each types:
     * 
     * For integers => %d
     * For floating point numbers => %f
     * For characters => %c
     * For strings => %s
     * For boolean => %b
     *
     */
    System.out.printf("5 * 2 = 10").println();

    // calculated value using modifier
    System.out.printf("5 * 2 = %d", 5 * 2).println(); // 5 * 2 = 10
    System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5 + 6 + 7).println(); // 5 + 6 + 7 = 18

    /*
     * Note 1:
     * Numbers of parameters passed should be same as the number of modifiers used.
     * Otherwise it will throw an error.
     * 
     * Example:
     * System.out.printf("5 * 2 = %d", 5 * 2).println(); // 5 * 2 = 10
     * here exactly 1 parameter is passed and 1 modifier is used.
     * 
     * Suppose if passed parameters are less than the number of modifiers used, it
     * will throw an error.
     * 
     * Example:
     * System.out.printf("%d + %d + %d = %d", 5, 6, 7).println(); // error
     * 
     * Suppose extra parameters are passed than the specified number of modifiers,
     * then extra parameters will be ignored.
     * 
     * Example:
     * System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5 + 6 + 7, 8).println(); // 5
     * + 6 + 7 = 18 (8 will be ignored)
     * 
     */

    /*
     * Note 2: Datatype of the parameters should match with the modifier.
     * Otherwise it will throw an error.
     * 
     * Example:
     * System.out.printf("%d + %d + %d = %d", "5", "6", "7", 5 + 6 + 7).println();
     * // error because, "5", "6" and "7" are Strings
     * 
     */

    // For strings
    System.out.printf("Hello %s", "Pramod").println();

    // For floating point values
    System.out.printf("%f + %f = %f", 5.0, 6.2, 5.0 + 6.2);

    /*
     * Difference between println() and printf():
     * 
     * println():
     * 1.It has new line character at the end.
     * 2. It is easy to use
     * 3. Doesn;t support formatting
     * 4. Used for printing messages, logs etc.
     * 
     * printf():
     * 1. It doesn't have new line character at the end.
     * 2. Somewhat difficult to use compared to println()
     * 3. Supports formatting
     * 4. Used for formatting the table and text.
     * 
     */
  }
}
