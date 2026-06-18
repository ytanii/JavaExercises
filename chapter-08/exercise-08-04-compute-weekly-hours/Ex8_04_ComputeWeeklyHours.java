import java.util.Scanner;

public class Ex8_04_ComputeWeeklyHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},
        };

        int[] weeklyHours = getWeeklyHours(workHours);

        int[] employeeNumber = {0, 1, 2, 3, 4, 5, 6, 7};

        sort(weeklyHours, employeeNumber);

        for (int i = 0; i < weeklyHours.length; i++) {
            System.out.println("Employee " + employeeNumber[i] + "'s total weekly hours is " + weeklyHours[i]);

        }

    }

    public static int[] getWeeklyHours(int[][] workHours) {
        int[] weeklyHourPerEmployee = new int[8];
        int sum = 0;
        for (int employee = 0; employee < workHours.length; employee++) {
            sum = 0;
            for (int hours = 0; hours < workHours[employee].length; hours++) {
                sum += workHours[employee][hours];

            }
            weeklyHourPerEmployee[employee] = sum;
        }

        return weeklyHourPerEmployee;

    }

    public static void sort(int[] weeklyHours, int[] employeeNumber) {
        for (int n = 0; n < weeklyHours.length; n++) {
            int max = weeklyHours[n];
            int indexOfMax = n;
            for (int i = n + 1; i < weeklyHours.length; i++) {
                if (max < weeklyHours[i]) {
                    max = weeklyHours[i];
                    indexOfMax = i;
                }
            }

            weeklyHours[indexOfMax] = weeklyHours[n];
            weeklyHours[n] = max;

            int helper = employeeNumber[n];
            employeeNumber[n] = employeeNumber[indexOfMax];
            employeeNumber[indexOfMax] = helper;

        }

    }


}
