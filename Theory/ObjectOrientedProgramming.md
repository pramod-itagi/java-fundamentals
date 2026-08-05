# Object Oriented Programming

There are two types of programming:

1. Procedural / Structural programming
2. Object Oriented programming

**Procedural / Structural programming:**  
This approach focuses on thinking in terms of procedures or functions. When faced with a problem, you divide it into smaller parts using functions.

**Example:**  
Suppose you want to take a flight. The steps involved could be represented as:

```
fly {
   bookFlight()
   travelToAirport()
   checkIn()
   passSecurityChecks()
   board()
   fly()
   land()
   checkOut()
}
```

**Object Oriented programming:**  
This approach is about thinking in terms of objects, considering what data they have and what actions can be performed on them.

**Example:**  
Again, suppose you want to take a flight. The steps might involve different objects:

- `Airplane`
  - Data: `airlineName`, `model`, `type`
  - Actions: `fly()`, `takeOff()`, `land()`

- `Passenger`
  - Data: `name`, `dob`, `passportNo`
  - Actions: `travel()`, `walk()`, `checkIn()`

**State:**  
The "state" of an object is simply the data it holds, like values stored in variables. For example, a `Car` object might have a color and speed as its state. The state can change as the program runs.

**Behavior:**  
The "behavior" of an object is what it can do, or what actions it can perform. These are the functions or methods of the object, like a `Car` object having a `drive()` or `brake()` method.

**Instance Variable:**  
Instance variables are the variables that belong to each object created from a class. You can only use them through a specific object (not directly from the class itself).

**Encapsulation:**  
Encapsulation means keeping the data (variables) of a class private, so they can't be changed directly from outside the class. If another class wants to access or update the data, it must use special methods. This protects the data and lets you check or control changes to it.

**Constructor:**  
A constructor is a special method that runs when you create an object. It doesn't have a return type, and its name is the same as the class. Constructors are used to set the starting values for an object's state.

There are two main types of constructors:

1. **Default Constructor:** Runs when you create an object without giving any information. If you don't write a constructor, the computer provides one by default.
2. **Parameterized Constructor:** Runs when you create an object and give it some starting values as arguments.

Example:

```
class Student {
  String name;
  int age;

  // Parameterized Constructor: use when you know the name and age
  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Default Constructor: use if no details are given
  Student() {
    this.name = "John";
    this.age = 20;
  }
}
```
