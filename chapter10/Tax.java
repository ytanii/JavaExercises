public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        this(0, new int[][]{{8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}}, new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35}, 1000);

    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        switch (filingStatus) {
            case 0:
                this.filingStatus = SINGLE_FILER;
                break;
            case 1:
                this.filingStatus = MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;
                break;
            case 2:
                this.filingStatus = MARRIED_SEPARATELY;
                break;
            case 3:
                this.filingStatus = HEAD_OF_HOUSEHOLD;
                break;
            default:
                this.filingStatus = SINGLE_FILER;
                break;
        }
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return this.filingStatus;
    }

    public int[][] getBrackets() {
        return this.brackets;
    }

    public double[] getRates() {
        return this.rates;
    }

    public double getTaxableIncome() {
        return this.taxableIncome;
    }

    public void setFilingStatus(int filingStatus) {
        switch (filingStatus) {
            case 0:
                this.filingStatus = SINGLE_FILER;
                break;
            case 1:
                this.filingStatus = MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;
                break;
            case 2:
                this.filingStatus = MARRIED_SEPARATELY;
                break;
            case 3:
                this.filingStatus = HEAD_OF_HOUSEHOLD;
                break;
            default:
                this.filingStatus = SINGLE_FILER;
                break;
        }
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTotalTax() {
        int[] b = this.brackets[this.filingStatus];
        double tax = 0;
        double income = this.taxableIncome;

        int i = 0;
        for (; i < b.length; i++) {
            if (income > b[i]) {
                double lower = (i == 0 ? 0 : b[i - 1]);
                tax += (b[i] - lower) * this.rates[i];
            } else {
                break;
            }
        }

        double lower = (i == 0 ? 0 : b[i - 1]);
        tax += (income - lower) * this.rates[i];

        return tax;
    }
}
