import java.util.Scanner;

public class Ex9_07_Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);

        account.deposit(3000);


        System.out.printf(
                "Account %d: balance = $%.2f, monthly interest = $%.2f, created on %s%n",
                account.getId(),
                account.getBalance(),
                account.getMonthlyInterest(),
                account.getDateCreated()
        );
    }
}
