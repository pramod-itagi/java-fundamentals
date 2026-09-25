package Theory;

public class WrapperClasses {
  public static void main(String[] args) {
    /*
     * Wrapper classes:
     * Wrapper classes are the wrapper around the primitive data types so that we
     * can use them as Objects.
     * 
     * Wrapper classes for given primitive data types are:
     * byte -> Byte
     * short -> Short
     * int -> Integer
     * long -> Long
     * float -> Float
     * double -> Double
     * char -> Character
     * boolean -> Boolean
     * 
     * Note:
     * Only for char and int, the wrapper classes are Character and Integer
     * respectively.
     * 
     * Usage:
     * These wrapper classes provide more methods to perform operations on the
     * primitive data types. They act as utility classes for the primitive data
     * types.
     */

    /*
     * Syntax:
     * WrapperClass variableName = new WrapperClass(value); // This is deprecated
     * or
     * WrapperClass variableName = WrapperClass.valueOf(value);
     */
    Integer i = new Integer(10);
    System.out.println(i);

    Integer i1 = Integer.valueOf(10);
    System.out.println(i1);

    // Passing String and converting it into Integer
    Integer i3 = Integer.valueOf("1234");
    System.out.println(i3);

    /*
     * Note:
     * Wrapper classes are immutable. Once the values are assigned, they cannot be
     * changed.
     */

    /*
     * Why to use valueOf method than the constructor?
     * 
     * Reason:
     * When we create wrapper objects using constructor, it creates new object in
     * the heap memory. Everytime when we use new keyword, it creates new object.
     * Even though the values are same, they are pointing to different memory
     * locations.
     * 
     * But in case of valueOf method, it checks if the value is already present in
     * the cache, if it is present, it returns the same object, otherwise it creates
     * new
     * object and returns it.
     * 
     * When we compare them using == operator, it will return false because they are
     * pointing to different memory locations.
     * But for valueOf method, it will return true because it checks the cache and
     * returns the same object if it is present.
     * 
     * Note:
     * The cache is already present and from there, the values will be fetched. But
     * it can cache values from -128 to 127.
     * 
     * valueOf() is a static method.
     */

    /*
     * Float:
     */
    Float f1 = new Float(10.5f);
    System.out.println(f1);

    /*
     * Note: Creating Float value by passing Double value using valueOf method will
     * not work. It will throw an error.
     * It will work by using constructor.
     * 
     * Example:
     * Float fd = Float.valueOf(10.5); // error
     */
    Float fd1 = new Float(10.5);
    System.out.println(fd1);

    Float f2 = Float.valueOf(0.5f);
    System.out.println(f2);

    Float f3 = Float.valueOf("10.5");
    System.out.println(f3);

    /*
     * Double:
     */
    Double d1 = new Double(10.5);
    System.out.println(d1);

    Double d2 = Double.valueOf(0.5);
    System.out.println(d2);

    Double d3 = Double.valueOf("10.5");
    System.out.println(d3);

    /*
     * Character:
     */
    Character c1 = new Character('a');
    System.out.println(c1);

    Character c2 = Character.valueOf('a');
    System.out.println(c2);

    /*
     * Boolean:
     * Boolean can accept boolean values and String values.
     * 
     * It can accept "true" and "false" in any cases.
     * "TRUE", "true", "tRue", "FaLse", "fAlse", "FALSE", etc.
     * 
     * If anything other than "true" or "false", it will return false.
     */
    Boolean b1 = new Boolean(true);
    System.out.println(b1);

    Boolean b2 = Boolean.valueOf(true);
    System.out.println(b2);

    Boolean b3 = new Boolean("true");
    System.out.println(b3);

    Boolean b4 = Boolean.valueOf("false");
    System.out.println(b4);

    Boolean b5 = Boolean.valueOf("Something"); // false
    System.out.println(b5);

    /*
     * Constants in wrapper classes:
     * Every wrapper class has some constants which can have some fixed values.
     * 
     * Example:
     * Integer.MAX_VALUE
     * Integer.MIN_VALUE
     * Float.MAX_VALUE
     * Float.MIN_VALUE
     * Double.MAX_VALUE
     * Double.MIN_VALUE
     * Character.MAX_VALUE
     * Character.MIN_VALUE
     * Boolean.TRUE
     * Boolean.FALSE
     * 
     * Integer.BYTES
     * Integer.SIZE
     * 
     * Note:
     * These constants are static and final.
     * 
     */
  }
}
