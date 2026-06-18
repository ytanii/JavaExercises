public class Ex8_16_SortTwoDimensionalArray {
    public static void main(String[] args) {

        int[][] twoDimensionalArray = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};


        System.out.println("Unsorted: ");
        displayArray(twoDimensionalArray);


        sort(twoDimensionalArray);

        System.out.println();

        System.out.println("Sorted:");
        displayArray(twoDimensionalArray);


    }

    public static void displayArray(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void sort(int[][] m) {
        int indexOfMin = 0;

        for (int i = 0; i < m.length; i++) {
            int min = m[i][0];
            for (int j = i + 1; j < m.length; j++) {
                if (min > m[j][0]) {
                    indexOfMin = j;
                    min = m[j][0];
                }
            }

            int helper = m[i][0];
            int helper2 = m[i][1];
            m[i][0] = m[indexOfMin][0];
            m[i][1] = m[indexOfMin][1];
            m[indexOfMin][0] = helper;
            m[indexOfMin][1] = helper2;

        }


        for (int i = 0; i < m.length; i++) {
            int min = m[i][1];
            for (int j = i + 1; j < m.length; j++) {
                if (min > m[j][1]) {
                    indexOfMin = j;
                    min = m[j][1];
                }
            }

            if (m[i][0] == m[indexOfMin][0]) {
                int helper2 = m[i][1];
                m[i][1] = m[indexOfMin][1];
                m[indexOfMin][1] = helper2;
            }

        }


    }
}
