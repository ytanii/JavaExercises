public class Ex7_36_EightQueens {
    public static void main(String[] args) {
        int[] queens = new int[8];
        for (int i = 0; i < 8; i++) {
            queens[i] = -1;
        }

        int row = 0;

        while (row >= 0) {

            queens[row]++;
            while (queens[row] < 8 && !isSafe(queens, row)) {
                queens[row]++;
            }

            if (queens[row] < 8) {
                if (row == 7) {

                    printBoard(queens);
                    return;

                }

                row++;
                queens[row] = -1;

            } else {
                row--;
            }

        }
    }

    public static boolean isSafe(int[] q, int r) {
        for (int i = 0; i < r; i++) {

            if (q[i] == q[r] || Math.abs(q[i] - q[r]) == Math.abs(i - r)) {
                return false;

            }
        }

        return true;
    }

    public static void printBoard(int[] q) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (q[i] == j) {
                    System.out.print("|Q");
                } else {
                    System.out.print("| ");
                }
            }

            System.out.println("|");
        }
    }
}