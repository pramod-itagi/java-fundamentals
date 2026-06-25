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
  }
}
