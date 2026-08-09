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
     * 
     * for (;;) {
     * System.out.println("Run infinitely");
     * }
     */

    /*
     * while:
     * While loop is similar to for loop, but it is used to iterate over a
     * collection of data for an unknown number of times.
     * 
     * The only difference between while and for loop is that, in for loop, we will
     * be knowing the number of times the loop will run, but in while loop, we will
     * be not knowing the number of times the loop will run.
     * 
     * Until certain condition is met, the loop will run.
     * 
     * Syntax:
     * while(condition) {
     * // code to be executed.
     * // update the value for the condition
     * }
     * 
     * condition: condition to be met for the loop to continue.
     * statement: statement to be executed.
     * 
     * We need to keep on updating the condition so that the loop can end at some
     * point.
     * Otherwise the loop will run infinitely.
     */
    int y = 1;
    while (y <= 10) {
      System.out.println(y);
      y++;
    }

    /*
     * Do while:
     * Do while loop is similar to while loop, but it is used to iterate over a
     * collection of data for an unknown number of times.
     * 
     * The only difference between do while and while loop is that, in do while
     * loop,
     * the condition is checked after the statement is executed.
     * 
     * But in while loop, the condition is checked before the statement is executed.
     * 
     * Syntax:
     * do {
     * // statement to be executed.
     * // update the value for the condition
     * } while(condition);
     * 
     * condition: condition to be met for the loop to continue.
     * statement: statement to be executed.
     * 
     * We need to keep on updating the condition so that the loop can end at some
     * point.
     * Otherwise the loop will run infinitely.
     */
    int temp = 0;
    do {
      System.out.println(temp);
      temp++;
    } while (temp < 5); // condition is checked here

    /*
     * Note: In while loop, if condition fails at the beginning itself, then control
     * will not go inside of while loop and no statements are executed.
     * 
     * But in do while loop, first the statements are executed and then the
     * condition is checked. So, at least once the statements will be executed.
     * 
     */

    int temp1 = 5;
    do {
      System.out.println(temp1);
      temp1++;
    } while (temp1 < 4); // condition fails here still it will print value of 5.

    /*
     * break:
     * This statement is used to break out of the current loop. It will stop the
     * execution of the loop and control will go to the next statement after the
     * loop.
     * 
     * Syntax:
     * break;
     * 
     * We can use break statement with any type of loop.
     */
    int k = 5;
    for (int i = 1; i <= 10; i++) {
      if (i == k) {
        break; // once i == 5, it will break out
      }
      System.out.println(i);
    }

    /*
     * continue:
     * This statement is used to skip the current iteration of the loop. It will
     * stop the execution of the current iteration and control will go to the next
     * iteration.
     * 
     * Syntax:
     * continue;
     * 
     * We can use continue statement with any type of loop.
     */
    int j = 5;
    for (int i = 1; i <= 10; i++) {
      if (i == j) {
        continue; // once i == 5, it will skip the current iteration and continue to the next
                  // iteration without executing the statements inside the loop.
        // System.out.println("Skipping iteration " + i); -> This will not be executed
      }
      System.out.println(i);
    }

    /*
     * Notes to remember while selecting these below loops:
     * 1. for
     * 2. while
     * 3. do..while
     * 
     * and when to use break and continue statements.
     * 
     * If we know how many times loop will run
     * ---> for loop
     * 
     * If we don't know how many times loop will run
     * ---> while loop
     * 
     * If we want to execute the loop at least once
     * ---> do..while loop
     * 
     * If we want to skip the current iteration
     * ---> continue statement
     * 
     * If we want to break out of the loop
     * ---> break statement
     * 
     */
  }
}
