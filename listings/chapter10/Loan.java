import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public Date getLoanDate() {
        return new Date(loanDate.getTime());
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = this.annualInterestRate / 1200;
        return this.loanAmount * monthlyInterestRate / (1 - 1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;

    }
}
