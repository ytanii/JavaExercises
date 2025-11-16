import java.util.Scanner;

public class Ex10_03_MyInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyInteger n1 = new MyInteger(17);
        MyInteger n2 = new MyInteger(24);
        MyInteger n3 = new MyInteger(17);

        System.out.println(n1.getValue());
        System.out.println(n2.getValue()); // 24

        System.out.println("n1 isEven:  " + n1.isEven());
        System.out.println("n1 isOdd:   " + n1.isOdd());
        System.out.println("n1 isPrime: " + n1.isPrime());

        System.out.println("n2 isEven:  " + n2.isEven());
        System.out.println("n2 isOdd:   " + n2.isOdd());
        System.out.println("n2 isPrime: " + n2.isPrime());


        System.out.println("n1.equals(17): " + n1.equals(17));
        System.out.println("n1.equals(n3): " + n1.equals(n3));
        System.out.println("n1.equals(n2): " + n1.equals(n2));


        System.out.println("isEven(12): " + MyInteger.isEven(12));
        System.out.println("isOdd(9):   " + MyInteger.isOdd(9));
        System.out.println("isPrime(13): " + MyInteger.isPrime(13));

        System.out.println("isEven(n1): " + MyInteger.isEven(n1));
        System.out.println("isOdd(n1):  " + MyInteger.isOdd(n1));
        System.out.println("isPrime(n1): " + MyInteger.isPrime(n1));

        
        char[] arr = {'3', '7', '2', '1'};
        System.out.println(MyInteger.parseInt(arr));

        System.out.println("\nTesting parseInt(String):");
        System.out.println(MyInteger.parseInt("4926"));


    }
}
