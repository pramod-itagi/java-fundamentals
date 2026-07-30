package Theory;

public class OperatorAndExpression {
  public static void main(String[] args) {
    /*
     * Operator: Operator is the symbol which performs some operation on operands.
     * 
     * Operand: Operands are the values on which the operation is performed using
     * operator.
     * Operand can be numbers, variables, constants(literals) or expressions.
     * Literals or constants: These are the values which do not change.
     * Example:
     * 10, 20, 1, true, false etc.
     * 
     * Expression: Expression consist of operator and operands.
     * 
     * Integer: These are the whole numbers including 0, negative and positive
     * values without any decimal point.
     * Example: 1, 50, 100, -5, 0 etc
     */

    // Multiplication
    System.out.println(5 * 5);

    // Addition
    System.out.println(5 + 5);

    // Division
    System.out.println(5 / 5);

    // Subtraction
    System.out.println(5 - 5);

    // %: This is used to get remainder. This is called as modulus operator.
    System.out.println(5 % 5);

    /*
     * Note:
     * If dividend (top) value is lesser than divisor(bottom), the result will
     * be top value itself.
     * 
     * If dividend (top) value is greater than divisor(bottom), the result will
     * be the remainder of the division.
     * 
     * Example:
     * 5 % 6 => 5 ( 5 is lesser than 6)
     * 6 % 2 => 0 ( 6 is greater than 2)
     * 
     */

    // Complex operators
    System.out.println(5 + 6 - 1);

    /*
     * Error: Complaining of programming language.
     * 
     * Syntax: Rule or structure. Specific rules need to be applied while writing
     * the code as they don't understand human language.
     */

    System.out.println(5 / 2); // 2
    /*
     * Note: 5 / 2 answer will be 2 because 5 is an integer and 2 is an integer. So,
     * the result will be always an integer.
     * 
     * To get 2.5 as answer, we need to make either one of the operand value to
     * decimal value.
     * Like 5.0 / 2 or 5 / 2.0 or 5.0 / 2.0
     * 
     * System.out.println(5.0 / 2); // 2.5
     * System.out.println(5 / 2.0); // 2.5
     * System.out.println(5.0 / 2.0); // 2.5
     * 
     * Note: If one of the operand is decimal, the result will be decimal.
     * 
     * Decimal value is same as floating value.
     * 
     */
    System.out.println(5.0 / 2); // 2.5
    System.out.println(5 / 2.0); // 2.5
    System.out.println(5.0 / 2.0); // 2.5

    /*
     * Example:
     * integer / integer => integer
     * integer / decimal => decimal
     * decimal / integer => decimal
     * decimal / decimal => decimal
     * 
     * Example:
     * 5 / 2 => 2
     * 5.0 / 2 => 2.5
     * 5 / 2.0 => 2.5
     */

    /*
     * Precedence: The order in which the operators are evaluated. + and - will be
     * executed later. *, /, % will be executed first.
     * 
     * Example:
     * 5 + 5 * 6 => 35
     * 
     * Note: %, /, * have higher precedence than + and -.
     * 
     * (): Use brackets to evaluate an expression first. Before *, /, % operators,
     * brackets will be executed first.
     * 
     * Example:
     * (5 + 5) * 6 => 60
     */
    System.out.println(5 + 5 * 6); // 35
    System.out.println((5 + 5) * 6); // 60
  }
}
