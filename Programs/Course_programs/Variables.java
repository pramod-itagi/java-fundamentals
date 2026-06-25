package Programs.Course_programs;

public class Variables {
  public static void main(String[] args) {
    /*
     * Variables: Variable is the container which can hold value. It can be used
     * anywhere in the program and value can change during the execution of the
     * program.
     */

    // Syntax:
    // Declare:
    // dataType variableName = value;

    // Example:
    // Here we are declaring a variable called 'a' of type integer and we are
    // assigning value 5 to it.
    // This 'a' can be used anywhere.
    // Here 5 is the initial value.
    int a = 5;
    System.out.println(a);

    // Assignment:
    // Syntax:
    // variableName = value;

    // Example:
    a = 10; // Here we are assigning new value 10 to variable 'a'
    System.out.println(a);

    // Using variable in printf statement:
    System.out.printf("%d * %d = %d", a, 1, a * 1).println();

    // update variable value:
    a = 20;

    System.out.printf("%d * %d = %d", a, 1, a * 1).println();
  }
}
