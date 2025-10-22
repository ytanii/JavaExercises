public class Ex6_08_ConvertTemperature {
  public static void main(String[] args) {
    System.out.printf(
        "%6s      %5s   |   %5s      %5s\n", "Celcius", "Fahrenheit", "Fahrenheit", "Celcius");
    System.out.println("--------------------------------------------------------");

    for (double celcius = 40, fahrenheit = 120; celcius > 30; celcius--, fahrenheit -= 10) {
      System.out.printf(
          "%7.1f%15.1f    |%10.1f%15.2f\n",
          celcius, celsiusToFahrenheit(celcius), fahrenheit, fahrenheitToCelsius(fahrenheit));
    }
  }

  public static double celsiusToFahrenheit(double celcius) {
    return (9.0 / 5) * celcius + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return (5.0 / 9) * (fahrenheit - 32);
  }
}
