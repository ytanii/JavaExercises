import java.util.Scanner;
public class Listing07_06_LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for(int i = 0;  i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 10);
        }
        for(int number: numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.print("Find: ");
        int key = scanner.nextInt();


        if(linearSearch(numbers,key) >= 0){
            System.out.println(key + " was found at " + linearSearch(numbers,key));
        }else{
            System.out.println("Does not exist");
        }
    }

    public static int linearSearch(int[] numbers, int key){
        for(int i = 0; i< numbers.length; i++){
           if(numbers[i] == key){
               return i;
           }
        }
        return -1;
    }
}
