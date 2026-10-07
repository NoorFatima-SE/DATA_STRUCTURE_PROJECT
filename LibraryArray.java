import java.util.Scanner;
public class LibraryArray {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] books = new int[10];
        int size = 0;
        int choice;

        do {
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (size == books.length) {
                        System.out.println("Array is full.");
                    } else {
                        System.out.print("Enter book ID: ");
                        books[size] = sc.nextInt();
                        size++;
                        System.out.println("Book added.");
                    }
                    break;

                case 2:
                    if (size == books.length) {
                        System.out.println("Array is full.");
                    } else {
                        System.out.print("Enter index: ");
                        int index = sc.nextInt();

                        if (index < 0 || index > size) {
                            System.out.println("Invalid index.");
                        } else {
                            System.out.print("Enter book ID: ");
                            int value = sc.nextInt();

                            for (int i = size; i > index; i--) {
                                books[i] = books[i - 1];
                            }

                            books[index] = value;
                            size++;

                            System.out.println("Book inserted.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter book IDs.");
                    System.out.println("Enter -1 to stop.");

                    while (size < books.length) {
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();

                        if (value == -1) {
                            break;
                        }

                        books[size] = value;
                        size++;
                    }

                    System.out.println("Array filled.");
                    break;

                case 4:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        size--;
                        System.out.println("Last book deleted.");
                    }
                    break;

                case 5:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Enter index: ");
                        int index = sc.nextInt();

                        if (index < 0 || index >= size) {
                            System.out.println("Invalid index.");
                        } else {

                            for (int i = index; i < size - 1; i++) {
                                books[i] = books[i + 1];
                            }

                            size--;

                            System.out.println("Book deleted.");
                        }
                    }
                    break;

                case 6:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.println("Book IDs:");

                        for (int i = 0; i < size; i++) {
                            System.out.println("Index " + i + " = " + books[i]);
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter book ID to search: ");
                    int value = sc.nextInt();

                    int found = -1;

                    for (int i = 0; i < size; i++) {
                        if (books[i] == value) {
                            found = i;
                            break;
                        }
                    }

                    if (found == -1) {
                        System.out.println("Book not found.");
                    } else {
                        System.out.println("Book found at index " + found);
                    }
                    break;

                case 8:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    if (index < 0 || index >= size) {
                        System.out.println("Invalid index.");
                    } else {
                        System.out.println("Value = " + books[index]);
                    }
                    break;

                case 9:
                    System.out.print("Enter index: ");
                    int update = sc.nextInt();

                    if (update < 0 || update >= size) {
                        System.out.println("Invalid index.");
                    } else {
                        System.out.print("Enter new book ID: ");
                        books[update] = sc.nextInt();

                        System.out.println("Book updated.");
                    }
                    break;

                case 10:
                    System.out.println("Current size = " + size);
                    break;

                case 11:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Wrong choice.");
            }

        } while (choice != 11);

        sc.close();
    }
}

