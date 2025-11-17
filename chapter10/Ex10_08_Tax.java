import java.util.Scanner;

public class Ex10_08_Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Tax for single filer in 2009:");
                    break;
                case 1:
                    System.out.println("Tax for married jointly filer in 2009:");
                    break;
                case 2:
                    System.out.println("Tax for married separately filer in 2009:");
                    break;
                case 3:
                    System.out.println("Tax for head of household filer in 2009:");
                    break;
            }
            System.out.println("Income         Tax");
            for (int j = 50000; j <= 60000; j += 1000) {
                System.out.print(j + "        ");
                System.out.print(new Tax(i, new int[][]{{8350, 33950, 82250, 171550, 372950},
                        {16700, 67900, 137050, 208850, 372950},
                        {8350, 33950, 68525, 104425, 186475},
                        {11950, 45500, 117450, 190200, 372950}},
                        new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35}, j).getTotalTax() + "\n");
            }

        }
        System.out.println("\n\n");

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Tax for single filer in 2001:");
                    break;
                case 1:
                    System.out.println("Tax for married jointly filer in 2001:");
                    break;
                case 2:
                    System.out.println("Tax for married separately filer in 2001:");
                    break;
                case 3:
                    System.out.println("Tax for head of household filer in 2001:");
                    break;
            }
            System.out.println("Income         Tax");
            for (int j = 50000; j <= 60000; j += 1000) {
                System.out.print(j + "        ");
                System.out.print(new Tax(i, new int[][]{
                        {27050, 65550, 136750, 297350, 297351},
                        {45200, 109250, 166500, 297350, 297351},
                        {22600, 54625, 83250, 148675, 148676},
                        {36250, 93650, 151650, 297350, 297351}
                }, new double[]{0.15, 0.275, 0.305, 0.355, 0.391, 0.391}, j).getTotalTax() + "\n");
            }

        }


    }
}

