# Installing Java on Various Operating Systems

## Windows

### 1. Visit the Official Java Website

Open your browser and go to: [Java Download](https://www.oracle.com/in/java/technologies/downloads/).

### 2. Download the Java JDK

Choose the latest JDK version for Windows (x64).

### 3. Install Java

Run the downloaded installer and follow the prompts. It is recommended to keep the default installation directory.

### 4. Verify the Installation

After installation, open Command Prompt and enter:

```
java --version
```

or

```
jshell --version
```

> **Note:** In the latest versions, Java sets environment variables automatically. Manual configuration is only needed for older versions. Here, environmental variable refers to Java Path. This is to identify the Java installation directory in the system.

> **Note:** If you encounter issues or cannot locate the Java installation directory, you can manually configure the Java Path as follows:

1. Search for "environment variables" and open the "Edit the system environment variables" window.
2. Click the "Environment Variables" button.
3. Under "System variables," locate the "Path" variable and select "Edit."
4. Add the path to your Java installation directory to the list.
   Example: C:\Program Files\Java\jdk-26\bin
5. Use Move up button to move the Java installation directory to the top of the list.
6. Click "OK" to save your changes.
7. Restart your computer for the changes to take effect.

---

## macOS

### 1. Visit the Official Java Website

Open your browser and go to: [Java Download](https://www.oracle.com/in/java/technologies/downloads/).

### 2. Download the Java JDK

Always pick the latest JDK version.

- For Apple Silicon (M1/M2), download the ARM64 DMG installer.
- For Intel-based Macs, download the x64 version.

### 3. Install Java

Run the installer and follow the instructions, leaving the default installation path unchanged.

### 4. Verify the Installation

Open Terminal and type:

```
java --version
```

or

```
jshell --version
```

> **Note:** On macOS, Java configures the PATH automatically. No manual setup is required.

---

## Linux

### 1. Visit the Official Java Website

Open your browser and go to: [Java Download](https://www.oracle.com/in/java/technologies/downloads/).

### 2. Download the Java JDK

Always choose the latest JDK version.

- For Debian-based distributions (e.g., Ubuntu, Debian), download the **x64 .deb** package.
- For Red Hat-based distributions (e.g., CentOS, Fedora, Red Hat), download the **.rpm** package.

  _RPM_ (Red Hat Package Manager): Used by Red Hat-based distributions.  
  _DEB_ (Debian Package): Used by Debian-based distributions.

### 3. Install Java

Install Java using your package manager or by running the installer. Keeping the default installation location is recommended.

### 4. Verify the Installation

Open a terminal and enter:

```
java --version
```

or

```
jshell --version
```

> **Note:** Java path variables are set automatically on most modern Linux distributions—manual configuration is typically unnecessary.
