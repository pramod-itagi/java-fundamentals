package Theory;

import java.math.BigDecimal;

public class BigDecimalExample {
  public static void main(String[] args) {
    /*
     * BigDecimal provides precise storage for decimal values, making it ideal for
     * financial calculations that require accuracy.
     * 
     * BigDecimal belongs to the java.math package, so you need to import it as
     * follows:
     * import java.math.BigDecimal;
     *
     * Syntax:
     * To create a BigDecimal object, use:
     * BigDecimal number = new BigDecimal("value");
     * 
     * Note:
     * The value passed should always be a String. Avoid using float or double
     * values directly,
     * as doing so can lead to precision errors. For example:
     * BigDecimal bd = new BigDecimal(20.12312414151);
     * // bd will contain: 20.123124141510000839616623125039041042327880859375
     * 
     * To prevent such inaccuracies, use a String:
     * BigDecimal number = new BigDecimal("100.1234152");
     */

    /*
     * Note 1:
     * BigDecimal does not support +, -, *, / operators.
     * 
     * Note 2:
     * BigDecimal have their own methods to perform calculations.
     *
     * Common methods:
     * - add(BigDecimal number): Adds two BigDecimal values.
     * - subtract(BigDecimal number): Subtracts one BigDecimal value from another.
     * - multiply(BigDecimal number): Multiplies two BigDecimal values.
     * - divide(BigDecimal number): Divides one BigDecimal value by another.
     * - compareTo(BigDecimal number): Compares two BigDecimal values.
     * - equals(BigDecimal number): Checks if two BigDecimal values are equal.
     */
    BigDecimal number1 = new BigDecimal("100.1234152");
    BigDecimal number2 = new BigDecimal("122312.412123");
    System.out.println(number1.add(number2));

    /*
     * Note:
     * BigDecimal is immutable. Hence, once the BigDecimal object is created, we
     * cannot change its value.
     * 
     * If we want to perform any operation and one operand is other than BigDecimal,
     * then we need to convert that operand to BigDecimal.
     * 
     * Syntax:
     * new BigDecimal(value)
     */
    int i = 10;
    BigDecimal i2 = new BigDecimal("20");
    System.out.println((new BigDecimal(i)).add(i2));
  }
}
