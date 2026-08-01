package Theory;

public class PrimitiveDataTypes {
  public static void main(String[] args) {
    /*
     * Primitive data types: These are the built in data types provided by java to
     * store and organize different type of data or values.
     * 
     * There are total 8 primitive data types:
     * 
     * Under integer:
     * 1. byte
     * 2. short
     * 3. int
     * 4. long
     * 
     * Under floating point:
     * 1. float
     * 2. double
     * 
     * Under character:
     * char
     * 
     * Under boolean:
     * boolean
     * 
     */

    /* ******************************************** */
    /*
     * byte: (byte):
     * 
     * Size:
     * 1 byte = 8 bits
     * 
     */
    byte a = 10;
    System.out.println(a);

    /*
     * short: (short):
     * 
     * Size:
     * 2 bytes = 16 bits
     * 
     */

    short b = 10;
    System.out.println(b);

    /*
     * int: (integer): This is commonly used data type for integer
     * 
     * Size:
     * 4 bytes = 32 bits
     * 
     */
    int c = 10;
    System.out.println(c);

    /*
     * long: (long): This should be used only when the values are high.
     * To denote it as long, we should append "l" at the end. Otherwise it will take
     * it as integer and cast it automatically
     * 
     * Size:
     * 8 bytes = 64 bits
     * 
     */
    long d = 100000000l;
    System.out.println(d);

    /* ******************************************** */
    /*
     * float: (floating point): This is used to store decimal values.
     * To denote it as float, we should append "f" at the end. Otherwise it will
     * take it as double and throw an error as double is bigger in size compared to
     * float.
     * 
     * Size:
     * 4 bytes = 32 bits
     */
    float f = 2.5f;
    System.out.println(f);

    /*
     * double: (double): This is used to store decimal values.
     * By default, decimal values are stored as double.
     * 
     * Size:
     * 8 bytes = 64 bits
     */
    double dbl = 2.5;
    System.out.println(dbl);

    /*
     * Note: Both float and double are not accurate during financial calculation.
     * They do not provide precise values. Hence, for financial calculations, we
     * need to use "BigDecimal".
     */

    /* ******************************************** */
    /*
     * char: (character): This is used to store single characters. This should be
     * enclosed within '' single quotes.
     * We cannot store more than 1 character in single quotes and treat it as char.
     * 
     * Size:
     * 2 bytes = 16 bits
     */
    char ch = 'A';
    System.out.println(ch);

    /* ******************************************** */
    /*
     * boolean: (boolean): This is used to store true or false values.
     * These values are case sensitive.
     * 
     * Size:
     * 1 byte = 8 bits
     * 
     * When we declare a boolean variable without any value, by default it will be
     * false.
     */
    boolean bool = true;
    System.out.println(bool);
  }
}
