package Problems;

public class NumberUtils {
  public int getLastDigit(int number) {
    if (number == 0) {
      return 0;
    }

    if (number < 0) {
      return -1;
    }

    return number % 10;
  }

  public int getNumberOfDigits(int number) {
    if (number < 0) {
      return -1;
    }

    if (number == 0) {
      return 1;
    }

    int count = 0;
    while (number > 0) {
      number /= 10;
      count += 1;
    }
    return count;
  }

  public int getSumOfDigits(int number) {
    if (number < 0) {
      return -1;
    }

    if (number == 0) {
      return 0;
    }

    int remainder;
    int sum = 0;
    while (number > 0) {
      remainder = number % 10;
      sum += remainder;
      number /= 10;
    }

    return sum;
  }

  public int reverseNumber(int number) {
    if (number < 0) {
      return -1;
    }

    if (number == 0) {
      return 0;
    }

    int remainder;
    int reverse = 0;
    while (number > 0) {
      remainder = number % 10;
      number /= 10;
      reverse = reverse * 10 + remainder;
    }
    return reverse;
  }

  public static void main(String[] args) {
    NumberUtils numberUtils = new NumberUtils();
    System.out.println(numberUtils.getLastDigit(45));
    System.out.println(numberUtils.getNumberOfDigits(45));
    System.out.println(numberUtils.getSumOfDigits(123456));
    System.out.println(numberUtils.reverseNumber(123456));
  }
}
