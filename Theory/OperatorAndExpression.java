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
  }
}
