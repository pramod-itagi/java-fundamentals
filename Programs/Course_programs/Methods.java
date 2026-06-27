package Programs.Course_programs;

public class Methods {
  // Method definition (defining a method)
  static void printHelloWorldTwice() {
    System.out.println("Hello World");
    System.out.println("Hello World");
  }

  // Method definition (defining a method) with parameter
  static void printHelloWorldTimes(int noOfTimes) {
    for (int i = 0; i < noOfTimes; i++) {
      System.out.println("Hello World");
    }
  }

  // Method overloading
  static void print(String name) {
    System.out.println("Hello " + name);
  }

  static void print() {
    System.out.println("Hello user");
  }

  public static void main(String[] args) {
    /*
     * Method: Method is a block og instructions which performs certain task when
     * the method is called by using the name of the method.
     * 
     * Method are also called as functions
     */

    /*
     * Syntax:
     * returnType methodName() {
     * statements (body of the method);
     * }
     * 
     * returnType: It is the datatype which we are providing to method.
     * 
     * Example:
     * byte, short, int, long, float, double: If we are performing any calculations
     * and returning calculated value. Datatype will be based on type of value which
     * we are returning.
     * 
     * char: If we are returning any character.
     * 
     * boolean: If we are returning any boolean values like true or false
     * 
     * void: If we are not returning anything
     */

    /*
     * Generally 2 steps are involved for methods.
     * 
     * 1. Defining a method
     * 2. Calling a method
     * 
     * 1. Defining a method: Where we need to define a method with the return type
     * and name of the method and method body.
     * In our case, method is defined above the main method with method name
     * printHelloWorldTwice()
     * 
     * 2. Calling a method: We need to call a method by using method name to invoke
     * the method and to execute instructions. It need to have brackets(). Otherwise
     * it will consider that as a variable.
     * 
     */

    // calling (invoking) a method:
    printHelloWorldTwice();

    /*
     * Rules for naming a method
     * 1. It can contain alphabets(a-z, A-Z), numbers(0-9), underscore(_) and $.
     * 
     * 2. It should not start with numbers.
     * Example: void 7printHelloWorld = 10; -> wrong
     * 
     * 3. It should not be a keyword.
     * Example: void for() -> wrong because for is a keyword.
     * 
     * 4. It should be camelCase.
     * void methodName() -> Correct
     * void MethodName() -> Wrong
     * 
     * 5. There is no limit for the length of the method name.
     * 
     * 6. Should have proper name.
     * Example:
     * void a() -> Not a good practice
     * void print() -> Good
     */

    /*
     * Parameterized method:
     * 
     * We can pass the arguments to the method if method can accept parameters and
     * we can use same parameters in the method block as well.
     * 
     * Syntax:
     * 
     * Defining method with parameter:
     * returnType methodName(datatype parameterName) {
     * statements (body of the method);
     * }
     * 
     * Calling method by passing argument:
     * methodName(arguments)
     */

    // calling method with argument
    printHelloWorldTimes(5); // 5 times "Hello World" will get printed

    /*
     * Note to remember:
     * 
     * Actual -> Argument
     * Placeholder -> Parameter
     * 
     * or
     * 
     * makePizza(topping) -> topping is parameter
     * makePizza("cheese") -> "cheese" is argument
     * 
     */

    /*
     * Note:
     * 1.If we define a method with parameter and if we don't pass any argument
     * while calling method, it will throw an error.
     * 
     * 2. Datatype of argument and parameter should match. Otherwise it will throw
     * an error.
     * Example: void print(int num) {
     * }
     * 
     * print(5) -> Correct
     * print("a") -> Error
     * 
     * 3. Argument and parameter count and order should match.Otherwise it will
     * throw an error.
     * Example: void print(int num1, char ch) {
     * }
     * 
     * print(5, 'A') -> Correct
     * print('A', 5) -> Error
     */

    /*
     * Method overloading: Overloading a method by having a same method name but
     * differ in parameter.
     * Advantage of this method overloading is, we can have multiple methods with
     * same name. Just differ in parameters. It will allow us to call both methods
     * without changing actual code.
     */

    print("Pramod"); // Hello Pramod
    print(); // Hello user
  }
}
