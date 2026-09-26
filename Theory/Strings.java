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
     * 
     * Note:
     * When we do concatenation, it creates new String object as Strings are
     * immutable.
     * 
     * Immutable refers to the fact that the string object cannot be changed after
     * it is created.
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

    /*
     * Note:
     * When we create any string,
     * example: "Pramod"
     * It becomes instance of class called "String". Because using this instance, we
     * can call String methods on it.
     */

    /*
     * Note:
     * We don't need constructor to create String object. We can create String
     * object using String literal.
     */
    String s1 = "Pramod"; // is same as String s = new String("Pramod");
    System.out.println(s1);

    /*
     * length():
     * lentgth() method is used to find the length of the string. It returns the
     * number of characters in the string.
     */
    String str = "Pramod";
    System.out.println(str.length()); // 6

    /*
     * indexOf():
     * indexOf() method is used to find the index of the first occurrence of the
     * character in the string. It returns the index of the first occurrence of the
     * character in the string.
     * 
     * Syntax:
     * String str = "Test";
     * int index = str.indexOf('e');
     * System.out.println(index); // 1
     * 
     * Note:
     * If the character is not found, it returns -1.
     * 
     * Syntax:
     * String str = "Test";
     * int index = str.indexOf('x');
     * System.out.println(index); // -1
     * 
     */
    String str1 = "Pramod";
    System.out.println(str1.indexOf('o')); // 4

    /*
     * charAt():
     * charAt() method is used to get the character at the specified index in the
     * string.
     * It returns the character at the specified index in the string.
     * 
     * Syntax:
     * String str = "Test";
     * char ch = str.charAt(1);
     * System.out.println(ch); // 'e'
     * 
     * Note:
     * If the index is out of range, it will throw StringIndexOutOfBoundsException.
     * 
     * Syntax:
     * String str = "Test";
     * char ch = str.charAt(10);
     * System.out.println(ch); // StringIndexOutOfBoundsException
     * 
     * Note:
     * If the index is negative, it will throw StringIndexOutOfBoundsException.
     * 
     * Syntax:
     * String str = "Test";
     * char ch = str.charAt(-1);
     * System.out.println(ch); // StringIndexOutOfBoundsException
     * 
     */
    String str3 = "Pramod";
    System.out.println(str3.charAt(2)); // 'a'
    System.out.println(str3.charAt(4)); // 'o'

    /*
     * substring():
     * substring() method is used to get a substring of the string. Whatever the
     * index we pass, it will return the substring from that index to the end of the
     * string.
     * 
     * Syntax:
     * String str = "BiggerString";
     * String sub = str.substring(1);
     * System.out.println(sub); // "iggerString"
     * 
     * Note:
     * We can also specify start and end index.
     * 
     * Syntax:
     * String str = "BiggerString";
     * String sub = str.substring(1, 5);
     * System.out.println(sub); // "igger"
     * 
     * Note:
     * We can also specify start and end index. When we pass start index, it is
     * inclusive and when we pass end index, it is exclusive. So always keep in mind
     * while passing end index.
     * 
     * Syntax:
     * String str = "BiggerString";
     * String sub = str.substring(1, 5);
     * System.out.println(sub); // "igge"
     * 
     * Here 1 is inclusive and 5 is exclusive.
     */
    String str4 = "BiggerString";
    System.out.println(str4.substring(1)); // "iggerString"

    String str5 = "BiggerString";
    System.out.println(str5.substring(1, 5)); // "igge"

    /*
     * contains():
     * contains() method is used to check if the string contains in the given
     * string.
     * It returns true if the string contains the given string, otherwise false.
     * 
     * Syntax:
     * String str = "BiggerString";
     * boolean contains = str.contains("String");
     * System.out.println(contains); // true
     * 
     * Note:
     * If the string is not found, it returns false.
     * 
     */
    String str6 = "BiggerString";
    System.out.println(str6.contains("String")); // true

    /*
     * indexOf():
     * indexOf() method is used to get the index of the specified string passed as
     * argument. It returns the index of the first occurrence of the specified
     * string.
     * 
     * Syntax:
     * String str = "BiggerString";
     * int index = str.indexOf("String");
     * System.out.println(index); // 6
     * 
     * Note:
     * If the string is not found, it returns -1.
     * 
     * Note:
     * We can search String as well as character.
     * 
     * Syntax:
     * String str = "BiggerString";
     * int index = str.indexOf('i');
     * System.out.println(index); // 2
     * 
     */
    String str7 = "BiggerString";
    System.out.println(str7.indexOf("String")); // 6

    /*
     * lastIndexOf():
     * lastIndexOf() method is used to get the index of the last occurrence of the
     * specified string passed as argument. It returns the index of the last
     * occurrence of the specified string.
     * 
     * Syntax:
     * String str = "BiggerStringString";
     * int index = str.lastIndexOf("String");
     * System.out.println(index); // 12
     */
    String str8 = "BiggerStringString";
    System.out.println(str8.lastIndexOf("String")); // 12

    /*
     * startsWith():
     * startsWith() method is used to check if the string starts with the specified
     * string passed as argument.
     * It returns true if the string starts with the specified string, otherwise
     * false.
     * 
     * It acts like a prefix or pattern.
     * 
     * Syntax:
     * String str = "BiggerString";
     * boolean startsWith = str.startsWith("Bigger");
     * System.out.println(startsWith); // true
     * 
     * boolean startsWith = str.startsWith("Big");
     * System.out.println(startsWith); // true
     * 
     */
    String str9 = "BiggerString";
    System.out.println(str9.startsWith("Bigger")); // true
    System.out.println(str9.startsWith("Big")); // true

    /*
     * endsWith():
     * endsWith() method is used to check if the string ends with the specified
     * string passed as argument.
     * It returns true if the string ends with the specified string, otherwise
     * false.
     * 
     * It acts like a suffix or pattern.
     * 
     * Syntax:
     * String str = "BiggerString";
     * boolean endsWith = str.endsWith("String");
     * System.out.println(endsWith); // true
     *
     * boolean endsWith = str.endsWith("ing");
     * System.out.println(endsWith); // true
     * 
     */
    String str10 = "BiggerString";
    System.out.println(str10.endsWith("String")); // true
    System.out.println(str10.endsWith("ing")); // true

    /*
     * isEmpty():
     * isEmpty() method is used to check if the string is empty.
     * It returns true if the string is empty, otherwise false.
     * 
     * Syntax:
     * String str = "BiggerString";
     * boolean isEmpty = str.isEmpty();
     * System.out.println(isEmpty); // false
     * 
     * String str = "";
     * boolean isEmpty = str.isEmpty();
     * System.out.println(isEmpty); // true
     */
    String str11 = "BiggerString";
    System.out.println(str11.isEmpty()); // false
    String str12 = "";
    System.out.println(str12.isEmpty()); // true

    /*
     * equals():
     * equals() method is used to check if the string is equal to the specified
     * string passed as argument.
     * It returns true if the string is equal to the specified string, otherwise
     * false.
     * 
     * Syntax:
     * String str = "BiggerString";
     * boolean equals = str.equals("BiggerString");
     * System.out.println(equals); // true
     * 
     * boolean equals = str.equals("SmallerString");
     * System.out.println(equals); // false
     * 
     * Note:
     * We can also use == operator to check if the string is equal to the specified
     * string.
     * 
     * Syntax:
     * String str = "BiggerString";
     * boolean equals = str == "BiggerString";
     * System.out.println(equals); // true
     * 
     * boolean equals = str == "SmallerString";
     * System.out.println(equals); // false
     * 
     */
    String str13 = "BiggerString";
    System.out.println(str13.equals("BiggerString")); // true
    System.out.println(str13.equals("SmallerString")); // false

    /*
     * equalsIngnoreCase():
     * equalsIgnoreCase() method is used to check if the string is equal to the
     * specified string passed as argument ignoring case. It is case insensitive.
     * It returns true if the string is equal to the specified string, otherwise
     * false.
     * 
     * Note: Behind the scenes, both strings will get converted to
     * lowercase/uppercase and then compared.
     * 
     * Syntax:
     * String str = "BiggerString";
     * boolean equalsIgnoreCase = str.equalsIgnoreCase("BIGGERSTRING");
     * System.out.println(equalsIgnoreCase); // true
     * 
     * boolean equalsIgnoreCase = str.equalsIgnoreCase("SmallerString");
     * System.out.println(equalsIgnoreCase); // false
     * 
     */
    String str14 = "BiggerString";
    System.out.println(str14.equalsIgnoreCase("BIGGERSTRING")); // true
    System.out.println(str14.equalsIgnoreCase("SmallerString")); // false

    /*
     * concat():
     * concat() method is used to concatenate the specified string to the end of the
     * current string.
     * It returns a new string with the concatenated string.
     * 
     * Syntax:
     * String str = "BiggerString";
     * String concat = str.concat("String");
     * System.out.println(concat); // "BiggerStringString"
     * 
     * Note:
     * We can use as many concat() methods as we want.
     * 
     * Syntax:
     * String str = "BiggerString";
     * String concat = str.concat("String").concat("New String");
     * System.out.println(concat); // "BiggerStringStringNew String"
     */
    String str15 = "BiggerString";
    System.out.println(str15.concat("String")); // "BiggerStringString"
    System.out.println(str15); // "BiggerString" because concat() returns a new string but doesn't modify the
                               // original string.
    String anotherString = str15.concat("New String");
    System.out.println(anotherString); // "BiggerStringNew String"

    /*
     * toUpperCase():
     * toUpperCase() method is used to convert the string to uppercase.
     * It returns a new string with the uppercase string.
     * 
     * Syntax:
     * String str = "BiggerString";
     * String upperCase = str.toUpperCase();
     * System.out.println(upperCase); // "BIGGERSTRING"
     */
    String str16 = "BiggerString";
    System.out.println(str16.toUpperCase()); // "BIGGERSTRING"

    /*
     * toLowerCase():
     * toLowerCase() method is used to convert the string to lowercase.
     * It returns a new string with the lowercase string.
     * 
     * Syntax:
     * String str = "BiggerString";
     * String lowerCase = str.toLowerCase();
     * System.out.println(lowerCase); // "biggerstring"
     */
    String str17 = "BiggerString";
    System.out.println(str17.toLowerCase()); // "biggerstring"

    /*
     * trim():
     * trim() method is used to remove the leading and trailing whitespace from the
     * string.
     * It returns a new string with the trimmed string.
     * 
     * Note:
     * It won't remove spaces between the words.
     * 
     * Syntax:
     * String str = " BiggerString ";
     * String trimmed = str.trim();
     * System.out.println(trimmed); // "BiggerString"
     */
    String str18 = " BiggerString ";
    System.out.println(str18.trim()); // "BiggerString"

    /*
     * join():
     * join() method is used to join the specified strings with the delimiter.
     * It returns a new string with the joined string.
     * 
     * Note:
     * If we want to use join() method, then we have to use Static utility method
     * called "String" and then use .join() method on that.
     * We cannot use it directly on string object which are created as variables.
     * 
     * Delimiter can be any symbol or character or number.
     * 
     * Syntax:
     * String joined = String.join("-", "Bigger", "String");
     * System.out.println(joined); // "Bigger-String"
     */
    System.out.println(String.join("-", "Bigger", "String")); // "Bigger-String"
    System.out.println(String.join(".", "abc@yahoo", "com")); // "abc@yahoo.com"

    /*
     * replace():
     * replace() method is used to replace the specified string with the new string.
     * It returns a new string with the replaced string.
     * 
     * Syntax:
     * String str = "BiggerString";
     * String replaced = str.replace("Bigger", "Smaller");
     * System.out.println(replaced); // "SmallerString"
     */
    String str19 = "BiggerString";
    System.out.println(str19.replace("Bigger", "Smaller")); // "SmallerString"
    System.out.println(str19.replace("r", "R")); // "BiggeRStRing"
  }
}
