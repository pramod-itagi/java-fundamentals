package Programs.Course_programs;

public class StringOperations {
  public static void main(String[] args) {
    /*
     * String: String is a textual data which is enclosed in double quotes.
     * Example: System.out.println("Pramod");
     * => "Pramod"
     */

    /*
     * String concatenation: Adding or combining the string.
     */

    // Example:
    System.out.println(1 + "2");
    // "12"
    // As one of the operand is string, so it will not add the values, instead it
    // will concatenate.

    // Example 2:
    System.out.println("1" + 2);
    // "12" -> It performs concatenation as first operand is string.

    /*
     * Note: + plays 2 different roles here.
     * 1. If all the operands are integers, then it will perform "addition"
     * 2. If any of the operand is string, it will perform "concatenation"
     */

    // Example 3:
    System.out.println(1 + 2 + "3");
    // "33".

    // Note: As execution happens from left to right, 1 + 2 gets added and it
    // becomes 3. Once it finds "3", it will get concatenated.

    // Example 4:
    System.out.println("1" + 2 + 3);
    // "123".

    // Note: As execution happens from left to right, as first operand is string,
    // remaining operands also gets concatenated.

    // Note: We can use brackets to perform executions first.
    // Note: We can perform concatenation for alphabets as well.

    // Example:
    System.out.println("ABC" + "DEF");

    // Printing value of a variable:
    int a = 10;
    System.out.println("Value of a: " + a);
    // Value of a: 10
    // Here after the string, a value will get concatenated here.
  }
}
