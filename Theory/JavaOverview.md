# Java Overview

Computers can only understand binary code—0s and 1s—which are known as machine instructions. Any program we write must eventually be converted into these machine-level instructions. However, these low-level instructions differ for each operating system.

## Platform Independence

When we write a Java program, we often want it to run on any platform or machine. This capability is known as platform independence, because the Java program is not tied to any one system or operating environment.

### How Does Java Achieve Platform Independence?

To address this, Java introduces an intermediate stage between our Java source file and the machine-specific instructions: **bytecode**. When a Java source file is compiled, it is transformed into bytecode. This bytecode is the same regardless of the operating system.

However, operating systems cannot directly execute Java bytecode—they only understand their own machine-specific instructions.

### Role of the JVM

So, how does bytecode get executed? That’s where the **Java Virtual Machine (JVM)** comes in.

- **JVM** stands for **Java Virtual Machine**.
- The JVM converts bytecode into machine-specific instructions.
- Each OS has its own JVM implementation, which translates the common Java bytecode into instructions understood by that particular operating system.

## Java Program Lifecycle

- **Compilation**: The process of turning a Java source file into bytecode. The result of compilation is a `.class` file containing bytecode.
- **Execution**: When we run a Java program (the bytecode/class file), the JVM translates the bytecode into machine-specific instructions, enabling it to run on the underlying system.

## Java Components

### 1. Class

A **class** is a template or blueprint representing a real-world entity. We use this template to create multiple instances of a class.

**Examples:**

- `Country` is a class
- `Student` is a class

**How to create a class:**

```java
class ClassName {
    // class body
}
```

> **Note:** The class name and the file name should be the same. Classes are not primitive data types.

---

### 2. Object

**Objects** are instances of a class. An instance refers to a specific, concrete realization of the class template; objects are the parts that make up a class.

**Example:**  
If `Country` is a class, then `india`, `usa`, and `china` are instances (objects) of that class.

**How to create an object:**

**Syntax:**

```java
ClassName objectName = new ClassName();
```

**Example:**

```java
Country india = new Country();
Country usa = new Country();
```

- `india` is an object of the `Country` class
- `usa` is an object of the `Country` class

> **Note:** You can create as many instances as you want from a class.

---

### 3. Methods

**Methods** are functions declared inside a class. To use these methods in the `main` method, you need to create an object of the class and then call the methods using that object.

**Syntax:**

```java
object.methodName();
```

**Example:**

```java
class Planet {
    void revolve() {
        System.out.println("Revolve");
    }

    public static void main(String[] args) {
        Planet earth = new Planet();

        // Call method using object
        earth.revolve();
    }
}
```

> **Note:**  
> If you want to call the `revolve` method without creating an object, or from outside the class, you should use `Planet.revolve()`. However, for this to work, the `revolve` method must be declared as `static`. Otherwise, you must use an object to call the method.

**Example:**

```java
static void revolve() {
    System.out.println("Revolve");
}

Planet.revolve();
```

### 4. Packages

**Packages** in Java are used to organize classes into different namespaces or directories. By grouping related classes together into packages, you can better structure your codebase and avoid class name conflicts. Each package typically corresponds to a folder in your project.

### 5. Comments

**Comments** are pieces of text added to code to provide explanations or context for anyone reading the code. Comments are ignored by the Java compiler and do not affect program execution. They are meant to help developers understand and maintain the code.

There are two main types of comments in Java:

- **Single-line comment:** Use `//` at the beginning of a line. Everything after `//` on that line is considered a comment.
- **Multi-line comment:** Enclosed between `/*` and `*/`. Everything inside will be ignored by the compiler.

**Examples:**

```java
// This is a single-line comment

/*
   This is a
   multi-line comment
*/
```

---

## Running Java Code Outside of JShell

1. Create a Java file with the `.java` extension using an appropriate file name. The file name should begin with an uppercase letter and follow camel case.  
   **Example:** `Planet.java`
2. Inside the `.java` file, define a class that has the same name as the file. Add your code and save the file.  
   **Example:**

   ```java
   class Planet {
       void revolve() {
           System.out.println("Revolve");
       }

       public static void main(String[] args) {
           Planet earth = new Planet();

           // Call method using object
           earth.revolve();
       }
   }
   ```

3. Open a terminal or command prompt in the directory containing this file.

4. To compile the file and generate the bytecode (`.class` file), run:

   ```
   javac Planet.java
   ```

   This will generate a `.class` file if there are no errors.

5. To run the `.class` file, use:
   ```
   java Planet
   ```
   (Run this command without any file extension. If there are no errors, the code will execute.)

> **Note:**  
> `public static void main(String[] args) {}` is the entry point for any Java program. Without this main method, the program will not execute. The syntax for the main method must remain exactly as shown and should not be changed.
> Semi colon (;) is required to end the statement. It need to be present after each statement.

## Difference Between JVM, JRE, and JDK

### JVM (Java Virtual Machine)

- **JVM** is responsible for converting Java bytecode into machine-specific instructions that can be executed by the operating system.
- The JVM is platform-dependent—there is a different JVM implementation for each operating system.
- The JVM is included in both the JRE and the JDK.

### JRE (Java Runtime Environment)

- **JRE** stands for Java Runtime Environment.
- JRE JVM + Java libraries + other supporting libraries.
- Java libraries include features like `System.out.println()`, data types, and various built-in functions.
- The JRE is typically intended for end users who want to run Java applications but do not need to develop them.

### JDK (Java Development Kit)

- **JDK** stands for Java Development Kit.
- JDK = JRE + compiler + debugger.
- The compiler is used to convert Java source code into bytecode.
- The debugger helps find and resolve issues in Java code.
- The JDK is intended for developers who write and compile Java applications.

**Summary:**

- JRE is for running Java applications (application users).
- JDK is for developing and running Java applications (application developers).
