package Problems.OOPS;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
  private String principal = "4500.00";
  private String interest = "7.5";

  public SimpleInterestCalculator(String principal, String interest) {
    this.principal = principal;
    this.interest = interest;
  }

  BigDecimal calculateTotalValue(int years) {
    BigDecimal interestTotal = new BigDecimal(interest).divide(new BigDecimal(100));
    return new BigDecimal(principal)
        .add((new BigDecimal(principal).multiply(interestTotal).multiply(new BigDecimal(years))));
  }

  public static void main(String[] args) {
    SimpleInterestCalculator sic = new SimpleInterestCalculator("4500.00", "7.5");
    BigDecimal totalValue = sic.calculateTotalValue(5);
    System.out.println(totalValue);
  }
}
