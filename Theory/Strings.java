package Theory;

public class Strings {
  public static void main(String[] args) {

    /*
     * String: String is a textual data which is enclosed in double quotes ("").
     * When anything is put under the double quotes and pass it in
     * System.out.println() method, it will be printed as it is.
     * 
     */
    String s = "Pramod";
    System.out.println(s);

    /*
     * String concatenation: String concatenation refers to adding up the strings.
     * We can use + operator along with String to perform String concatenation.
     * 
     * It doesn't matter whatever the position of the String. Whenever control sees
     * String, it will concatenate.
     */
    System.out.println("1" + 10); // "110"

    // Add and concat
    // Here 1 + 2 + 3 will be performed first. When control sees next operand is
    // String, it will concatenate with the result.
    System.out.println(1 + 2 + 3 + "0"); // "60"

    // Here first operand is String, so further addition operations will not be
    // performed. It will concatenate everything.
    System.out.println("1" + 2 + 3); // "123"

    /*
     * + plays multiple roles in java.
     * 1. If all operands are integers, it will perform addition.
     * 2. If all operands are Strings, it will concatenate.
     * 3. If any operand is String and any operand is integer, the integer will be
     * converted to String and then concatenated.
     * 
     */

    // Example:
    System.out.println(1 + 2); // 3
    System.out.println("1" + 2); // 12

    // With alphabets
    System.out.println("ABC" + "DEF" + "FHI");

    // String concatenation by printing values
    System.out.println("Values are: " + 10 + " and " + 20); // "Values are: 10 and 20"
  }
}
