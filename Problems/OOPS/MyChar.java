package Problems.OOPS;

public class MyChar {

  private char ch;

  public MyChar(char ch) {
    this.ch = ch;
  }

  boolean isVowel() {
    return (ch == 'a' || ch == 'A' ||
        ch == 'e' || ch == 'E' ||
        ch == 'i' || ch == 'I' ||
        ch == 'o' || ch == 'O' ||
        ch == 'u' || ch == 'U');
  }

  boolean isNumber() {
    return ch >= 48 && ch <= 57;
  }

  boolean isAlphabet() {
    return (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122);
  }

  boolean isConsonant() {
    return (isAlphabet() && !isVowel());
  }

  static void printLowerCaseAlphabets() {
    for (char c = 'a'; c <= 'z'; c++) {
      System.out.println(c);
    }
  }

  static void printUpperCaseAlphabets() {
    for (char c = 'A'; c <= 'Z'; c++) {
      System.out.println(c);
    }
  }

  public static void main(String[] args) {
    MyChar myChar = new MyChar('1');
    System.out.println(myChar.isVowel());
    System.out.println(myChar.isNumber());
    System.out.println(myChar.isAlphabet());
    System.out.println(myChar.isConsonant());
    MyChar.printLowerCaseAlphabets();
    MyChar.printUpperCaseAlphabets();
  }

}
