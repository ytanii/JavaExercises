public class Ex6_10_PrimeNumbers {
  public static void main(String[] args) {
    for (int number = 2, i = 0; number <= 10000; number++) {
      if (isPrime(number)) {
        i++;
        System.out.printf("%5d ", number);
        if (i % 10 == 0) {
          System.out.println();
        }
      }
    }
  }

  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
      if (number % divisor == 0) {
        return false;
      }
    }
    return true;
  }
}
