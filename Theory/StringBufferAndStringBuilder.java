package Theory;

public class StringBufferAndStringBuilder {
  public static void main(String[] args) {
    /*
     * As we know that Strings are immutable, so if we want to modify a string, we
     * have to create a new string.
     */
    String str = "Hello";
    String str1 = str.concat(" World");
    System.out.println(str1); // "Hello World"
    System.out.println(str); // "Hello"

    /*
     * To overcome this problem, we can use StringBuffer and StringBuilder.
     * StringBuffer and StringBuilder are mutable strings.
     */

    /*
     * String Buffer:
     * StringBuffer can be used to modify a string and store value in same variable
     * which was used to create the string.
     * 
     * Syntax:
     * StringBuffer str = new StringBuffer("Hello");
     * str.append(" World");
     * System.out.println(str); // "Hello World"
     * 
     * Note:
     * Note that when we create StringBuffer object, we need to pass the value to
     * the constructor.
     * If we don't pass the value, then it will create an empty string buffer.
     * 
     * Syntax:
     * StringBuffer str = new StringBuffer();
     * str.append("Hello");
     * System.out.println(str); // "Hello"
     * 
     * Note:
     * StringBuffer and String objects both are not same during return value.
     * StringBuffer returns StringBuffer object and String returns String object.
     */
    StringBuffer str2 = new StringBuffer("Hello");
    str2 = str2.append(" World");
    System.out.println(str2); // "Hello World"

    /*
     * setCharAt():
     * setCharAt() method is used to set the character at the specified index.
     * It returns a new string with the set character.
     * 
     * Syntax:
     * StringBuffer str = new StringBuffer("Hello");
     * str.setCharAt(0, 'h');
     * System.out.println(str); // "hello"
     */
    StringBuffer str3 = new StringBuffer("Hello");
    str3.setCharAt(0, 'h');
    System.out.println(str3);

    /*
     * StringBuilder:
     * StringBuilder is similar to StringBuffer used to modify a string and store
     * value in same variable which was used to create the string.
     * 
     * Syntax:
     * StringBuilder str = new StringBuilder("Hello");
     * str.append(" World");
     * System.out.println(str); // "Hello World"
     * 
     * Note:
     * This was introduced in later versions of Java to improve the performance of
     * the string manipulation.
     * 
     * Note:
     * All the methods which are available in StringBuffer are also available in
     * StringBuilder.
     */
    StringBuilder str4 = new StringBuilder("Hello");
    str4 = str4.append(" World");
    System.out.println(str4); // "Hello World"

    /*
     * Difference between StringBuffer and StringBuilder:
     * 
     * StringBuffer:
     * 
     * Mutable
     * Synchronized
     * Thread-safe
     * Slow performance
     * Less efficient in memory usage
     * 
     * StringBuilder:
     * 
     * Mutable
     * Not synchronized
     * Not thread-safe
     * Fast performance
     * More efficient in memory usage
     * 
     */
  }
}
