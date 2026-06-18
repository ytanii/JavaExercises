public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;

    }

    @Override
    public void withdraw(double amount) {
        if ((super.getBalance() - amount) < -overdraftLimit) {
            System.out.println("Withdrawal exceeds overdraft limit");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Type of Account: Checking with an overdraft limit of " + overdraftLimit;
    }


}