package Programs.Course_programs;

public class InbuiltMethods {
  public static void main(String[] args) {
    /*
     * There are many predefined methods or functions in java.
     * There are some of the Mathematical methods which are predefined in
     * java.lang.Math class.
     * 
     * Math.random(): This is used to get random value between 0 and 1
     * It does not expect any parameter.
     * But it requires empty brackets.
     * 
     * Note: Each method will require brackets while calling them.
     */
    System.out.println(Math.random());

    /*
     * Math.min(a, b)
     * This is used to get the minimum value between two numbers.
     * If we pass empty brackets, it will throw an error as it expects two
     * parameters.
     * 
     * Parameters should be separated by comma. Otherwise it will throw an error.
     */
    System.out.println(Math.min(23, 5));

    /*
     * Math.max(a, b)
     * This is used to get the maximum value between two numbers.
     * If we pass empty brackets, it will throw an error as it expects two
     * parameters.
     * 
     * Parameters should be separated by comma. Otherwise it will throw an error.
     */
    System.out.println(Math.max(23, 5));
  }
}
