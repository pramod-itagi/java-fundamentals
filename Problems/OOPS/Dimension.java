package Problems.OOPS;

public class Dimension {
  private int inches;
  private int feet;

  public int getFeet() {
    return feet;
  }

  public int getInches() {
    return inches;
  }

  public Dimension(int inches) {
    if (inches < 0) {
      this.feet = -1;
      this.inches = -1;
    } else {
      this.feet = inches / 12;
      this.inches = inches % 12;
    }
  }

  public static void main(String[] args) {
    Dimension dimension = new Dimension(13);
    System.out.println(dimension.getFeet());
    System.out.println(dimension.getInches());
  }
}
