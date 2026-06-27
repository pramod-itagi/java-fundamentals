# Java Installation

Install **Oracle JDK 25** from the [Java Downloads](https://www.oracle.com/java/technologies/downloads/) page. This is the version used in this course.

## Verify Installation

After installing, run these commands in a terminal:

```bash
java --version
jshell --version
```

Both commands should report version **25**.

## Windows

> For JDK 25 and above, the installer sets up PATH automatically. Manual configuration is usually not required.

1. Download **JDK 25** → **Windows x64 Installer**
2. Run the installer and follow the on-screen steps
3. Use the default install path:

   ```text
   C:\Program Files\Java\jdk-25
   ```

### Troubleshooting

If `java` is not recognized:

1. Open **Edit the system environment variables**
2. Go to **Environment Variables**
3. Under **System variables**, select **Path** → **Edit**
4. Confirm this entry exists (add it with **New** if missing):

   ```text
   C:\Program Files\Java\jdk-25\bin
   ```

5. Move the entry to the top, save, and restart Command Prompt

## macOS

1. Download **JDK 25** from Oracle
2. Choose the installer for your Mac:

   | Mac type                 | Installer |
   | ------------------------ | --------- |
   | Apple Silicon (M1/M2/M3) | ARM64 DMG |
   | Intel                    | x64 DMG   |

3. Open the DMG, run the installer, and enter your password when prompted

## Linux

1. Download **JDK 25** → **Linux**
2. Choose the package for your distro:

   | Package         | Distros              |
   | --------------- | -------------------- |
   | Debian (`.deb`) | Ubuntu, Debian       |
   | RPM (`.rpm`)    | Fedora, CentOS, RHEL |

3. Install the package with your system's package manager
