import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_18_AddPackageStatement {
    public static void main(String[] args) {
        File rootDir = new File("srcRootDirectory/");
        File[] files = rootDir.listFiles();

        if (files == null) return;

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                ArrayList<String> lines = new ArrayList<>();

                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        lines.add(scanner.nextLine());
                    }
                } catch (Exception ex) {
                    System.out.println("File not found");
                    continue;
                }

                try (PrintWriter output = new PrintWriter(file)) {
                    String packageName = file.getParentFile().getName();
                    output.println("package " + packageName + ";");
                    for (String line : lines) {
                        output.println(line);
                    }
                } catch (Exception ex) {
                    System.out.println("Error");
                }
            }
        }
    }
}
