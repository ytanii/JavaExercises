import java.util.Date;

public class Ex12_04_LoanWithExceptions {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Ex12_04_LoanWithExceptions() {
        this(2.5, 1, 1000);
    }

    public Ex12_04_LoanWithExceptions(double annualInterestRate, int numberOfYears, double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
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
        if(annualInterestRate >= 0) {
            this.annualInterestRate= annualInterestRate;
        }else{
            throw new IllegalArgumentException("Interest Rate cannot be negative");
        }
    }

    public void setNumberOfYears(int numberOfYears) {
        if(numberOfYears >= 0) {
            this.numberOfYears = numberOfYears;
        }else{
            throw new IllegalArgumentException("Number of Years cannot be negative");
        }
    }

    public void setLoanAmount(double loanAmount) {
        if(loanAmount >= 0) {
            this.loanAmount = loanAmount;
        }else{
            throw new IllegalArgumentException("Loan Amount cannot be negative");
        }
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = this.annualInterestRate / 1200;
        return this.loanAmount * monthlyInterestRate / (1 - 1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;

    }
}
