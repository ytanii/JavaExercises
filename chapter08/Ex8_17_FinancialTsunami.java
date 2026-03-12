import java.util.Scanner;

public class Ex8_17_FinancialTsunami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of banks:");
        int numberOfBanks = scanner.nextInt();

        System.out.print("Enter limit: ");
        double limit = scanner.nextDouble();
        double[][] borrowers = new double[numberOfBanks][numberOfBanks];

        System.out.println("Enter banks and borrowers: ");

        double[] balance = new double[numberOfBanks];
        for (int i = 0; i < numberOfBanks; i++) {
            balance[i] = scanner.nextDouble();
            int numberOfBorrowers = scanner.nextInt();
            for (int n = 0; n < numberOfBorrowers; n++) {
                int borrowerBankNumber = scanner.nextInt();
                double amount = scanner.nextDouble();
                if (i != borrowerBankNumber) {
                    borrowers[i][borrowerBankNumber] = amount;
                }
            }

        }
        boolean[] unsafeBanks = new boolean[numberOfBanks];
        for (int n = 0; n < numberOfBanks; n++) {
            for (int i = 0; i < balance.length; i++) {
                double totalAssets = 0;
                for (int j = 0; j < borrowers[i].length; j++) {
                    totalAssets += borrowers[i][j];

                }
                totalAssets += balance[i];
                if (totalAssets < limit) {
                    unsafeBanks[i] = true;
                    for (int j = 0; j < borrowers[i].length; j++) {
                        borrowers[j][i] = 0;
                    }

                }

            }
        }

        System.out.print("Unsafe banks are ");

        for (int i = 0; i < unsafeBanks.length; i++) {
            if (unsafeBanks[i]) {
                System.out.print(" " + i);
            }

        }


    }
}
