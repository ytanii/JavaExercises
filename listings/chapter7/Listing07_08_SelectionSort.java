public class Listing07_08_SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {-3, 2, 9, 5, 10, 4, 100, 8, 1, 6};
        selectionSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");


        }

    }

    public static int[] selectionSort(int[] numbers) {
        int n = 0;
        while (n < numbers.length - 1) {
            int indexOfMin = n;
            int min = numbers[n];

            for (int i = n + 1; i < numbers.length; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                    indexOfMin = i;

                }
            }
            numbers[indexOfMin] = numbers[n];
            numbers[n] = min;
            n++;
        }
        return numbers;

    }
}
