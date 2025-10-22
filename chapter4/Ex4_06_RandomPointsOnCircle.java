import java.util.Scanner;

public class Ex4_06_RandomPointsOnCircle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double radius = 40;
    double randomRadianAngle1 = Math.random() * (2 * Math.PI);
    double randomRadianAngle2 = Math.random() * (2 * Math.PI);
    double randomRadianAngle3 = Math.random() * (2 * Math.PI);

    double x1 = radius * Math.cos(randomRadianAngle1);
    double y1 = radius * Math.sin(randomRadianAngle1);

    double x2 = radius * Math.cos(randomRadianAngle2);
    double y2 = radius * Math.sin(randomRadianAngle2);

    double x3 = radius * Math.cos(randomRadianAngle3);
    double y3 = radius * Math.sin(randomRadianAngle3);

    double sideA = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
    double sideB = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    double sideC = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    double angleA =
        Math.toDegrees(
            Math.acos(
                (Math.pow(sideA, 2) - Math.pow(sideB, 2) - Math.pow(sideC, 2))
                    / (-2 * sideB * sideC)));
    double angleB =
        Math.toDegrees(
            Math.acos(
                (Math.pow(sideB, 2) - Math.pow(sideA, 2) - Math.pow(sideC, 2))
                    / (-2 * sideA * sideC)));
    double angleC =
        Math.toDegrees(
            Math.acos(
                (Math.pow(sideC, 2) - Math.pow(sideA, 2) - Math.pow(sideB, 2))
                    / (-2 * sideA * sideB)));

    System.out.printf("The three angles are: %.2f %.2f %.2f", angleA, angleB, angleC);
  }
}
