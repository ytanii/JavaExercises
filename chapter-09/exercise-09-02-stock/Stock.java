public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getPreviousClosingPrice() {
        return this.previousClosingPrice;
    }

    public double getCurrentPrice() {
        return this.currentPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;

    }
}
