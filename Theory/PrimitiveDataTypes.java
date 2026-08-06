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
     * Wrapper class for byte: Byte
     * 
     * To find the size of Byte:
     * Byte.SIZE (No brackets)
     * => * bits
     * 
     * If we want to check the size in bytes
     * Byte.BYTES
     * => 1
     * 
     * To check MAX_VALUE which byte can store:
     * Byte.MAX_SIZE
     * 127
     * 
     * To check MIN_VALUE which byte can store:
     * Byte.MIN_SIZE
     * -128
     * 
     * These MIN_VALUE and MAX_VALUE will give range of values that byte can store.
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
     * Wrapper class for short: Short
     * 
     * To find the size of Short:
     * Short.SIZE (No brackets)
     * => 16 bits
     * 
     * If we want to check the size in bytes
     * Short.BYTES
     * => 2
     * 
     * To check MAX_VALUE which short can store:
     * Short.MAX_SIZE
     * 32767
     * 
     * To check MIN_VALUE which short can store:
     * Short.MIN_SIZE
     * -32768
     * 
     * These MIN_VALUE and MAX_VALUE will give range of values that short can store.
     */

    short b = 10;
    System.out.println(b);

    /*
     * int: (integer): This is commonly used data type for integer
     * 
     * Size:
     * 4 bytes = 32 bits
     * 
     * Wrapper class for int: Integer (Not that it is Integer, not int)
     * 
     * To find the size of Integer:
     * Integer.SIZE (No brackets)
     * => 32 bits
     * 
     * If we want to check the size in bytes
     * Integer.BYTES
     * => 4
     * 
     * To check MAX_VALUE which int can store:
     * Integer.MAX_SIZE
     * 2147483647
     * 
     * To check MIN_VALUE which int can store:
     * Integer.MIN_SIZE
     * -2147483648
     * 
     * These MIN_VALUE and MAX_VALUE will give range of values that int can store.
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
     * Wrapper class for long: Long
     * 
     * To find the size of Long:
     * Long.SIZE (No brackets)
     * => 64 bits
     * 
     * If we want to check the size in bytes
     * Long.BYTES
     * => 8
     * 
     * To check MAX_VALUE which long can store:
     * Long.MAX_SIZE
     * 9223372036854775807
     * 
     * To check MIN_VALUE which long can store:
     * Long.MIN_SIZE
     * -9223372036854775808
     * 
     * These MIN_VALUE and MAX_VALUE will give range of values that long can store.
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
     * Note: f and F both works
     * 
     * Size:
     * 4 bytes = 32 bits
     * 
     * Wrapper class for float: Float
     * 
     * To find the size of Float:
     * Float.SIZE (No brackets)
     * => 32 bits
     * 
     * If we want to check the size in bytes
     * Float.BYTES
     * => 4
     * 
     * To check MAX_VALUE which float can store:
     * Float.MAX_SIZE
     * 3.4028235E38
     * 
     * To check MIN_VALUE which float can store:
     * Float.MIN_SIZE
     * 1.4E-45
     * 
     * These MIN_VALUE and MAX_VALUE will give range of values that float can store.
     * 
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
     * 
     * Wrapper class for char: Character
     * 
     * To find the size of Character:
     * Character.SIZE (No brackets)
     * => 16 bits
     * 
     * If we want to check the size in bytes
     * Character.BYTES
     * => 2
     * 
     * Unicode: Each character is represented by a unique number. This is called as
     * Unicode. Few characters which are not present in keyboard are represented by
     * Unicode values.
     * 
     * Example:
     * char ch = '\u0022'; // can be found in google or unicode table
     * System.out.println(ch);
     * This will print (double quote).
     * 
     */
    char ch = 'A';
    System.out.println(ch);

    /*
     * We can also assign numbers to char and it will provide corresponding
     * character. These numbers are the ASCII values of the characters.
     * 
     * ASCII values:
     * 0 -> 48
     * 9 -> 57
     * A -> 65
     * Z -> 90
     * a -> 97
     * z -> 122
     * 
     */
    char zero = 48;
    System.out.println(zero); // 0

    char nine = 57;
    System.out.println(nine); // 9

    char lowerCaseA = 65;
    System.out.println(lowerCaseA); // A

    char lowerCaseZ = 90;
    System.out.println(lowerCaseZ); // Z

    char A = 97;
    System.out.println(A); // a

    char Z = 122;
    System.out.println(Z); // z

    /*
     * We can also perform operations on char.
     * Result of char + integer => integer.
     * As integer is bigger in size compared to char, it will be converted to
     * integer.
     */
    System.out.println(A++); // 98, because A is 97 and 1 is added to it
    System.out.println(++Z); // 123, because Z is 122 and 1 is added to it
    System.out.println(lowerCaseA + 10); // 75, because lowerCaseA is 65 and 10 is added to it

    // Casting char to integer
    char ch1 = 'A';
    int i = (int) ch1;
    System.out.println(i); // 65, because A is

    // Assigning escape sequence to char
    char ch2 = '\n';
    System.out.println(ch2); // This will print a new line

    /* ******************************************** */
    /*
     * boolean: (boolean): This is used to store true or false values.
     * These values are case sensitive.
     * 
     * Size:
     * 1 byte = 8 bits
     * 
     * Wrapper class for boolean: Boolean
     * 
     * To find the size of Boolean:
     * Boolean.SIZE (No brackets)
     * => 8 bits
     * 
     * If we want to check the size in bytes
     * Boolean.BYTES
     * => 1
     * 
     * boolean can store only true or false values. These are case sensitive. Valid
     * ones are: true & false
     * 
     * When we declare a boolean variable without any value, by default it will be
     * false.
     * 
     */
    boolean bool = true;
    System.out.println(bool);
    /*
     * The operators which are performed on boolean values are called as
     * "Logical Operators".
     * 
     * Logical Operators:
     * 1. AND -> && (Short circuit operator)
     * 2. OR -> || (Short circuit operator)
     * 3. XOR -> ^
     * 4. NOT -> !
     * 
     * These operators are used to perform logical operations on boolean values.
     * 
     * Note:
     * The result of relational operators is always a boolean value.
     */

    /*
     * &&: (AND): This operator will return true only if both the conditions are
     * true.
     * If any one of the condition is false, it will return false.
     * 
     * Example:
     * int i = 17;
     * System.out.println(i >= 15 && i <= 25);
     * This will return true because both the conditions are true.
     * 
     * If we change the value of i to 10, then it will return false because one of
     * the condition is false.
     * 
     * Truth table:
     * True && True -> True
     * True && False -> False
     * False && True -> False
     * False && False -> False
     */
    // Example:
    int z = 17;
    System.out.println(z >= 15 && z <= 25); // true

    // Example:
    int y = 10;
    System.out.println(y >= 15 && y <= 25); // false

    /*
     * ||: (OR):
     * This operator will return true if any one of the conditions is true.
     * If both the conditions are false, it will return false.
     * 
     * Example:
     * int i = 17;
     * System.out.println(i >= 15 || i <= 25);
     * This will return true because one of the conditions is true.
     * 
     * If we change the value of i to 10, then it will return false because both the
     * conditions are false.
     */
    // Example:
    int val = 17;
    System.out.println(val >= 15 || val <= 25); // true

    // Example:
    int val1 = 10;
    System.out.println(val1 >= 15 || val1 <= 25); // true, because val1 <= 25 is true even though val1 >= 15 is false

    /*
     * ^: (XOR):
     * This operator will return true if one of the conditions is true and the other
     * is false.
     * If both the conditions are true or false, it will return false.
     * 
     * Example:
     * int i = 17;
     * System.out.println(i >= 15 ^ i <= 25);
     * This will return false because both conditions are true (i >= 15 is true, i
     * <= 25 is also true), and XOR returns false when both are true.
     *
     * If we change the value of i to 10:
     * int i = 10;
     * System.out.println(i >= 15 ^ i <= 25);
     * This will return true because i >= 15 is false, but i <= 25 is true, and XOR
     * returns true when exactly one condition is true.
     * 
     */
    // Example:
    int val2 = 17;
    System.out.println(val2 >= 15 ^ val2 <= 25); // false

    // Example:
    int val3 = 10;
    System.out.println(val3 >= 15 ^ val3 <= 25); // true, because val3 <= 25 is true even though val3 >= 15 is false

    /*
     * !: (NOT):
     * This operator will return the opposite of the boolean value.
     * If the boolean value is true, it will return false and if the boolean value
     * is false, it will return true.
     * 
     * Example:
     * int i = 17;
     * System.out.println(!(i >= 15));
     * This will return false because the boolean value is true.
     */
    // Example:
    int val4 = 17;
    System.out.println(!(val4 >= 15)); // false

    // Example:
    int val5 = 10;
    System.out.println(!(val5 >= 15)); // true, because val5 >= 15 is false

    /*
     * Other operators similar to && and ||:
     * 
     * 1. &
     * 2. |
     * 
     * These are similar to && and ||.
     * 
     * The difference is that. && is a short circuit operator. It means, for &&, if
     * left side is false, it won't evaluate right side.
     * But for &, it evaluates both operands irrespective of results.
     * 
     * Same way for ||. If left side is true, it won't evaluate right side.
     * But for |, it evaluates both operands irrespective of results.
     * 
     */
    int k = 10;
    System.out.println(false & k++ > 5);
    System.out.println(k); // 11

    int m = 10;
    System.out.println(true | m++ > 5);
    System.out.println(m); // 11

    /* ******************************************** */

    /*
     * Wrapper classes:
     * Wrapper classes are the classes which are wrapped on Primitive data types
     * where these Primitive data types can act as an object.
     * 
     * Wrapper classes are:
     * byte -> Byte
     * short -> Short
     * int -> Integer
     * long -> Long
     * float -> Float
     * double -> Double
     * char -> Character
     * boolean -> Boolean
     */

    /* ******************************************** */
    /*
     * Casting (convert):
     * The process of converting values from one type to another.
     * 
     * There are two types of casting:
     * 1. Implicit Casting
     * 2. Explicit Casting
     */

    /*
     * Implicit Casting:
     * The process of converting a smaller type to a larger type.
     * For implicit casting, we don't need to do anything. It will be done
     * automatically only if we are putting smaller value into larger value.
     * 
     */

    // Here no need of casting as int is smaller compared to long, it will be casted
    // automatically.
    int num = 20123123;
    long lg = num;
    System.out.println(lg);

    /*
     * Explicit Casting:
     * The process of converting a larger type to a smaller type.
     * 
     * Example:
     * long l = 5000000000;
     * 
     * This will throw an error because by default, it will take 5000000000 as
     * integer as these are the default data type and it is exceeding the range of
     * integer.
     * 
     * So, to denote it as long, we should append "l" at the end.
     * long l = 5000000000l;
     * 
     * Now, if we want to store that value of l into int i, it will throw an error
     * because int is smaller than long.
     * 
     * We cannot put larger value into smaller value.
     * int i = l => Error. Lossy conversion.
     * 
     * If we are sure that l doesn't have larger value and it is in range of int, we
     * can use explicit casting.
     * int i = (int) l;
     * 
     * Whatever the datatype is present in left side, same data type should be used
     * for casting.
     * 
     * This will solve the problem because it will be taken as int and it will be
     * within the range of int.
     * 
     * If it is within the range, it will be stored without any error. But if it is
     * not within the range, then value will be truncated and loss of value can
     * happen.
     * 
     */

    // This works
    long l = 5000000l;
    int i = (int) l;
    System.out.println(i);

    // This will show garbage value and loss of value will happen
    long l2 = 5000000000l;
    int i2 = (int) l2;
    System.out.println(i2);

    // Conversion from float to int
    float f2 = 2.5f;
    int i3 = (int) f2; // Even if int and float are of same size, we need to use explicit casting
                       // because float is bigger in size compared to int.
    System.out.println(i3); // This will show 2 as it will truncate the decimal part.

    /*
     * Operators supported by all integer types(byte, short, int, long) and floating
     * types (float and double):
     * + -> Add
     * - -> Subtract
     * * -> Multiply
     * / -> Divide
     * % -> Modulus
     * ++ -> Increment (both post and pre)
     * -- -> Decrement (both post and pre)
     */

    /* ******************************************** */
    /* ************** Number representation: ************** */

    /* There are 4 types of number representation: */
    /*
     * 1. Binary:
     * 2. Octal:
     * 3. Decimal:
     * 4. Hexadecimal:
     */

    /*
     * Binary:
     * This is type of representation along with 0b prefix.
     * Example: 0b1010
     * This is 10 in decimal.
     * 
     * Note: Numbers supported in binary are from 0 to 1.
     */
    int binary = 0b1010;
    System.out.println(binary);

    /*
     * Octal:
     * This is type of representation along with 0 prefix.
     * Example: 010
     * This is 8 in decimal.
     * 
     * Note: Numbers supported in octal are from 0 to 7.
     * 
     */
    int eight = 010;
    System.out.println(eight);

    /*
     * Decimal:
     * This is type of representation without any prefix.
     * Example: 10
     * This is 10 in decimal.
     * 
     * Note: Numbers supported in decimal are from 0 to 9.
     */
    int decimal = 10;
    System.out.println(decimal);

    /*
     * Hexadecimal:
     * This is type of representation along with 0x prefix.
     * Example: 0x123
     * 
     * This is 291 in decimal.
     * 
     * Note: Numbers supported in hexadecimal are from 0 to 9 and A to F.
     */
    int hex = 0x123;
    System.out.println(hex);
  }
}
