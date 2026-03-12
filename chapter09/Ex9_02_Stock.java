import java.util.Scanner;

public class Ex9_02_Stock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.5);
        stock1.setCurrentPrice(34.35);

        System.out.println("For the "+ stock1.getSymbol() + " stock by the " + stock1.getName() + ", the previous closing price was " +  stock1.getPreviousClosingPrice() + " and the current closing price is " + stock1.getCurrentPrice());
        System.out.println();
        System.out.println("So the percent change in the stock price is " + stock1.getChangePercent() + "%");


    }
}
