package Problems;

public class Country {
  void comingSoon() {
    System.out.println("Coming soon!");
  }

  public static void main(String[] args) {
    Country india = new Country();
    Country usa = new Country();

    // call method using objects
    india.comingSoon();
    usa.comingSoon();
  }
}
