# Running a Java Program Outside of JShell

Welcome! This guide explains how to write, compile, and execute a Java program outside of JShell. It provides an overview of key Java concepts and typical development steps.

## How Java Works

Computers only understand binary code (0's and 1's), but programmers write Java code in a human-readable format. To bridge this gap, a special software called a **compiler** translates your Java code into instructions the computer can execute.

### Java Program Lifecycle Steps (Example: macOS)

1. **Write your program** in a file ending with `.java`. Filename should be same as the class name. First character should be in uppercase.
2. **Compile the Java code** to convert it from human-readable form to machine-readable instructions.
   For this, run the following command:

```bash
javac <filename>.java
```

Example:

```bash
javac Country.java
```

This will generate a file called `Country.class`.

3. **The compiler generates a file called bytecode** (`.class` file). Bytecode is platform-independent and cannot be directly run on hardware. This will be generated only when compilation is successful without any errors.
4. **Run the bytecode file**. This can be done by running the following command: Note: Filename should be same as the class name and we should not use .class extension.

```bash
java <filename>
```

Example:

```bash
java Country
```

5. **Java Virtual Machine (JVM)**: Every operating system (like Windows, macOS, Linux) has its own version of the JVM. The JVM takes the bytecode and translates it into machine-specific instructions so the program runs on your computer.

**Note:** we need to have below main method in the program to run it.

```java
public static void main(String[] args) {
    System.out.println("Hello World");
}
```

Example:

```java
public static void main(String[] args) {
    System.out.println("Hello World");
}
```

This will print "Hello World" on the console. Main method is the entry point of the program and syntax should be same.

**Platform Independence:**  
A compiled Java `.class` file (bytecode) can run on any operating system with a compatible JVM. You don’t need to modify your Java code for different platforms.

**Visual Summary:**

```
Java Source File (.java) -> [Compile] -> Bytecode (.class) -> [Run] -> JVM (platform-specific) -> Machine Instructions
```

### Two Major Steps in Java Program Execution

1. **Compilation**: Converting source code (`.java`) into bytecode (`.class`).
2. **Execution**: Running the bytecode using the JVM.

---

## Important Java Concepts

### JVM (Java Virtual Machine)

- **Definition:** An engine that interprets compiled Java bytecode and translates it to machine-specific instructions for your OS.

## JRE (Java Runtime Environment)

- **Definition:** The environment in which Java programs run.
  JRE = JVM + Java libraries + Other libraries

## JDK (Java Development Kit)

- **Definition:** The complete package for developing Java applications.
  JDK = JRE + Compiler + Debugger

Basically,

JRE -> Application users
JDK -> Developers

### Classes and Objects

- **Class:** A blueprint or template representing a real-world entity.
  - _Examples:_ `Country`, `Car`, `Student`
- **Object:** An instance of a class, representing specific entities.
  - _Examples:_ `india`, `usa`, `toyota`, `honda`

#### How to Define a Class

```java
class ClassName {
    // class body
}
```

**Example:**

```java
class Country {
    // class body
}
```

#### How to Create an Object

```java
ClassName objectName = new ClassName();
```

**Example:**

```java
Country india = new Country();
Country usa = new Country();
```

Typically, a class encapsulates data (variables) and behaviors (methods). You can use methods to perform actions on that data, following the principles of object-oriented programming.
