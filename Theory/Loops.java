package Theory;

public class Loops {
  public static void main(String[] args) {
    /*
     * Loops are used to perform a task multiple times
     * Loops are used to iterate over a collection of data.
     * 
     */

    /*
     * for loop:
     * for loop is used to iterate over a collection of data for a specific number
     * of times.
     * 
     * Syntax:
     * for(initialization:condition:update) {
     * // code to be executed.
     * }
     * 
     * initialization: initial value of the loop counter.
     * condition: condition to be met for the loop to continue.
     * update: increment or decrement the loop counter.
     */

    // For multiplication table
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
    }

    /*
     * Important notes:
     * 
     * Order in which for loop is executed:
     * 1. initialization
     * 2. condition
     * 3. statement execution
     * 4. update
     * 
     * 1. initialization is executed only once.
     * 2. condition is executed always
     * 3. update will be executed n - 1 times where n is number for which we are
     * checking in condition.
     * 
     * Semicolon is mandatory in for loop for the statements to end the statement.
     */

    /*
     * For for loop, we can leave initialization and update statements empty. But
     * condition is required must in for loop.
     * 
     * Initialization can be done initially.
     * Update can be done inside statements of for loop
     * Condition is must in for loop
     */
    int x = 1; // initialization
    for (; x <= 10;) { // only condition present here.
      System.out.println(x);
      x++; // update
    }

    // Empty statement. It will not throw any error. But just runs for loop
    // for (; x <= 10; x++);

    // We can pass multiple values in for loop
    int a;
    int b;

    for (a = 1, b = 2; x <= 10; a++, b++) {
      System.out.println(a);
      System.out.println(b);
    }

    /*
     * In for loop, if we don't specify all 3 properties like initialization,
     * condition and update, it will run infinitely and can be stopped only be
     * clicking control + x or command + x.
     * Reason is because as there is no condition, it will always return true.
     * 
     * For this, we need to pass two semi colons.
     */
    for (;;) {
      System.out.println("Run infinitely");
    }
  }
}
