
<img width="1390" alt="Screenshot 2025-07-04 at 4 37 48 PM" src="https://github.com/user-attachments/assets/a8e14e76-2f3e-47d3-88c1-472b9e82fe3d" />


# FILE-HANDLING-UTILITY.

**COMPANY:** CODTECH IT SOLUTIONS  
**NAME:** Sidhi Grover  
**INTERN ID:** CT06DF949  
**DOMAIN:** Java Programming  
**DURATION:** 6 Weeks  
**MENTOR:** Neela Santosh


## 📂 File Operations Utility in Java

**COMPANY:** CODTECH IT SOLUTIONS  
**NAME:** Sidhi Grover  
**INTERN ID:** CT06DF949  
**DOMAIN:** Java Programming  
**DURATION:** 6 Weeks  
**MENTOR:** Neela Santosh  

---

## 📚 Description

This project is a **simple file operations utility implemented in Java**.  
It demonstrates how to create, write, read, append, search & replace, and analyze the contents of a text file using standard Java I/O.

The core of this application revolves around **Java’s `File`, `BufferedWriter`, `BufferedReader`, `FileWriter`, `FileReader`, and `Files` classes**, giving a clear foundation for handling file systems in Java.

---

## ⚙️ How It Works

## 📝 The `Fileoperation` class

The entire functionality is organized inside a single Java class `Fileoperation`, which includes:

- ✅ `createFile`: creates a new file if it does not exist.
- ✅ `writeToFile`: writes content, overwriting existing data.
- ✅ `readFromFile`: reads and prints file line by line.
- ✅ `appendToFile`: appends additional content to existing data.
- ✅ `searchAndReplace`: replaces a specific string throughout the file.
- ✅ `countWordsAndLines`: counts total lines and words in the file.

This makes it modular, so each method performs a specific file operation cleanly.

---

## 🚀 Flow of Execution

When you run the program, it performs the following:

1. 🗂 **Creates a file** named `codtech.txt` if it doesn’t already exist.
2. ✍ **Writes** an initial message:
   ```
   Hello! CodeTech.
   Welcome to Java file operations.
   ```
3. 📖 **Reads the file** and prints its contents.
4. ➕ **Appends** another line:
   ```
   Here is some more content added later.
   ```
5. 🔁 **Replaces** the word `"Java"` with `"Advanced Java"`.
6. 📖 **Reads again** to show updated content.
7. 📊 **Counts lines and words**, printing simple file stats.

---

## 🔍 Detailed Explanation

This project demonstrates how to:

- 🔌 Use `File` for file creation & checking existence.
- 📝 Write data with `BufferedWriter` + `FileWriter`.
- 📖 Read data line by line using `BufferedReader` + `FileReader`.
- ➕ Append content without overwriting old data.
- 🔍 Replace text efficiently with `Files.readString` and `Files.writeString`.
- 📊 Count lines and words for basic text analytics.

---

## ✨ Why is this useful?

- 🧠 Helps understand **Java file I/O fundamentals** every programmer needs.  
- 🚀 Shows how to handle exceptions using `try-catch`, making your code robust.  
- 🔥 Lays groundwork for more advanced applications like log processors, simple text editors, or file-based databases.

---

## 🛠️ Getting Started

## ✅ To compile and run:
```bash
javac -d . Fileoperation.java
java main.java.org.example.Fileoperation
```

This executes all operations sequentially and prints results to your console.

---
