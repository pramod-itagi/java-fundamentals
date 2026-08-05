package Problems.OOPS;

public class Cart {
  private int number;

  Cart() {
    this(5);
  }

  Cart(int number) {
    System.out.println("Constructor is called");
    this.number = number;
    System.out.println("Parameterized constructor is called");
  }

  public static void main(String[] args) {
    Cart cart1 = new Cart(); // Cart() is almost similar like a constructor itself
  }
}

/*
 * Note:
 * When we run the program, as soon as object is created, Cart() constructor
 * will get called and prints "Constructor is called".
 * 
 * Note:
 * When parameterized constructor is created, by default, it will not provide
 * default constructor as we have taken a control by creating parameterized
 * constructor.
 * 
 * We can call 1 constructor from other constructor. In the above example, when
 * we create an object, it will call default constructor. From that default
 * constructor, we are calling this(5) which calls Cart(int number)
 * parameterized constructor.
 * 
 * this always refers to the Constructor.
 */
