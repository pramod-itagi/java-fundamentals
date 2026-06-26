package Programs.Quiz_programs;

public class VariableQuiz {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    int c = 15;

    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // Modify value of a
    a = 20;

    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // modify value of b:
    b = 11;

    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // Note: If we try to use undeclared variable, it will throw an error.
    // Example:
    // System.out.printf("%d + %d + %d = %d", a, b, c, d).println();
    // Output:
    // Exception in thread "main" java.lang.Error: Unresolved compilation problem:
    // d cannot be resolved to a variable

    // Note: While declaring a variable, data type and value which we are assigning
    // should match. Otherwise it will throw an error.
    // Example:
    // int a = 5.5; // Here we are trying to assign double value to integer
    // Output:
    // Error: incompatible types: possible lossy conversion from double to int

    /*
     * Java is strongly typed language. It means whatever the data type we are using
     * for the variable while declaration, same type of value should be passed. We
     * cannot pass different type of value to a variable.
     * Hence it is called as "Strongly Typed"
     */

    // We can use already declared variable and assign it to another variable. But
    // the data type should match.
    // Example:
    int d = a;
    // Here we are assigning value of variable 'a' to variable 'd'. Both are of same
    // data type (int). Hence it is valid.

    /*
     * Memory allocation:
     * Memory
     * allocation Value Name
     * 5001 5 a
     * 5002 10 b
     * 
     * 5003 100 c
     * nt a = 5;
     * a will get stored under Name column
     * When we say
     * a = 100, 100 will get stored in memory location where a is pointing to. In
     * our case, it will get stored in
     * 5001 memory location as 'a' is pointing to that location.
     * 
     * Same for 'b'.
     * 
     * When we perform
     * int c = a + b;
     * a value is 100 and b value is 10, so total is 110
     * 110 will get stored in one of the memory location, in our case it's 5003 and
     * we are referencing that with memory location name 'c'
     * 
     * Note: Type of the variable cannot be changed during execution of the program.
     */

    /*
     * Rules for naming a variable
     1. It can contain alphabets(a-z, A-Z), numbers(0-9), underscore(_) and $
     2. It should not start with numbers
     Example: int 7a = 10; -> wrong
     3. It should not be a keyword
     Example: int for = 10; -> wrong because for is a keyword.
     4. It should be camelCase
     int variableName = 10 -> Correct
     int VariableName = 10 -> Wrong
     5. There is no limit for the length of the variable
     6. Should have proper name
     Example: 
     int a = 10 -> Not a good practice
     int value = 10 -> Good
     */
     
}
