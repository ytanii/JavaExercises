import java.util.Scanner;

public class Ex8_12_ComputeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayStatusChoices();
        System.out.print("Enter filing status: ");
        int statusNumber = scanner.nextInt();

        System.out.print("Enter amount of taxable income in dollars: ");
        double totalTaxableIncome = scanner.nextDouble();

        System.out.println("Tax is " + getTotalTax(totalTaxableIncome,statusNumber));


    }

    public static void displayStatusChoices() {
        String[] statuses = {"Single Filer", "Married Jointly", "Married Separately", "Head of Household"};

        for (int i = 0; i < statuses.length; i++) {
            System.out.println(i + " for " + statuses[i]);
        }
    }

    public static double getTotalTax(double totalTaxableIncome, int statusNumber) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        if(brackets[statusNumber][4] < totalTaxableIncome ){
            return brackets[statusNumber][0] * rates[0] +   (brackets[statusNumber][1] - brackets[statusNumber][0]) * rates[1] +   (brackets[statusNumber][2] - brackets[statusNumber][1]) * rates[2] +   (brackets[statusNumber][3] - brackets[statusNumber][2]) * rates[3] +   (brackets[statusNumber][4] - brackets[statusNumber][3]) * rates[4] +   (totalTaxableIncome - brackets[statusNumber][4]) * rates[5];

        }else if(brackets[statusNumber][3] < totalTaxableIncome){
            return brackets[statusNumber][0] * rates[0] +   (brackets[statusNumber][1] - brackets[statusNumber][0]) * rates[1] +   (brackets[statusNumber][2] - brackets[statusNumber][1]) * rates[2] +   (brackets[statusNumber][3] - brackets[statusNumber][2]) * rates[3] +   (totalTaxableIncome - brackets[statusNumber][3]) * rates[4];


        }else if(brackets[statusNumber][2] < totalTaxableIncome){
            return brackets[statusNumber][0] * rates[0] +   (brackets[statusNumber][1] - brackets[statusNumber][0]) * rates[1] +   (brackets[statusNumber][2] - brackets[statusNumber][1]) * rates[2] +   (totalTaxableIncome - brackets[statusNumber][2]) * rates[3];

        }else if(brackets[statusNumber][1] < totalTaxableIncome){
            return brackets[statusNumber][0] * rates[0] +   (brackets[statusNumber][1] - brackets[statusNumber][0]) * rates[1] +   (totalTaxableIncome - brackets[statusNumber][1]) * rates[2];

        }else if(brackets[statusNumber][0] < totalTaxableIncome){
            return brackets[statusNumber][0] * rates[0] +   (totalTaxableIncome - brackets[statusNumber][0]) * rates[1];

        }else{
            return totalTaxableIncome * rates[0];
        }

    }


}
