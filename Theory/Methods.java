package Theory;

public class Methods {
  // Defining a method
  // Making this as a static as we are not creating an object of the class.
  static void printHelloWorldTwice() {
    System.out.println("Hello World");
    System.out.println("Hello World");
  }

  // Method with a parameter
  static void printHelloWorld(int times) {
    for (int i = 1; i <= times; i++) {
      System.out.println("Hello World by passing arguments");
    }
  }

  // With argument
  static void sayHello(String name) {
    System.out.printf("Hello %s", name).println();
  }

  // Without argument
  static void sayHello() {
    System.out.printf("Hello World").println();
  }

  // Defining method with 2 parameters
  static void sumOfTwoNumbers(int num1, int num2) {
    System.out.println(num1 + num2);
  }

  // Defining method with 3 parameters
  static void sumOfThreeNumbers(int num1, int num2, int num3) {
    System.out.println(num1 + num2 + num3);
  }

  // Defining method with 2 parameters with return value
  static int sumOfTwoNumbersWithReturnValue(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }

  public static void main(String[] args) {
    /*
     * Methods: Methods are small blocks of code that do a specific job.
     * The code inside a method only runs when you call that method using its name.
     * 
     * There are two main things about methods:
     * 1. Defining a method (creating it)
     * 2. Calling a method (using it)
     * 
     * 1. Defining a method means writing the code for the method.
     * 
     * How to define a method:
     * returnType methodName() {
     * // code goes here
     * }
     * 
     * The "returnType" is the type of value the method will give back.
     * Remember: you must include brackets when you define a method.
     * If you forget the brackets, you’ll get an error.
     * 
     * void:
     * Use "void" if you don’t want the method to give back any value.
     * void just runs the code inside the method and doesn’t return anything.
     * 
     * 2. Calling a method means telling the method to do its job.
     * 
     * How to call a method:
     * methodName();
     * 
     * If you don’t call the method, the code in it won’t run.
     */

    // This is how you call a method.
    // Remember: you need the brackets, or else you’ll get an error.
    Methods.printHelloWorldTwice();

    /*
     * Rules for method names:
     * 1. Method names can use letters (big or small), numbers, underscores (_), and
     * dollar signs ($).
     * Example:
     * void printMessage() { }
     * int calculate_sum() { }
     *
     * 2. Method names can’t start with a number.
     * Example:
     * void 1processData() { } // Error
     *
     * 3. It’s best to use camelCase for method names (first word lowercase, next
     * words start with capital letter).
     * Example:
     * void processStudentMarks() { } // Preferred
     * void process_student_marks() { } // Allowed but not the usual way
     *
     * 4. You cannot use Java’s special words (like "class" or "static") as method
     * names.
     * Example:
     * void class() { } // Error
     * void static() { } // Error
     *
     * 5. Method names can be as long as you want.
     * Example:
     * void calculateSumOfAllStudentScoresInClass() { }
     *
     * 6. Use names that explain what your method does.
     * Example:
     * void ab() { } // Not clear
     * void printDetails() { } // Good name
     */

    /*
     * Argument: (Actual value)
     * An argument is the real value you send to a method when you call it.
     * 
     * Example:
     * printHelloWorld(2); // 2 is the argument here.
     */

    /*
     * Parameter: (Placeholder)
     * A parameter is a variable in the method’s definition that takes the value you
     * send (the argument).
     * Parameters have a type and a name, and you use them inside the method.
     * When you call the method, the argument you give fills in the parameter.
     * 
     * Example:
     * void printHelloWorld(int times) {
     * System.out.println(times);
     * }
     */

    // Here is how you call a method with an argument:
    Methods.printHelloWorld(2);

    /*
     * Note:
     * 1. If a method needs an argument and you don’t give it one,
     * you’ll get an error.
     * Example:
     * void print(int a) {
     * }
     * 
     * Calling it without an argument:
     * print(); // Error
     * 
     * 2. Argument and parameter type should be same and should be in same order.
     * Otherwise it will throw an error.
     * 
     * Example:
     * void print(int a) {
     * }
     * 
     * Calling it by passing string:
     * print("hello"); // Error
     */

    /*
     * Method overloading: This means you can have more than one method with the
     * same name,
     * but with different parameters (they can have different number or types of
     * parameters).
     * When you call the method, Java will decide which one to use based on the
     * arguments you give.
     * 
     * Example:
     * void print(int a) {
     * }
     * 
     * Calling this with an argument:
     * print(5);
     * 
     * and another method:
     * 
     * void print() {
     * }
     * 
     * Calling this without any argument:
     * print();
     * 
     */
    Methods.sayHello("Pramod"); // with an argument
    Methods.sayHello(); // without any argument

    /*
     * Passing multiple parameters:
     * We can pass multiple parameters to the method.
     */

    // Accepting 2 parameters
    Methods.sumOfTwoNumbers(2, 3);
    // Accepting 3 parameters
    Methods.sumOfThreeNumbers(2, 3, 4);

    // Accepting 2 parameters
    int total = Methods.sumOfTwoNumbersWithReturnValue(2, 3);
    System.out.println(total);

    /*
     * Returning a value to method:
     * We can define data types other than void to return the value from method to
     * main or to the place where it is called. This is because void will not return
     * any value.
     * 
     * Note: The type of the value which we are returning to the method call should
     * be same as the type defined for the method definition. Otherwise, it will
     * throw an error.
     * 
     * To return the values to the calling method, we need to use return keyword,
     * followed by variable or value.
     * 
     * Syntax:
     * 
     * int sum(int a, int b) {
     * int sum = a + b;
     * return sum;
     * }
     * 
     * Passing an argument and storing return value:
     * int sumOfTwoNumbers = sum(2, 3);
     * 
     * Here when sum value is returned from the method, it will get stored in the
     * sumOfTwoNumbers variable and can be used for further calculation or usages.
     * 
     */
    int max = Math.max(2, 3); // Calling Math.max method and storing the result in max
    System.out.println(max);
  }
}
