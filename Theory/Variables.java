package Theory;

public class Variables {
  public static void main(String[] args) {
    /*
     * Variable: Variable is the container where we an store any value and the
     * variable can be changed during execution of the program or same variable can
     * be used anywhere in the program.
     * 
     * Syntax:
     * dataType nameOfTheVariable = value;
     * 
     * Example:
     * int number = 10;
     */

    // Declaration: Where we are specifying the type, name and initial value of the
    // variable.
    int number = 10;
    System.out.println(number); // 10

    // Assignment: Where we are assigning a value to the variable.
    number = 11;
    System.out.println(number); // 11

    /*
     * Note:
     * 1. If we try to use the variable which is not declared, it will throw an
     * error.
     * Example:
     * number2 = 25; // Error as number2 is not declared.
     * 
     * 2. We cannot declare a variable without initial value. It will throw an
     * error.
     * Example:
     * int undeclared; // Error
     * 
     * 3. Type used to declare a variable should match with the value assigned. If
     * both are different, it will throw an error.
     * 
     * This is why Java is called as "Strongly typed language" as we cannot store
     * other type values in a variable which is already declared with different
     * type.
     * 
     * Example:
     * int a = 10; // Correct
     * int a = "10"; // Error as declared type is int and assigning String value.
     */

    int abc = 50;
    int def = 10;
    System.out.println(abc);
    System.out.println(def);
    /*
     * How variables are stored in memory:
     *
     * When we declare variables (for example: int abc = 50; int def = 10;), space
     * is allocated in memory for them.
     * Here’s a sample representation:
     * Mem Val Var
     * 5001
     * 5005 50 abc
     * 5009
     * 5013 10 def
     *
     * The value 50 is stored at memory address 5005 for abc, and 10 is stored at
     * address 5013 for def.
     * Whenever we access abc, the program fetches the value from memory location
     * 5005, and for def, from 5013.
     * 
     * Each variable will have unique memory address, variable name and value.
     * 
     * Whenever we update abc or def with different value using
     * abc = 100; or def = 200;
     * the value will be updated in the memory location and the variable will refer
     * to the new value.
     * 
     * Mem Val Var
     * 5001
     * 5005 100 abc
     * 5009
     * 5013 200 def
     * 
     */
    int xyz = abc + def;
    System.out.println(xyz);
    /*
     * For the above, the value of xyz will be 60 and it will be stored at memory
     * address 5017.
     * During this time abc and def will still refer to the original values 50 and
     * 10 respectively.
     */

    /*
     * Guidelines for naming variables:
     * 1. Variable names can include letters (both uppercase and lowercase), digits,
     * underscores (_), and dollar signs ($).
     * Example:
     * int variableName;
     * float number_value;
     *
     * 2. Variable names cannot begin with a number.
     * Example (invalid): int 3number = 10;
     *
     * 3. It is recommended to use camelCase for variable names. Compiler will not
     * complain even if use snake_case but recommended to use camelCase
     * Example:
     * int thisIsAVariableName = value;
     *
     * 4. Reserved Java keywords cannot be used as variable names.
     * Example (invalid):
     * int for = 10;
     * int main = 20;
     *
     * The above examples use reserved keywords, which are not allowed for variable
     * names.
     * 
     * 5. Variable names can be of any length.
     * Example:
     * int thisIsABigVariableNameUsedForDeclaring = 10;
     * 
     * 6. Variable name should have meaning and should serve purpose.
     * Example:
     * int a = 10; // Not suggested
     * int number = 10; // Valid
     */

    /*
     * Note:
     * We can declare many variables in a single line. But make sure that all the
     * variables should follow same data type.
     */
    int x, y, z;
    double db = 50.0, bd = 99.0;

    /*
     * We can assign values to variables later as well
     */
    x = 10;
    y = 20;
    z = 30;

    System.out.println(x + " , " + y + " , " + z);
    System.out.println(db + " , " + bd);

    /*
     * Scope of the variable:
     * 
     * Variables have different scope. Variables which are defined in blocks {} are
     * accessible to only that block.
     * Variables which are defined in main method are accessible thought the
     * program.
     * If we try to access the variable out out the block and if that variable is
     * defined inside the block, then we will get compilation error.
     * 
     */
    {
      int test = 10;
      System.out.println(test);
    }
    // System.out.println(test); <- this will throw an error

    /*
     * Final keyword:
     * Final keyword is used to declare a variable whose value cannot be changed
     * during the execution of the program. If we are sure that value will remain
     * same throughout the program, then we can declare it with final keyword.
     * 
     * Syntax:
     * final dataType nameOfTheVariable = value;
     * 
     * Example:
     * final int MAX_VALUE = 100;
     * final double PI = 3.14;
     * final String NAME = "John";
     * 
     * Note:
     * We cannot change the value of a constant declared with final keyword.
     * Example: MAX_VALUE = 200; // Error
     * 
     * for Constants, we can use uppercase letters for variable name.
     * 
     * Example:
     * final int MAX_VALUE = 100;
     * final double PI = 3.14;
     *
     */
    final int MAX_VALUE = 100;
    System.out.println(MAX_VALUE);

    /*
     * Chain assignment:
     * 
     * Chain assignment refers to assigning of the right most value to the left side
     * and the assignment continues till left most variable.
     * First we need to declare the variables and then we can use chain assignment.
     * 
     * Example:
     * int a,b,c
     * a = b = c = 10;
     * 
     * Here, the value 10 will be assigned to all the three variables a, b and c.
     * 
     */
    int a1, a2, a3;
    a1 = a2 = a3 = 10;
    System.out.println(a1 + " , " + a2 + " , " + a3);

    int b1 = 20; // this value will not be used
    int b2, b3;
    b1 = b2 = b3 = 100;
    System.out.println(b1 + " , " + b2 + " , " + b3);
  }
}
