import java.util.Date;
import java.util.ArrayList;

public class Account {
    public static final char withdrawChar = 'W';
    public static final char depositChar = 'D';

    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account() {
        this(0, 0);
        transactions = new ArrayList<>();

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(String name, int id, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public static double getAnnualInterestRate() {
        return Account.annualInterestRate;
    }

    public Date getDateCreated() {
        return new Date(this.dateCreated.getTime());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return Account.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return (getMonthlyInterestRate() / 100) * this.balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        transactions.add(new Transaction(withdrawChar, amount, this.balance, "withdraw " + amount + " dollars"));


    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction(depositChar, amount, this.balance, "deposit " + amount + " dollars"));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < transactions.size(); i++) {
            stringBuilder.append(transactions.get(i) + "\n");

        }
        return " Account holder name: " + this.name + "\n Account ID: " + this.id + "\n Balance: " + this.balance + "\n Date created: " + dateCreated + "\n Interest rate: " + this.getMonthlyInterestRate() + "% \nTransaction history: \n" + stringBuilder;

    }

}
