package Problems.OOPS.Book;

public class BookRunner {
  public static void main(String[] args) {
    Book artOfComputerProgramming = new Book();
    Book effectiveJava = new Book();
    Book cleanCode = new Book();

    Book systemDesignConcepts = new Book(999);

    artOfComputerProgramming.setNoOfCopies(1000);
    effectiveJava.setNoOfCopies(800);
    cleanCode.setNoOfCopies(600);

    System.out.println("Number of copies of Art of Computer Programming: " + artOfComputerProgramming.getNoOfCopies());
    System.out.println("Number of copies of Art of Effective Java: " + effectiveJava.getNoOfCopies());
    System.out.println("Number of copies of Clean code: " + cleanCode.getNoOfCopies());
    System.out.println("Number of copies of System Design Concepts (initial): " + systemDesignConcepts.getNoOfCopies());

    artOfComputerProgramming.increaseNoOfCopies(100);
    effectiveJava.increaseNoOfCopies(200);
    cleanCode.increaseNoOfCopies(300);

    System.out.println("Number of copies of Art of Computer Programming after increasing: "
        + artOfComputerProgramming.getNoOfCopies());
    System.out.println("Number of copies of Art of Effective Java after increasing: " + effectiveJava.getNoOfCopies());
    System.out.println("Number of copies of Clean code after increasing: " + cleanCode.getNoOfCopies());

    artOfComputerProgramming.decreaseNoOfCopies(100);
    effectiveJava.decreaseNoOfCopies(200);
    cleanCode.decreaseNoOfCopies(300);

    System.out.println("Number of copies of Art of Computer Programming after decreasing: "
        + artOfComputerProgramming.getNoOfCopies());
    System.out.println("Number of copies of Art of Effective Java after decreasing: " + effectiveJava.getNoOfCopies());
    System.out.println("Number of copies of Clean code after decreasing: " + cleanCode.getNoOfCopies());
  }
}
