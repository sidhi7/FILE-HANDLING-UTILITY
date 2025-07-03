package main.java.org.example;

import java.io.*;
import java.nio.file.*;

public class Fileoperation {

    // Method to create a new file
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("🆕 File created::: " + file.getName());
            } else {
                System.out.println("ℹ️ File already exists.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error creating file: " + e.getMessage());
        }
    }

    // Method to write content to the file (overwrites existing content)
    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("✅ File written successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    // Method to read and print the content of the file
    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\n📖 Reading File:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    // Method to append content to the file
    public static void appendToFile(String fileName, String newContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write(newContent);
            System.out.println("✏️ Content appended successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error appending to file: " + e.getMessage());
        }
    }

    // Method to search and replace text in the file
    public static void searchAndReplace(String fileName, String search, String replace) {
        try {
            Path path = Paths.get(fileName);
            String content = Files.readString(path);
            content = content.replaceAll(search, replace);
            Files.writeString(path, content);
            System.out.println("🔁 Text replaced successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error replacing text: " + e.getMessage());
        }
    }

    // Method to count words and lines in the file
    public static void countWordsAndLines(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            int wordCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
            }

            System.out.println("\n📊 File Statistics:");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
        } catch (IOException e) {
            System.out.println("❌ Error reading file for stats: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "codtech.txt";
        String initialContent = "Hello! CodeTech.\nWelcome to Java file operations.";
        String additionalContent = "Here is some more content added later.";
        String searchWord = "Java";
        String replacement = "Advanced Java";

        // 1. Create a new file
        createFile(fileName);

        // 2. Write to the file
        writeToFile(fileName, initialContent);

        // 3. Read file content
        readFromFile(fileName);

        // 4. Append content
        appendToFile(fileName, additionalContent);

        // 5. Search and replace text
        searchAndReplace(fileName, searchWord, replacement);

        // 6. Read file again after modification
        readFromFile(fileName);

        // 7. Count words and lines
        countWordsAndLines(fileName);
    }
}
