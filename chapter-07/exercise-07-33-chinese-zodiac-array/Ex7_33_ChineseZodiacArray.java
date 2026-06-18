import java.util.Scanner;

public class Ex7_33_ChineseZodiacArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println(getYearAnimal(year));

    }

    public static String getYearAnimal(int year) {
        int index = year % 12;

        String[] animals = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        return animals[index];

    }
}
