import java.util.Scanner;

public class Ex2_02_ComputeVolumeOfCylinder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final double PI = Math.PI;

    System.out.println("Enter a radius for a cylinder:");
    double radius = scanner.nextDouble();

    System.out.println("Enter length for a cylinder:");
    double length = scanner.nextDouble();

    double area = radius * radius * PI;
    double volume = area * length;

    System.out.println("The area is " + (int) (area * 10000) / 10000.0);
    System.out.println("The volume is " + (int) (volume * 10 + 0.5) / 10.0);
  }
}
