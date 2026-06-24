import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountKeywords {

    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("Usage: java CountKeywords javaFile");
            System.exit(1);
        }

        String fileName = args[0];
        File file = new File(fileName);
        try{
            System.out.println("The program is");
            printFile(file);
            System.out.println("The numbers of keywords in the program is " + countKeywords(file));

        }catch(FileNotFoundException ex){
            System.out.println("File does not exist: " + fileName);
        }
    }

    public static void printFile(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static int countKeywords(File file) throws FileNotFoundException {
        int count = 0;
        int tempCount = 0;
        boolean wasString = false;
        String[] keywordString = {
            "abstract",
            "assert",
            "boolean",
            "break",
            "byte",
            "case",
            "catch",
            "char",
            "class",
            "const",
            "continue",
            "default",
            "do",
            "double",
            "else",
            "enum",
            "extends",
            "for",
            "final",
            "finally",
            "float",
            "goto",
            "if",
            "implements",
            "import",
            "instanceof",
            "int",
            "interface",
            "long",
            "native",
            "new",
            "package",
            "private",
            "protected",
            "public",
            "return",
            "short",
            "static",
            "strictfp",
            "super",
            "switch",
            "synchronized",
            "this",
            "throw",
            "throws",
            "transient",
            "try",
            "void",
            "volatile",
            "while",
            "true",
            "false",
            "null",
        };

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String token = scanner.next();

                if (token.equals("//")) {
                    scanner.nextLine();
                } else if (token.charAt(0) == '"') {
                    while (scanner.hasNext()) {
                        String tok = scanner.next();
                        if (keywordSet.contains(tok)) {
                            tempCount++;
                        }
                        if (tok.charAt(tok.length() - 1) == '"') {
                            wasString = true;
                            break;
                        }
                    }

                    if (!wasString) {
                        count += tempCount;
                    }
                } else {
                    if (keywordSet.contains(token)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
