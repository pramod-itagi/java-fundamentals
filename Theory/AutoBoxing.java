package Theory;

public class AutoBoxing {
  public static void main(String[] args) {
    /*
     * AutoBoxing:
     * It is the process of converting a primitive data type to its corresponding
     * wrapper class object.
     * 
     * Example:
     * Integer seven = Integer.valueOf(7);
     * Integer seven = 7;
     * 
     * Here, the first statement is manual boxing and the second statement is auto
     * boxing.
     * 
     * Behind the scenes, compiler will convert the second statement to the first
     * statement. It means, it uses valueOf method internally.
     * 
     * Because of this, even if we compare values using == operator, it will return
     * true because they are pointing to the same memory location.
     */
    // Manual boxing
    Integer seven = Integer.valueOf(7);
    System.out.println(seven);

    // Auto boxing
    Integer six = 6;
    System.out.println(six);
  }
}
