package Programs.Quiz_programs;

public class MultiplicationTableGeneric {
  void printTable() {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
    }
  }

  void printTable(int table) {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", table, i, table * i).println();
    }
  }
}
