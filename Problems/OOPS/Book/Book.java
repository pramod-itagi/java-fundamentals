package Problems.OOPS.Book;

public class Book {
  private int noOfCopies;

  // Default constructor
  public Book() {
  }

  // Parameterized constructor
  public Book(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  public int getNoOfCopies() {
    return noOfCopies;
  }

  void setNoOfCopies(int noOfCopies) {
    if (noOfCopies > 0)
      this.noOfCopies = noOfCopies;
  }

  void increaseNoOfCopies(int howMuch) {
    setNoOfCopies(noOfCopies + howMuch);
  }

  void decreaseNoOfCopies(int howMuch) {
    setNoOfCopies(noOfCopies - howMuch);
  }
}
