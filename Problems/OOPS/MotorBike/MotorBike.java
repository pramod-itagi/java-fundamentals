package Problems.OOPS.MotorBike;

public class MotorBike {
  // state (Instance variable)
  // Default initial value for int will be 0
  private int speed;

  // Default constructor
  public MotorBike() {
  }

  // Parameterized constructor
  public MotorBike(int speed) {
    this.speed = speed;
  }

  // Behavior
  void start() {
    System.out.println("Bike Started");
  }

  /*
   * Note: For setter method, return type will be always void as we are not
   * returning anything
   */
  /*
   * It will be something like this. this refers to the object
   * 
   * void setSpeed(int speed) {
   * object.speed = speed; //
   * }
   */

  void setSpeed(int speed) { // speed is local variable for the given method.
    if (speed > 0)
      this.speed = speed; // this refers to object.
  }

  int getSpeed() {
    return speed;
  }

  public void increaseSpeed(int howMuch) {
    // this.speed += howMuch;
    setSpeed(this.speed + howMuch);
  }

  public void decreaseSpeed(int howMuch) {
    // this.speed -= howMuch;
    setSpeed(this.speed - howMuch);
  }
}
