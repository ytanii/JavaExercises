public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;

    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPrime() {
        if (this.value <= 1) {
            return false;
        }

        for (int divisor = 2; divisor < Math.sqrt(this.value); divisor++) {
            if (this.value % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;

    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }

        for (int divisor = 2; divisor < Math.sqrt(value); divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(MyInteger value) {
        return value.getValue() % 2 == 0;

    }

    public static boolean isOdd(MyInteger value) {
        return value.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger value) {
        if (value.getValue() <= 1) {
            return false;
        }

        for (int divisor = 2; divisor < Math.sqrt(value.getValue()); divisor++) {
            if (value.getValue() % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger value) {
        return this.value == value.getValue();
    }

    public static int parseInt(char[] charArray) {
        int result = 0;

        for (int i = 0; i < charArray.length; i++) {
            int digit = charArray[i] - '0';
            result *= 10;
            result += digit;
        }

        return result;
    }

    public static int parseInt(String s){
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            result *= 10;
            result += digit;
        }

        return result;
    }

}
