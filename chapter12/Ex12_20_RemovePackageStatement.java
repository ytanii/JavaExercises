import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_20_RemovePackageStatement {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 <srcRootDirectory>");
            return;
        }

        File srcRootDirectory = new File(args[0]);
        if (!srcRootDirectory.exists() || !srcRootDirectory.isDirectory()) {
            System.out.println("Invalid root directory.");
            return;
        }

        for (int i = 1; i <= 34; i++) {
            File chapterDir = new File(srcRootDirectory, "chapter" + i);
            if (chapterDir.exists() && chapterDir.isDirectory()) {
                removePackageStatement(chapterDir);
            }
        }
    }

    private static void removePackageStatement(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                removePackageStatement(file);
            } else if (file.getName().endsWith(".java")) {
                try {
                    // Read original file
                    ArrayList<String> lines = new ArrayList<>();
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        lines.add(scanner.nextLine());
                    }
                    scanner.close();

                    // Remove package statement if it exists in the first line
                    if (!lines.isEmpty() && lines.get(0).startsWith("package ")) {
                        lines.remove(0);
                    }

                    // Write back to the file
                    PrintWriter writer = new PrintWriter(file);
                    for (String line : lines) {
                        writer.println(line);
                    }
                    writer.close();

                } catch (IOException e) {
                    System.out.println("Error processing file: " + file.getAbsolutePath());
                    e.printStackTrace();
                }
            }
        }
    }
}