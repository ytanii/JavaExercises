import java.util.Scanner;

public class TowerOfHanoi {
    public static  int calls = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of discs: ");
        int n = scanner.nextInt();
        moveDisks(n,'A','B','C');
        System.out.println("Number of calls: " + calls);
    }

    public static void moveDisks(int n, char fromTower, char toTower,char auxTower){
        calls++;
        if(n == 1){
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);

        }else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }



}
