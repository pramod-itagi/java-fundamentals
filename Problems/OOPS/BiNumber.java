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

  public static void main(String[] args) {
    BiNumber biNumber = new BiNumber(2, 3);
    System.out.println(biNumber.add());
    System.out.println(biNumber.multiply());
    biNumber.doubleNumbers();
    System.out.println(biNumber.getNumber1());
    System.out.println(biNumber.getNumber2());
  }
}
