package Problems;

public class BreakAndContinue {
  public static void main(String[] args) {
    int number = 5;
    for (int i = 1; i <= 10; i++) {
      if (i == number) {
        System.out.println("Breaking out as i = 5 and number is also 5");
        break;
      }
      if (i == 3) {
        System.out.println("i = 3, so skipping that from printing");
        continue;
      }
      System.out.println(i);
    }
  }
}
