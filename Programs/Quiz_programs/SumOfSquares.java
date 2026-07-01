package Programs.Quiz_programs;

public class SumOfSquares {
  public long calculateSumOfSquares(int n) {
    if (n < 0) {
      return -1;
    }
    long sumOfSquares = 0;
    for (int i = 1; i <= n; i++) {
      sumOfSquares += i * i;
    }
    return sumOfSquares;
  }

  public static void main(String[] args) {
    SumOfSquares sumOfSquares = new SumOfSquares();
    System.out.println(sumOfSquares.calculateSumOfSquares(4));
  }
}
