import java.util.Scanner;

public class Ex12_03_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] list = createRandomArray();
        System.out.print("Enter an index for an array of size 100: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int index = scanner.nextInt();
            System.out.println("The number at index " + index + " is " + list[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");

        }

    }

    public static int[] createRandomArray() {
        int[] list = new int[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 101);
        }

        return list;
    }
}
