package Problems;

public class StringDemo {
  public static void main(String[] args) {
    /*
     * We need to print each character one by one
     */
    String s = "This is a lot of text again";
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
    }
  }
}
