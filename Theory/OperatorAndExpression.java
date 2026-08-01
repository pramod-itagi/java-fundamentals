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

    /*
     * Assignment Operator: =
     * This is used to assign a value to a variable.
     * 
     * Example:
     * int a = 10;
     * 
     * Note: Assignment operator is used to assign a value to a variable. It is not
     * used to compare values.
     * 
     * Note: left hand side should be a variable and right hand side should be a
     * value or variable having value.
     * Example:
     * int a = 10;
     * a = 20 // Valid
     * a = 20 + a; // Valid
     * 20 = a; // Error
     * 
     * 
     */

    /*
     * If we assign a value to a variable, the previous value will be overwritten.
     * We will not be able to retrieve the previous value.
     */
    int a = 10;
    int b = 20;
    a = b;
    System.out.println(a); // 20
    System.out.println(b); // 20

    // We can perform operations using same variable and assign the result to the
    // same variable.
    a = a + b;
    a = a + a; // Increment
    a = a - a; // Decrement

    /*
     * Compound assignment operator: If we are performing operation on same variable
     * and assign the result to the same variable, we can use compound assignment
     * operator.
     * 
     * Compound operation refers to having multiple operators to evaluate an
     * expression.
     * 
     * Example:
     * int i = 0;
     * i = i + 2;
     * 
     * Compound operation will be:
     * i += 2;
     * 
     * Note: +=, -=, *=, /=, %= are the shortcut operators.
     * 
     */

    int i = 0;
    i += 1;
    System.out.println(i); // 1
    i -= 1;
    System.out.println(i); // 0
    i *= 2;
    System.out.println(i); // 2
    i /= 2;
    System.out.println(i); // 1
    i %= 2;
    System.out.println(i); // 1

    /*
     * Pre increment and post increment:
     * If we are appending the operand by 1 and assigning the result to the same
     * variable, we can use pre increment and post increment operator.
     * 
     * Example:
     * int i = 0;
     * i++; // Post increment
     * ++i; // Pre increment
     * 
     * Note: These pre and post operations should be used only when we are
     * incrementing or decrementing the value by 1.
     * 
     * Note: Pre increment and post increment are different.
     * Pre increment: Increment the value and then use the new value.
     * Post increment: Use the old value and then increment the value.
     *
     */
    int j = 0;
    System.out.println(j++); // It will return 0 because it is post increment.
    System.out.println(j); // j = 1 Now it will print incremented value.

    // Pre increment
    int k = 0;
    System.out.println(++k); // It will return 1 because it is pre increment.
    System.out.println(k); // k = 1 Now it will print incremented value.

    // Pre decrement
    int l = 0;
    System.out.println(--l); // It will return -1 because it is pre decrement.
    System.out.println(l); // l = -1 Now it will print decremented value.

    // Post decrement
    int m = 0;
    System.out.println(m--); // It will return 0 because it is post decrement.
    System.out.println(m); // m = -1 Now it will print decremented value.
  }
}
