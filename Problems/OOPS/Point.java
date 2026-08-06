package Problems.OOPS;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  // Method to move the point by dx and dy in x and y direction respectively
  public void move(int dx, int dy) {
    this.x = x + dx;
    this.y = y + dy;
  }

  // Method to calculate the Euclidean distance between two points
  public double distanceTo(Point other) {
    return Math.sqrt(((x - other.x) * (x - other.x)) + ((y - other.y) * (y - other.y)));
  }

  public static void main(String[] args) {
    Point p = new Point(2, 3);
    System.out.println(p.getX());
    System.out.println(p.getY());
    p.move(1, 2);
    System.out.println(p.getX());
    System.out.println(p.getY());

    // When we need to pass object with new values, use new keyword
    System.out.println(p.distanceTo(new Point(4, 5)));
  }
}
