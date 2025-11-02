import java.util.Scanner;

public class Ex8_19_ConsecutiveFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] values = new int[rows][columns];


        System.out.println("Enter the array: ");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = scanner.nextInt();
            }
        }


        if(isConsecutiveFour(values)){
            System.out.println("true");

        }else{
            System.out.println("false");
        }

    }
    public static boolean isConsecutiveFour(int[][] values){
        if (values.length == 0 || values[0].length == 0) {
            return false;
        }
        for(int i  = 0; i < values.length; i++){
            int count = 1;
            for(int j = 1; j < values[i].length; j++){
                if(values[i][j] == values[i][j-1]){
                    count++;
                    if(count == 4){
                        return true;
                    }
                }else{
                    count = 1;
                }

            }

        }

        for(int i  = 0; i < values[0].length; i++){
            int count = 1;
            for(int j = 1; j < values.length; j++){
                if(values[j][i] == values[j-1][i]){
                    count++;
                    if(count == 4){
                        return true;
                    }
                }else{
                    count = 1;
                }
            }

        }

        for(int i = 0; i < values.length-3; i++){
            for(int j = 0; j < values[i].length-3; j++) {
                int count = 1;
                for(int n = 1; n < 4; n++) {
                    if (values[i+n][j+n] == values[i][j]) {
                        count++;
                        if (count == 4) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < values.length - 3; i++) {
            for (int j = 3; j < values[i].length; j++) {
                int count = 1;
                for (int n = 1; n < 4; n++) {
                    if (values[i + n][j - n] == values[i][j]) {
                        count++;
                        if (count == 4) return true;
                    } else break;
                }
            }
        }

        return false;
    }
}
