package Problems.OOPS.MotorBike;

public class MotorBikeRunner {
  public static void main(String[] args) {
    MotorBike ducati = new MotorBike();
    MotorBike honda = new MotorBike();

    // Parameterized constructor
    MotorBike suzuki = new MotorBike(999);

    // Actions performed on object
    ducati.start();
    honda.start();
    suzuki.start();

    // Changing state of an object
    /*
     * Making this commented as we can not access instance variable from other
     * class.
     * 
     * ducati.speed = 100;
     * honda.speed = 80;
     * 
     * ducati.speed = 80;
     * honda.speed = 0;
     */
    ducati.setSpeed(100);
    honda.setSpeed(80);

    System.out.println("Ducati speed: " + ducati.getSpeed());
    System.out.println("Honda speed: " + honda.getSpeed());
    System.out.println("Suzuki speed (initial): " + suzuki.getSpeed());

    // Get speed of both bikes. There is an alternate method. Call increaseSpeed()
    // method instead of doing this
    /*
     * int ducatiSpeed = ducati.getSpeed();
     * int hondaSpeed = honda.getSpeed();
     * 
     * // increase speed
     * ducatiSpeed += 20;
     * hondaSpeed += 50;
     * 
     * // Set speed of both bikes
     * ducati.setSpeed(ducatiSpeed);
     * honda.setSpeed(hondaSpeed);
     */

    // Call increaseSpeed to set speed of both bikes
    ducati.increaseSpeed(20);
    honda.increaseSpeed(50);

    System.out.println("Ducati speed after increase: " + ducati.getSpeed());
    System.out.println("Honda speed after increase: " + honda.getSpeed());

    // Call decreaseSpeed to set speed of both bikes
    ducati.decreaseSpeed(20);
    honda.decreaseSpeed(50);

    System.out.println("Ducati speed after decrease: " + ducati.getSpeed());
    System.out.println("Honda speed after decrease: " + honda.getSpeed());
  }
}
