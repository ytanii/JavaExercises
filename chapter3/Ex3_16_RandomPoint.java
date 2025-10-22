import java.util.Scanner;

public class Ex3_16_RandomPoint {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double x = (Math.random() * 100) - 50;
    double y = (Math.random() * 200) - 100;

    System.out.println("Point: " + "(" + x + ", " + y + ") ");
  }
}
