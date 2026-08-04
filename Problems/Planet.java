package Problems;

public class Planet {
  // Method
  void revolve() {
    System.out.println("Revolve");
  }

  // Static method
  static void revolveAroundSun() {
    System.out.println("Revolve around sun");
  }

  public static void main(String[] args) {
    // create objects
    Planet earth = new Planet();
    Planet mars = new Planet();

    // call the method using objects created
    earth.revolve();
    mars.revolve();

    // Calling static method.
    Planet.revolveAroundSun();
  }
}
