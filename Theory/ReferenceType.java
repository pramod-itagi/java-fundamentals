package Theory;

public class ReferenceType {
  public static void main(String[] args) {
    /*
     * Reference Type:
     * Reference type are the classes which are created by the user. They are not
     * primitive types.
     * 
     * Reference variables:
     * Reference variables are the instance variables of the reference type.
     * 
     * Example:
     * class Planet {
     * Planet earth = new Planet();
     * }
     * 
     * Here:
     * Planet: Planet class is a reference type.
     * earth: Reference variable of the Planet class.
     * 
     * Pre-defined reference types are:
     * 1. String
     * 2. BigDecimal
     * 3. LocalDate and LocalDateTime
     * 4. Wrapper classes
     * 
     */

    /*
     * Example on how reference variables and primitive variables are stored in
     * memory
     * 
     * class Animal {
     * int id;
     * 
     * Animal(int id) {
     * this.id = id;
     * }
     * }
     * 
     * Animal dog = new Animal(12);
     * Animal cat = new Animal(15);
     * Animal nothing; // null as for objects, default value will be null
     * 
     * Now:
     * There are 2 types of memory which program uses while running:
     * 1. Stack
     * 2. Heap
     * 
     * When objects are created, they are stored in Heap memory.
     * Heap memory shared across java program.(Globally)
     * 
     * Heap memory:
     * Location | Object
     * 1A | Animal12
     * 1B |
     * 1C | Animal15
     * 
     * Now:
     * When primitive variables are created, they are created in stack memory.
     * But for the reference variable gets stored in Stack memory.
     * Under value column: It references the memory location of the heap memory
     * where Animal12 is stored (Actual dog)
     * 
     * Under variable-name column: object name "dog" is stored.
     * 
     * Same way for cat as well.
     * 
     * Stack memory:
     * Location | Value | variable-name
     * A | 5 | i
     * B | |
     * C | 1A | dog
     * D | 1C | cat
     * E | null | nothing
     * 
     * Note:
     * Why it is called as reference variable is because it doesn't store the
     * actual value. Instead it stores the memory location where actual dog value is
     * stored in heap memory.
     * 
     * When I try to store nothing into cat
     * nothing = cat;
     * 
     * D | 1C | cat
     * E | 1C | nothing
     * 
     * It copies the memory location of cat into nothing
     * 
     * Now:
     * nothing.id = 10;
     * cat.id = 10;
     * 
     * Because it references 1C location in heap and it will get will get updated
     * from Animal15 to Animal10
     * 
     * But in case of primitive variables,
     * int j = 99;
     * B | 99 | j
     * 
     * and if we say i = j
     * A | 99 | i
     * B | 99 | j
     * 
     * Here it copies values directly for primitive variables where as for reference
     * variables, it copies memory location.
     * 
     * Now:
     * Comparison of reference variables:
     * 
     * lets say,
     * Animal dog2 = new Animal(12)
     * 
     * Heap:
     * 1E | Animal12
     * 
     * Stack:
     * E | 1E | dog2
     * 
     * Now compare them:
     * cat == dog => false
     * cat == nothing => true (Same object)
     * dog == dog2 => false (Because memory locations are different eben though
     * values are same)
     * 
     * Note: while comparing reference variables, memory locations (objects) are
     * compared. But for primitive variables, values are compared.
     */
  }
}
