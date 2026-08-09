package Problems.OOPS;

public class BiNumber {

  private int number1;
  private int number2;

  public BiNumber(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public int getNumber1() {
    return number1;
  }

  public int getNumber2() {
    return number2;
  }

  int add() {
    return number1 + number2;
  }

  int multiply() {
    return number1 * number2;
  }

  void doubleNumbers() {
    number1 *= 2;
    number2 *= 2;
  }

  public int calculateLCM() {
    if (number1 < 0 || number2 < 0) {
      return -1;
    }

    if (number1 == 0 || number2 == 0) {
      return 0;
    }

    int max = Math.max(number1, number2);

    if (max % number1 == 0 && max % number2 == 0) {
      return max;
    }

    int lcm = max;
    while (lcm % number1 != 0 || lcm % number2 != 0) {
      lcm += max;
    }

    return lcm;
  }

  public int calculateGCD() {
    if (number1 == 0 || number2 == 0) {
      return 0;
    }

    if (number1 < 0 || number2 < 0) {
      return 1;
    }

    if (number1 == number2) {
      return number1;
    }

    int min = Math.min(number1, number2);

    for (int i = min; i >= 1; i--) {
      if (number1 % i == 0 && number2 % i == 0) {
        return i;
      }
    }
    return min;

  }

  public static void main(String[] args) {
    BiNumber biNumber = new BiNumber(8, 6);
    System.out.println(biNumber.add());
    System.out.println(biNumber.multiply());
    biNumber.doubleNumbers();
    System.out.println(biNumber.getNumber1());
    System.out.println(biNumber.getNumber2());
    System.out.println(biNumber.calculateLCM());
    System.out.println(biNumber.calculateGCD());
  }
}
