# Introduction to JShell

JShell is a REPL (Read-Eval-Print Loop) tool that enables you to execute Java code interactively. As a command-line utility, it offers a quick and easy way to write and test Java code snippets without the need to create an entire program.

Introduced in Java 9, JShell is designed for learning, experimenting, and testing Java code or new APIs. With JShell, you can enter individual statements, and the tool provides immediate feedback with the results.

To start JShell, open your command prompt or terminal and type:

```
jshell
```

You should see an output similar to:

```
|  Welcome to JShell -- Version 9.0.4
|  For an introduction type: /help intro
jshell>
```

Some useful JShell commands:

- `/help intro`: Displays an introduction to JShell.
- `/methods`: Displays all the methods which have been defined in the current session.
- `/save backup.txt`: Saves the current session to a file in present working directory (pwd).
- `/edit methodName`: Opens the method in the editor so that we can make changes to the method.
- `/list methodName`: Displays the code of the method.
- `/exit`: Exits JShell.

JShell makes it easy to experiment with Java code and see the results instantly, which is especially helpful for learning and exploration.

## Command History Navigation

You can use the **Up** and **Down** arrow keys to scroll through the history of commands you have previously entered.

## Editing Statements

- Press **Ctrl + A** to move the cursor to the beginning of the current line.
- Press **Ctrl + E** to move the cursor to the end of the current line.

## Searching Statements

To search through previously entered statements, use **Ctrl + R**. Press **Ctrl + R** repeatedly to cycle through additional matches in your history.

Note: Each time you execute an expression or statement in JShell, the result is automatically stored in a special variable named with a dollar sign and a number (such as $1, $2, etc.). You can use these variables to reference the result of a previous expression in subsequent commands.

Example:

```
int a = 10;
int b = 20;
a + b
$1 => 30

// Now, you can use $1, which contains the result of a + b, in the next expression:
$1 + 10
$2 => 40
```
