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
     * if:
     * if condition is used to check the condition. Based on the
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

    /*
     * if/else:
     * if/else is used to check the condition. If the condition is true, the code
     * inside the if block will be executed. If the condition is false, the code
     * inside the else block will be executed.
     * 
     * This is simple if/else statement where only one condition is checked that too
     * in if condition only.
     * 
     * Syntax:
     * if (condition) {
     * // code to be executed if condition is true.
     * } else {
     * // code to be executed if condition is false.
     * }
     */

    int num = 10;
    if (num % 2 == 0) {
      System.out.println("num is even");
    } else {
      System.out.println("num is odd");
    }

    /*
     * if/else if/else:
     * if/else if/else is used to check multiple conditions at different stages.
     * 
     * If the first condition is true, the code inside the if block will be
     * executed.
     * If the first condition is false, then it will check for second condition in
     * else if block.
     * If the second condition is true, the code inside the else if block will be
     * executed.
     * If the second condition is false, then else block will be executed.
     * 
     * Note:
     * We can have multiple else if blocks. But only one else block.
     * 
     * Note:
     * Once condition matches, control will come out of the conditional statement
     * and other statements
     * checks are skipped.
     * 
     * Syntax:
     * if (condition) {
     * // code to be executed if condition is true.
     * } else if (condition) {
     * // code to be executed if condition is true.
     * } else {
     * // code to be executed if condition is false.
     * }
     */

    int num2 = 10;
    if (num2 % 2 == 0) {
      System.out.println("num2 is even");
    } else if (num2 % 3 == 0) {
      System.out.println("num2 is divisible by 3");
    } else {
      System.out.println("num2 is neither even nor divisible by 3");
    }

    // Example for multiple else if blocks:
    int num3 = 10;
    if (num3 % 2 == 0) {
      System.out.println("num3 is even");
    } else if (num3 % 3 == 0) {
      System.out.println("num3 is divisible by 3");
    } else if (num3 % 5 == 0) {
      System.out.println("num3 is divisible by 5");
    } else {
      System.out.println("Number is not divisible by 2, 3 or 5");
    }

    /*
     * Switch:
     * Switch is used to check the condition. It is used to check the value of the
     * variable against the case values.
     * If the value matches, the code inside the case block will be executed.
     * If the value does not match, the code inside the default block will be
     * executed.
     * 
     * Note:
     * Once the case is matched, after executing the code, we need to add break or
     * return to come out of the switch statement. Otherwise, it will continue to
     * execute the next case blocks.
     * 
     * Note:
     * This is an alternative to nested if/else statements and more efficient.
     * 
     * Note:
     * default statement can be at any place. If none of the condition matches, by
     * default, "default" will get executed irrespective of the position.
     * 
     * Syntax:
     * switch (expression) {
     * case value:
     * // code to be executed if expression matches value.
     * break;
     * default:
     * // code to be executed if expression does not match any case.
     * break;
     * }
     */
    int ch = 1;
    switch (ch) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      default:
        System.out.println("Invalid");
        break;
    }

    /*
     * Fall through:
     * If we don't add break statement, it will continue to execute the next case
     * blocks.
     * This is called fall through.
     */
    int ch1 = 10;
    switch (ch1) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      case 10:
      case 11:
        System.out.println("Ten or Eleven");
        break;
      default:
        System.out.println("Invalid");
        break;
    }
    /*
     * From the above example, we can see that if we don't add break statement, it
     * will continue to execute the next case blocks until it finds a break
     * statement or default statement.
     * 
     * Hence, it will print "Ten or Eleven" for both 10 and 11.
     * 
     * Note:
     * Switch supports only below values:
     * - int
     * - char
     * - byte
     * - short
     * - String
     * - enum
     * 
     * long, float, double and boolean is not supported.
     * 
     * Note:
     * Under the switch(ch) -> ch should be a variable which will be checking with
     * case values.
     * Case values should not be an expression or conditions.
     */

    /*
     * Ternary operator:
     * Ternary operator is a shorthand way to write if/else statements. If the
     * condition is true, the expression before : will be executed. If the condition
     * is false, the expression after : will be executed.
     * 
     * Syntax:
     * condition ? statement1 : statement2;
     * 
     * Note:
     * statement1 and statement2 should be of same type. If not, it will give
     * compilation error.
     * 
     */
    int n = 10;
    String result = n % 2 == 0 ? "Even" : "Odd";
    System.out.println(result);

    // the same can be written in if/else statement:
    int n1 = 10;
    String result1 = "";
    if (n1 % 2 == 0) {
      result1 = "Even";
    } else {
      result1 = "Odd";
    }
    System.out.println(result1);
  }
}
