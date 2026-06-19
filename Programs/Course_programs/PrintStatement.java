package Programs.Course_programs;

public class PrintStatement {
  /*
   * There are many predefined methods or functions in java.
   * 
   * System.out.println() is the method used to print something on the console.
   * Note: Case should match. Otherwise it will throw an error.
   * 
   * Example:
   * System.out.println("Hello World");
   * 
   * It will print "Hello World" on the console.
   * Whatever we want to print on the console, should be put under the brackets.
   * 
   * Syntax: rules:
   * Right syntax should be provided to the system. Otherwise they won't
   * understand the instructions.
   * 
   * Statement: Statements are the instructions given to the system to perform
   * certain task.
   * Here System.out.println() is a statement which is used to print something on
   * the console.
   * 
   * int a = 2 + 3;
   * It is statement.
   * 
   * int a = 1;
   * It is also a statement.
   * 
   * In System.out.println(3 * 4), 3 * 4 is an expression which we are passing in
   * predefined method.
   * 
   * Predefined means it is already defined in java language. We are just using
   * this directly.
   * 
   * System.out.println(3 * 4) is a method call and 3 * 4 is a parameter which we
   * are passing to println method.
   * 
   * System: It is a class of java.lang package.
   * out: it is a public static final PrintStream out object of PrintStream class.
   * println: it is a method of PrintStream class.
   * 
   * Note: Method call would be something like this:
   * method_name(parameter)
   * 
   */
  public static void main(String[] args) {
    System.out.println(3 * 4);
    System.out.println("5 * 2 = 10");

    /*
     * Note:
     * println() method has new line inside by default. It means after printing the
     * value, new empty line will be provided.
     * 
     * If we want to print 5 * 2 = 10 as it is on console, then we need to put them
     * in "" (double quotes).
     * We need to define them as String.
     * 
     * String: String is a textual data which is enclosed in double quotes.
     * Example: System.out.println("5 * 2 = 10");
     * => 5 * 2 = 10
     * 
     * If we just pass 3 * 4 inside println method, then it will evaluate the
     * expression and print the result. It will become an expression.
     * Example: System.out.println(3 * 4);
     * => 12
     * 
     * Note: For expressions, spaces doesn't matter while evaluating. Only for
     * string it matters as they are in double quotes and print same as it is.
     * 
     */
    System.out.println(3 * 4);

    /*
    ****************************************************************************************
     */

    /*
     * Escape character: These are used to escape special characters or which
     * performs certain action.
     * Escape character doesn't mean it will not print them. It means characters
     * will be printed without throwing an error
     * 
     * Escape characters used by using back slash (\)
     * 
     * Example: print " in a text
     */
    System.out.println("Hello \"world"); // Hello "world

    /*
     * Example: printing new line (It will print all the text which are after \n to
     * the new line)
     */
    System.out.println("Hello\nworld");
    /*
     * Hello
     * world
     */

    /*
     * Example: print tab space using \t
     * It will provide 1 tab space after the \t
     */
    System.out.println("Hello\tworld"); // Hello world

    /*
     * print \ int text. Use \\ to print 1 \ in the text
     * \\ -> 1 slash
     * \\\\ -> 2 slash
     * \\\\\\ -> 3 slash
     * and so on
     */
    System.out.println("Hello\\\\world"); // Hello\\world (prints 2 slashes)
  }
}
