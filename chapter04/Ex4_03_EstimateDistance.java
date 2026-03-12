import java.util.Scanner;

public class Ex4_03_EstimateDistance {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final double RADIUS = 6371.01;

    double x1 = Math.toRadians(33.7489954);
    double y1 = Math.toRadians(-84.3879824); // Atlanta

    double x2 = Math.toRadians(35.2270869); // Charlotte
    double y2 = Math.toRadians(-80.8431267);

    double x3 = Math.toRadians(32.0835407); // Savannah
    double y3 = Math.toRadians(-81.0998342);

    double x4 = Math.toRadians(28.5383355); // Orlando
    double y4 = Math.toRadians(-81.3792365);

    double distanceFromAtlToChar =
        RADIUS
            * Math.acos(
                Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

    double distanceFromAtlToOrla =
        RADIUS
            * Math.acos(
                Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));

    double distanceFromCharToOrla =
        RADIUS
            * Math.acos(
                Math.sin(x2) * Math.sin(x4)
                    + Math.cos(x2) * Math.cos(x4) * Math.cos(y2 - y4)); // use for both

    double distanceFromCharToSav =
        RADIUS
            * Math.acos(
                Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));

    double distanceFromSavToOrla =
        RADIUS
            * Math.acos(
                Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));

    double s1 = (distanceFromAtlToChar + distanceFromAtlToOrla + distanceFromCharToOrla) / 2;

    double s2 = (distanceFromCharToSav + distanceFromSavToOrla + distanceFromCharToOrla) / 2;

    double area1 =
        Math.sqrt(
            s1
                * (s1 - distanceFromAtlToChar)
                * (s1 - distanceFromAtlToOrla)
                * (s1 - distanceFromCharToOrla));
    double area2 =
        Math.sqrt(
            s2
                * (s2 - distanceFromCharToSav)
                * (s2 - distanceFromSavToOrla)
                * (s2 - distanceFromCharToOrla));

    System.out.println("The area enclosed by the four cities is approximately " + (area1 + area2));
  }
}
