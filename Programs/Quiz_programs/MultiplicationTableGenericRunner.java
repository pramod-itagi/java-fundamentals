package Programs.Quiz_programs;

public class MultiplicationTableGenericRunner {
  public static void main(String[] args) {
    MultiplicationTableGeneric multiplicationTableGeneric = new MultiplicationTableGeneric();

    // Method overloading
    multiplicationTableGeneric.printTable();
    multiplicationTableGeneric.printTable(5);
  }
}
