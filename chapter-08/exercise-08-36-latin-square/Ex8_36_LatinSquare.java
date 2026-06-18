import java.util.Scanner;

public class Ex8_36_LatinSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number n: ");
        int sizeOfMatrix = scanner.nextInt();

        char[][] matrix = new char[sizeOfMatrix][sizeOfMatrix];

        char[] helper = new char[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            helper[i] = (char) ('A' + i);
        }

        System.out.println("Enter " + sizeOfMatrix + " rows of letters separated by spaces: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                char temp = scanner.next().charAt(0);
                if (temp < 'A' || temp > (char) ('A' + sizeOfMatrix - 1)) {
                    System.out.println("Wrong input: letters must be from A to " + (char) ('A' + sizeOfMatrix - 1));
                    System.exit(1);
                }
                matrix[i][j] = temp;
            }
        }

        if(isLatinSquare(matrix)){
            System.out.println("The input array is a Latin square");
        }else{
            System.out.println("The input is not a Latin square");
        }
    }

    public static boolean isLatinSquare(char[][] matrix) {
        char[] helper = new char[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            helper[i] = (char) ('A' + i);
        }

        for(int i = 0; i < matrix.length; i++){
            int[] helper2 = new int[matrix.length];
            for(int j = 0; j < matrix.length; j++){
                for(int n = 0; n < matrix.length; n++){
                    if(matrix[i][j] == helper[n]){
                        helper2[n]++;
                    }
                }
            }
            for(int j = 0; j < matrix.length; j++){
                if(helper2[j] != 1){
                    return false;

                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            int[] helper2 = new int[matrix.length];
            for(int j = 0; j < matrix.length; j++){
                for(int n = 0; n < matrix.length; n++){
                    if(matrix[j][i] == helper[n]){
                        helper2[n]++;
                    }
                }
            }
            for(int j = 0; j < matrix.length; j++){
                if(helper2[j] != 1){
                    return false;

                }
            }
        }


        return true;



    }
}
