package Theory;

public class EscapeCharacters {
  public static void main(String[] args) {
    /*
     * Escape character: Escape characters are the characters which are used to
     * escape special characters without throwing an error.
     * 
     */

    /*
     * backslash (\) is used to escape the special characters.It can be any special
     * character. We need to provide \ before the character to escape them.
     * 
     * Escape doesn't mean it will skip the character will printing. It will not
     * throw any error but it prints the character.
     */
    System.out.println("hello\" \"world");

    /*
     * new line (\n): This is a new line escape character.
     * This is used to provide new line
     */
    System.out.println("Hello\nworld");
    /*
     * The output will be:
     * Hello
     * World
     */

    /*
     * tab(\t): This is tab escape character.
     * This is used to provide 1 tab space between the text
     */
    System.out.println("Hello\tWorld");
    /*
     * The output will be:
     * Hello World
     */

    /*
     * slash(\): This is a slash escape character.
     * This is used to print the slash (\)
     * 
     * To print 1 slash -> 2 slashes
     * To print 2 slash -> 4 slashes
     * To print 3 slash -> 6 slashes
     * and so on
     */
    System.out.println("Hello \\World");
  }
}
