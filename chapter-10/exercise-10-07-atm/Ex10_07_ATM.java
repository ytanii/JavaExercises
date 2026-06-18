import java.util.Scanner;

public class Ex10_07_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double INITIAL_BALANCE = 100;
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, INITIAL_BALANCE);
        }
        while (true) {
            System.out.print("Enter a bank account id: ");
            int id = 0;
            while (true) {
                id = scanner.nextInt();
                if (id <= 9 && id >= 0) {
                    break;
                } else {
                    System.out.print("\nBank account does not exist, enter a correct id: ");
                }
            }

            int choice = 0;
            while (choice != 4) {
                System.out.print("Main Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
                System.out.print("\nEnter a choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        accounts[id].withdraw(scanner.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        accounts[id].deposit(scanner.nextDouble());
                        break;
                }

            }
        }
    }
}
