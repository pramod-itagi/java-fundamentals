package Programs.Course_programs;

public class PrintfStatement {
  public static void main(String[] args) {
    /*
     * printf() is used to print the output in a formatted way
     */
    // Example:
    System.out.printf("5 * 2 = 10");
    // Output:
    // 5 * 2 = 10$2 ==> java.io.PrintStream@6a41eaa2
    // It will print Print stream as well without providing new line.

    // To fix this, we can use println() on top of printf() method:
    System.out.printf("5 * 2 = 10").println();
    // Output:
    // 5 * 2 = 10 -> Without any print stream and provides new line as well.

    // We can use printf() to print calculated values well.
    // For this we need to use format specifiers or modifiers:
    // Example:
    // For integer values -> %d
    System.out.printf("5 * 2 = %d", 5 * 2).println();
    // Output:
    // 5 * 2 = 10

    // Example 2: (With multiple format specifiers)
    System.out.printf("%d * %d = %d", 5, 2, 5 * 2).println();

    // Example 3:
    System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5 + 6 + 7).println();

    // Note: If we don't provide enough values for format specifiers, it will throw
    // an error.
    // Example:
    // System.out.printf("%d + %d + %d = %d", 5, 6, 7).println();
    // Output:
    // Exception in thread "main" java.util.MissingFormatArgumentException: Format
    // specifier

    // But if we provide more values than format specifiers, it will ignore the
    // extra values.
    // Example:
    System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5 + 6 + 7, 8, 9).println();
    // Output:
    // 5 + 6 + 7 = 18. 9 will be ignored.

    /*
     * For String values -> %s
     */
    // Example:
    System.out.printf("Hello %s", "Pramod").println();

    // Example 2: (If we don't provide enough values, it will throw an error)
    System.out.printf("Hello %s and %s", "Pramod").println();
    // Hello Pramod and
    // Exception java.util.MissingFormatArgumentException: Format specifier '%s'

    /*
     * For String values -> %f
     */
    // Example:
    System.out.printf("%f + %f + %f = %f", 5.0, 6.0, 7.0, 5.0 + 6.0 + 7.0).println();
    // Output:
    // 5.000000 + 6.000000 + 7.000000 = 18.000000

    // Example 2: (If we don't provide enough values, it will throw an error)
    System.out.printf("%f + %f + %f = %f", 5.0, 6.0, 7.0).println();
    // Output:
    // Exception java.util.MissingFormatArgumentException: Format specifier '%f'

    // Example 3: (To reduce the decimal values, use %.2f. It means after decimal
    // point, only 2 values will be there)
    // Example:
    System.out.printf("%.2f + %.2f = %.2f", 5.3, 6.4, 5.3 + 6.4).println();
    // Output:
    // 5.30 + 6.40 = 11.70

    // When all values are of different specifiers
    System.out.printf("%d + %.2f = %.2f", 5, 6.1, 5 + 6.1).println();
    // Output:
    // 5 + 6.10 = 11.10

    // Example using printf and println to print values:
    // println()
    System.out.println("Values are: " + 15 + " and " + 20);

    // printf()
    System.out.printf("Values are: %d and %d", 15, 20).println();
  }
}
