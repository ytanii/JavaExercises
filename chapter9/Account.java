//import java.util.Date;
//
//public class Account {
//    private int id;
//    private double balance;
//    private static double annualInterestRate = 0;
//    private Date dateCreated;
//
//    public Account() {
//        this(0, 0);
//
//    }
//
//    public Account(int id, double balance) {
//        this.id = id;
//        this.balance = balance;
//        dateCreated = new Date();
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public double getBalance() {
//        return this.balance;
//    }
//
//    public static double getAnnualInterestRate() {
//        return Account.annualInterestRate;
//    }
//
//    public Date getDateCreated() {
//        return new Date(this.dateCreated.getTime());
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public static void setAnnualInterestRate(double annualInterestRate) {
//        Account.annualInterestRate = annualInterestRate;
//    }
//
//    public double getMonthlyInterestRate() {
//        return Account.annualInterestRate / 12;
//    }
//
//    public double getMonthlyInterest() {
//        return (getMonthlyInterestRate() / 100) * this.balance;
//    }
//
//    public void withdraw(double amount) {
//        this.balance -= amount;
//    }
//
//    public void deposit(double amount) {
//        this.balance += amount;
//    }
//
//    @Override
//    public String toString() {
//        return "Account ID: " + this.id + ", Balance: " + this.balance + ", Date created: " + dateCreated;
//
//    }
//
//}
