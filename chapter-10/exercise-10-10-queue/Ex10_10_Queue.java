import java.util.Scanner;

public class Ex10_10_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        while (!queue.empty()) {
            int temp = queue.dequeue();
            if (queue.empty()) {
                System.out.print(temp);
            } else {
                System.out.print(temp + ", ");
            }
        }


    }
}
