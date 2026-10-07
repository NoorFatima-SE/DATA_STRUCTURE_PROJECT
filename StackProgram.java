import java.util.Scanner;
public class StackProgram {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] stack = new int[5];
        int top = -1;
        int choice;

        do {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    if (top == 4) {
                        System.out.println("Stack is Full");
                    } else {
                        System.out.print("Enter value: ");
                        int value = input.nextInt();

                        top++;
                        stack[top] = value;

                        System.out.println("Value pushed");
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Popped value: " + stack[top]);
                        top--;
                    }
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Stack values:");

                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Size: " + (top + 1));
                    break;

                case 5:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Stack is not Empty");
                    }
                    break;

                case 6:
                    if (top == 4) {
                        System.out.println("Stack is Full");
                    } else {
                        System.out.println("Stack is not Full");
                    }
                    break;

                case 7:
                    System.out.println("Exit");
                    break;
            }

        } while (choice != 7);

        input.close();
    }
}

