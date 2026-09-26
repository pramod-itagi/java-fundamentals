package Problems;

public class StringMagic {
  // Counts the number of uppercase letters in a string
  public int countUppercaseLetters(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        count++;
      }
    }
    return count;
  }

  // Checks if a string has consecutive duplicates
  public boolean hasConsecutiveDuplicates(String str) {
    if (str.length() == 0)
      return false;

    char previous = str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == previous) {
        return true;
      } else {
        previous = str.charAt(i);
      }
    }
    return false;
  }

  // Gets the rightmost digit in a string
  public int getRightmostDigit(String str) {
    if (str == "")
      return -1;

    int rightMostDigit = -1;
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        rightMostDigit = Character.getNumericValue(str.charAt(i));
      }
    }
    return rightMostDigit;
  }

  public static void main(String[] args) {
    StringMagic stringMaic = new StringMagic();
    System.out.println(stringMaic.countUppercaseLetters("Hello WORLd"));
    System.out.println(stringMaic.hasConsecutiveDuplicates("Hello"));
    System.out.println(stringMaic.getRightmostDigit("Hello123"));
  }
}
