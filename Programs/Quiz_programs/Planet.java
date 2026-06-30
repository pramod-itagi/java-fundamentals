package Programs.Quiz_programs;

public class Planet {

  // Method to revolve planet
  void revolve() {
    System.out.println("Revolve");
  }

  public static void main(String[] args) {
    // create objects
    Planet earth = new Planet();
    Planet mars = new Planet();

    // call revolve method by using objects
    earth.revolve();
    mars.revolve();
  }
}

/*
 * Note:
 * If methods are having static keyword, then those methods can be accessed
 * directly without creating an object.
 * Example:
 * static void revolve() {
 * System.out.println("Revolve");
 * }
 * 
 * Then
 * Planet.revolve();
 * will work
 * 
 * For non-static methods, we need to create an object and then call the method
 * using the object.
 * Example:
 * void revolve() {
 * System.out.println("Revolve");
 * }
 * 
 * Then
 * Planet earth = new Planet();
 * earth.revolve();
 * will work
 */
