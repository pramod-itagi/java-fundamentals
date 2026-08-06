package Problems.OOPS;

public class RGBColor {
  // The Red, Green, Blue color values range from 0 to 255.
  private int red;
  private int green;
  private int blue;

  public RGBColor(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed() {
    return red;
  }

  public int getGreen() {
    return green;
  }

  public int getBlue() {
    return blue;
  }

  // Method to invert the color. The inversion is done by subtracting each color
  // component from 255.
  public void invert() {
    this.red = 255 - this.red;
    this.green = 255 - this.green;
    this.blue = 255 - this.blue;
  }

  public static void main(String[] args) {
    RGBColor color = new RGBColor(255, 0, 0);
    System.out.println(color.getRed());
    System.out.println(color.getGreen());
    System.out.println(color.getBlue());
    color.invert();
    System.out.println(color.getRed());
    System.out.println(color.getGreen());
    System.out.println(color.getBlue());
  }
}
