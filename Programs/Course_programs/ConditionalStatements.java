package Programs.Course_programs;

public class ConditionalStatements {
  public static void main(String[] args) {
    /*
     * Condition: Condition is the statement which can change the flow of the
     * program during run time based on the condition result.
     * 
     * Example:
     * int i = 5;
     * i < 5 -> false
     * 
     * i = 2;
     * i < 5 -> true
     * 
     * Here the results are getting varied and based on this, flow of execution also
     * changes.
     * 
     * Loops:
     * Loops are used to perform or execute block of code or steps repeatedly
     * 
     * For loop:
     * For loop is used to perform or execute block of code or steps repeatedly
     * until certain condition becomes false.
     * 
     * Syntax:
     * for (initialization;condition;update) {
     * statement 1;
     * statement 2;
     * and so on
     * }
     * 
     * {} => Block:
     * Block will have set of statements which are grouped under {}. We can have as
     * many statements in block.
     * 
     * Here:
     * initialization: Initializing a value first. This is the first step of for
     * loop. This is the start. This is executed only once.
     * 
     * Example: int i = 1;
     * Here, we are initializing i = 1 and this will be the starting point.
     * 
     * condition: We need to have condition that till when the loop should execute.
     * Once the condition becomes false, the control will come out of the loop. Till
     * then, it will execute all the steps inside the block.
     * 
     * This will be the second step and runs every time and condition becomes false.
     * 
     * Example:
     * i < 10;
     * Here, it will execute till i is less than 10. Initial value will be i = 1
     * which we have defined it previously. Till i becomes 10, the block will
     * execute the statements.
     * 
     * Executing statements: After initialization and condition, statements are
     * executed.
     * For example:
     * int i = 1 -> initialization
     * i < 10 -> 1 < 10 which is true. So, execute statement 1 and statement 2 and
     * so on.
     * 
     * This is the third step and runs every time and condition becomes false.
     * 
     * update: This is the last step. After executing statements, i value will get
     * updated.
     * In our case, it will be i++.
     * 
     * Update will be performed on the initialized variable.
     * Example:
     * i++ or i-- or i += 2 or i /= 2
     * 
     * and loop continues.
     * 
     * next iteration i becomes 2 as (i++) will increment. Again condition is
     * checked.
     * i < 10 -> 2 < 10 which is true. Execute statements and so on till i becomes
     * 10.
     * 
     * Once it becomes 10, i < 10 condition will fail as 10 < 10 false. Control will
     * come out of the loop.
     */

    // Example:
    for (int i = 1; i < 10; i++) {
      System.out.println(i);
    }

    // Here, steps involved are:
    // 1. initialization
    // 2. condition check
    // 3. Execute statements
    // 4. update
    // 5. Repeat till condition becomes false.

    // Note: for(;;) {}
    // This is an infinite loop which will execute continuously.
    // Even initialization can be done outside of for loop and updating can be done
    // inside of for loop block but condition is must.

    // Note: We can include multiple values inside for statement
    for (int i = 1, j = 2; i <= 10; i++, j++)
      ;

    /*
     * If statement:
     * If statement is a conditional statement which is used to check for a
     * condition.
     * 
     * Example:
     * int i = 5;
     * i < 5 -> false
     * 
     * i = 2;
     * i < 5 -> true
     * 
     * Note: Condition return boolean value always.
     * 
     * Syntax:
     * if (condition) {
     * statement
     * }
     * 
     * It means, it will check for condition, if condition becomes true, only then
     * it will execute the statement inside of if block. Else, it will not enter the
     * block and statement execution will be skipped.
     * 
     * It can change the execution of the program based on condition.
     */

    // Example:
    int value = 5;
    if (value < 10) {
      System.out.println("Value is less than 10");
    }

    // output: Value is less than 10 because value is 5 which is less than 10.
    // If condition is true only statements are executed

    // Note: If if condition has only 1 statement, we can ignore {} braces. But it
    // is always a good practice to provide {}

    if (value > 5)
      System.out.println("value is greater than 5");

    // Note:
    // = is assignment operator
    // == is comparison operator

  }
}
