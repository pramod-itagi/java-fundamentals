package Programs.Course_programs;

public class PrimitiveDataTypes {
  public static void main(String[] args) {
    /*
     * Primitive data types: These are the built in data types used in java to store
     * different types of values
     * 
     * There are 8 types of data types available:
     * 
     * 4 Integer data types:
     * 1. byte
     * 2. short
     * 3. int
     * 4. long
     * 
     * 2 decimal data types:
     * 1. float
     * 2. double
     * 
     * char
     * 
     * boolean
     * 
     */

    /*
     * Integer data types:
     * 
     * byte: Byte
     * 1 byte = 8 bits
     * This stores integer value.
     */

    // Example:
    byte a = 10;
    System.out.println(a);

    /*
     * short: Short
     * 2 byte = 16 bits
     * This stores integer value. Greater than byte.
     */

    // Example:
    short b = 10;
    System.out.println(b);

    /*
     * int: Integer
     * 3 byte = 32 bits
     * This stores integer value. Greater than short.
     */

    // Example:
    int c = 10000000;
    System.out.println(c);

    /*
     * long: Long
     * 4 byte = 64 bits
     * This stores integer value. Greater than int.
     */

    // Example:
    long d = 10000000l;
    System.out.println(d);

    /*
     * Note: Based on the requirement and scenario, consider the data types.
     * Consider range of the values as well
     */

    /*
     * Floating point data types
     * 
     * float: Float
     * 3 byte: 32 bits
     * This stores floating point or decimal values. We need to provide 'f' after
     * value to denote it as float. Otherwise it will throw an error.
     */

    // Example:
    float e = 4.5f;
    System.out.println(e);

    /*
     * double: Double
     * 4 byte: 64 bits
     * This stores floating point values. We don't need to provide 'f' for this.
     * Directly we can denote in decimal values.
     * It can be used to store big values.
     */

    // Example:
    double f = 4.5;
    System.out.println(f);

    // Note: By default floating point values are double.
    // float g = 4.5;
    // System.out.println(f);
    // This will throw an error because 4.5 is by default double value and we cannot
    // put larger value into smaller value

    /*
     * Note: Both double and float are not precise. Means they do not provide exact
     * values during calculation of longer numbers. Hence, we need to use BigDecimal
     * for finding exact values during calculation
     * 
     * Among float and double, double is more precise.
     */

    /*
     * char: Char
     * 2 byte: 16 bits
     * 
     * This is used to store character type values. It should be denoted in single
     * quotes (''). It should contain only 1 character.
     * 
     */

    // Example:
    char ch = 'A';
    System.out.println(ch);

    /*
     * bool: Boolean
     * It will store only true or false values
     * 
     * This can be used during decision making statements.
     * It is case sensitive. Cannot be changed the case.
     */

    // Example:
    boolean isPrime = true;
    boolean isValid = false;

    System.out.println(isPrime);
    System.out.println(isValid);
  }
}
