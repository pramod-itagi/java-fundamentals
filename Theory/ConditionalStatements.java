package Theory;

public class ConditionalStatements {
  public static void main(String[] args) {
    /*
     * Conditional statements evaluate to either true or false.
     * Depending on the outcome, they alter the program's control flow or execution
     * path.
     *
     * This is why conditional statements are important in programming.
     * Conditional statements are used to make decisions in a program.
     * 
     * Conditional statements return boolean value. i.e true or false
     */

    // Example:
    int i = 10;
    System.out.println(i < 5); // false
    System.out.println(i > 5); // true

    /*
     * Conditional operators are:
     * > : greater than
     * < : less than
     * >= : greater than or equal to
     * <= : less than or equal to
     * == : equal to
     * != : not equal to
     * 
     * Note:
     * = -> is assignment operator
     * == -> is conditional operator
     */

    /*
     * if condition: if condition is used to check the condition. Based on the
     * condition result, we can change the flow of the program.
     * 
     * if condition is true, the code inside the if block will be executed.
     * if condition is false, the code inside the if block will not be executed and
     * skips the block.
     * 
     * Syntax:
     * if (condition) {
     * // code to be executed if condition is true.
     * }
     */

    /* Semicolon: semicolon n java is used to end the statement */
    int j = 5;
    if (j == 5)
      System.out.println("j is odd");
    System.out.println("j is prime");

    /*
     * Note: if() statements can have only 1 statements under it. Hence, when j
     * becomes 6, "j is prime" is only printed. If we want to execute both
     * statements, we need to use blocks.
     * 
     * if only 1 statement need to be executed, we can use if() without blocks. For
     * multiple statements, use {} (blocks).
     * 
     * Recommended is to use blocks even for single or simple if() statements.
     */

    /*
     * block: {}
     * blocks are used to execute multiple statements.
     * They are represented by using {} (flower braces).
     * 
     */
    if (j == 5) {
      System.out.println("j is odd");
    }
    System.out.println("j is prime");
  }
}
