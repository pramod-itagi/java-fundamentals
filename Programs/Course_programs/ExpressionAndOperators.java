class ExpressionAndOperators {
  public static void main(String[] args) {
    /*
     * Example of arithmetic operators
     * 
     * Example:
     * 5 * 5 = 25
     * 
     * But 5 X 5 = 25 is not correct because X is not an operator in Java. The
     * correct operator for multiplication is *.
     * 
     * 5 * 5 is called an expression. An expression is a combination operators and
     * operands that evaluates to a single value. In this case, the expression 5 * 5
     * evaluates to 25.
     * 
     * 5 is also called as Literal. A literal is a fixed value that will not change.
     * 
     * Other examples of arithmetic operators are:
     * * Addition: +
     * * Subtraction: -
     * * Division: /
     * * Multiplication: *
     * * Modulus: % ( Which gives the remainder of a division operation )
     * 
     * Note:
     * If 5 % 6 (If divisor is lesser than dividend, then the result will be always
     * dividend. In this case, 5 % 6 will give 5 )
     * If 6 % 5 (If divisor is greater than dividend, then the result will be the
     * remainder. In this case, 6 % 5 will give 1 )
     * 
     * Example:
     * * 10 + 5 = 15
     * * 10 - 5 = 5
     * * 10 / 5 = 2
     * * 10 * 5 = 50
     * * 10 % 5 = 0
     * 
     * Integer numbers are whole numbers without decimal values. it can be positive
     * or negative and zero. Examples of integer numbers are -5, 0, 10, 100, etc.
     * 
     * 5 ** 6 is not a valid expression in Java because ** is not an operator in
     * Java.
     * 
     * Complaining of programming language is called as an "Error".
     * 
     * Java has predefined set of operators and those operators have to be used
     * otherwise it will give an error.
     * 
     * Type of the result after performing an operation:
     * 5 / 2 => 2 (because both are integer)
     * 
     * To get floating exact value, divide the integer by floating point value or
     * decimal value.
     * 5 / 2.0 => 2.5 (because 2.0 is a floating point value)
     * Note: Any operand should be a floating point value to get the result in
     * floating point value.
     * 5.0 / 2.0 => 2.5 (because both are floating point values)
     * 
     * Table as follows:
     * integer / integer => integer
     * integer / floating point => floating point
     * floating point / integer => floating point
     * floating point / floating point => floating point
     * 
     * Precedence of operators: (Order of operations)
     * The order in which operators are executed.
     * parenthesis > multiplication/division/modulus > addition/subtraction
     * Example: () > * / % > + -
     * 
     * Brackets have highest precedence.
     * Then comes Multiplication, Division and Modulus
     * last it comes Addition and Subtraction
     * 
     * 5 - 2 * 2 = 1 (because multiplication has higher precedence than subtraction)
     * 
     * using brackets:
     * (5 - 2) * 2 = 6 (because brackets have higher precedence than multiplication)
     * Brackets will be executed first.
     */

    /*
     * Assignment operator: Assigning the value:
     * Example:
     * i = j
     * 
     * As per mathematics, it is equal but in programming languages, it is
     * assignment. Here we are copying the value of j to the value of i.
     */

    // Example:
    int i = 10;
    int j = 20;
    i = j;
    System.out.println(i);
    System.out.println(j);
    // The i value will become 20 because we are copying the value of j into i.
    // j value will remain same 20. Previous value of i (10) will get lost and we
    // will not be able to retrieve it again.

    // Note: During assignment, left side value should be a variable always. Right
    // side can be a variable or value because variable will be containing the value
    // as well.

    // Example:
    // 10 = a; -> Wrong
    // a = 10; -> Right

    // Assignment using expression
    System.out.println(j = i + 2);
    System.out.println(i = i * 2);
    System.out.println(i = i + i);
    System.out.println(i = i - i);

    /*
     * Increment/decrement operation: We can perform increment/decrement operation
     * is two ways.
     * 1. i = i + 1
     * 2. i++ (This will be same as i = i + 1. This is shortcut)
     * 
     * Same for decrement
     * 1. i = i - 1;
     * 2. i--;
     */

    /*
     * Note:
     * 1. These holds good only if we are using same variable to perform operation
     * and storing the result in same variable.
     * 2. i++ and i--. These works only if we are incrementing/decrementing by 1.
     * Example:
     * i++ -> Works
     * i+2 -> No
     * 
     */

    /*
     * Pre and post increment/decrement operators:
     * 1. Pre increment/decrement: Evaluate first (increment/decrement) and then
     * return new value.
     * 2. Post increment/decrement: Return the old value first and then evaluate
     * (increment/decrement).
     * 
     * Syntax for pre increment/decrement
     * ++i or --i
     * 
     * Syntax for post increment/decrement
     * i++ or i--
     */

    /*
     * Compound assignment operators: Here it is similar to increment or decrement
     * except that, here if we want to perform operation other than
     * increment/decrement on same variable and store result, we can make use of
     * shortcut. Variable on left and right side should be same.
     * 
     * For i = i * 2
     * -> i *= 2
     * 
     * For i = i / 2
     * -> i /= 2
     * 
     * For i = i + 3
     * -> i += 3
     * 
     * For i = i - 7
     * -> i -= 7
     * 
     * For i = i % 3
     * -> i %= 3
     */

    /*
     * Comparison operators: These operators are used to compare the values. These
     * will return boolean true or false value.
     * 
     * Example:
     * int i = 5;
     * == : Equal to
     * i == 5 -> true
     * 
     * != : Not Equal to
     * i != 4 -> true
     * 
     * < : less than
     * i < 4 -> false
     * 
     * > : greater than
     * i > 4 -> true
     * 
     * <= : less than or equal to
     * i <= 4 -> false
     * 
     * >= : greater than or equal to
     * i >= 4 -> true
     */
  }
}
