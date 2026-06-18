public class Ex11_03_BankAccounts {
    public static void main(String[] args) {
        Account account = new Account(123, 10000);
        SavingsAccount savingsAccount = new SavingsAccount(456, 5000);
        CheckingAccount checkingAccount = new CheckingAccount(789, 1000, 300);

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);

        account.deposit(500);
        savingsAccount.deposit(200);
        checkingAccount.deposit(300);

        System.out.println();

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);


        account.withdraw(2000);
        savingsAccount.withdraw(6000);
        checkingAccount.withdraw(1400);
        checkingAccount.withdraw(500);

        System.out.println();

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);


    }
}
