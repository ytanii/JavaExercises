import java.util.Scanner;

public class Ex11_10_MyStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack stack = new MyStack();

        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }

        System.out.println(stack.getSize() + " strings are: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}


