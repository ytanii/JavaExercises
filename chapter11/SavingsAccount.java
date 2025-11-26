public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if ((super.getBalance() - amount) < 0) {
            System.out.println("Insufficient funds");
        } else {
            super.withdraw(amount);
        }

    }

    @Override
    public String toString() {
        return super.toString() + ", Type of Account: Savings";
    }
}
