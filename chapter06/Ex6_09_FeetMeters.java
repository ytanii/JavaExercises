public class Ex6_09_FeetMeters {
  public static void main(String[] args) {

    System.out.printf("%6s      %5s   |   %5s   %5s\n", "Feet", "Meters", "Meters", "Feet");
    System.out.println("-------------------------------------------");
    for (double feet = 1, meter = 20; feet <= 10; feet++, meter += 5) {
      System.out.printf(
          "%7.1f%10.1f    |%8.1f%10.2f\n", feet, footToMeter(feet), meter, meterToFoot(meter));
    }
  }

  public static double footToMeter(double foot) {
    return foot * 0.305;
  }

  public static double meterToFoot(double meter) {
    return meter * 3.279;
  }
}
