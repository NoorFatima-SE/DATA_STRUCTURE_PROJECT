import java.util.Scanner;
public class QueueProgram {
	static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;
    static int count = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    if (count == queue.length) {
                        System.out.println("Queue is Full.");
                    } else {
                        System.out.print("Enter token number: ");
                        int value = input.nextInt();

                        rear++;
                        queue[rear] = value;
                        count++;

                        System.out.println("Token added to queue.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Queue is Empty.");
                    } else {
                        System.out.println("Removed token: " + queue[front]);

                        front++;
                        count++;

                        count--;

                        if (count == 0) {
                            front = 0;
                            rear = -1;
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Queue is Empty.");
                    } else {
                        System.out.print("Queue: ");

                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
                        }

                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Queue Size: " + count);
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("Queue is Empty.");
                    } else {
                        System.out.println("Queue is not Empty.");
                    }
                    break;

                case 6:
                    if (count == queue.length) {
                        System.out.println("Queue is Full.");
                    } else {
                        System.out.println("Queue is not Full.");
                    }
                    break;

                case 7:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        input.close();
    }
}

