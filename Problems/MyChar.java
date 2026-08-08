package Problems;

public class MyChar {
  public boolean isVowel(char ch) {
    switch (ch) {
      case 'a':
      case 'A':
      case 'e':
      case 'E':
      case 'i':
      case 'I':
      case 'o':
      case 'O':
      case 'u':
      case 'U':
        return true;
      default:
        return false;
    }
  }

  public static void main(String[] args) {
    MyChar myChar = new MyChar();
    System.out.println(myChar.isVowel('A'));
  }
}
