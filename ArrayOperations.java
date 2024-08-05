import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayHandler arrayHandler = new ArrayHandler(12); // Array with 12 elements

        while (true) {
            System.out.println("\nArray: " + Arrays.toString(arrayHandler.getArray()));
            System.out.println("Choose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter position to insert (0-11): ");
                    int insertPos = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    arrayHandler.insert(insertPos, insertValue);
                    break;
                case 2:
                    System.out.print("Enter position to delete (0-11): ");
                    int deletePos = scanner.nextInt();
                    arrayHandler.delete(deletePos);
                    break;
                case 3:
                    System.out.print("Enter position to update (0-11): ");
                    int updatePos = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int updateValue = scanner.nextInt();
                    arrayHandler.update(updatePos, updateValue);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class ArrayHandler {
    private int[] numbers;

    // Constructor to initialize the array with default values
    public ArrayHandler(int size) {
        this.numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 0; // Initialize all elements to 0
        }
    }

    // Method to get the array
    public int[] getArray() {
        return numbers;
    }

    // Method to insert a value at a specific position
    public void insert(int position, int value) {
        if (position < 0 || position >= numbers.length) {
            System.out.println("Invalid position. Please try again.");
            return;
        }
        numbers[position] = value;
        System.out.println("Value inserted.");
    }

    // Method to delete a value at a specific position
    public void delete(int position) {
        if (position < 0 || position >= numbers.length) {
            System.out.println("Invalid position. Please try again.");
            return;
        }
        numbers[position] = 0; // Reset the value to 0
        System.out.println("Value deleted.");
    }

    // Method to update a value at a specific position
    public void update(int position, int value) {
        if (position < 0 || position >= numbers.length) {
            System.out.println("Invalid position. Please try again.");
            return;
        }
        numbers[position] = value;
        System.out.println("Value updated.");
    }
}
