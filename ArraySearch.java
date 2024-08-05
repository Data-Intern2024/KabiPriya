import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        // Define an array with 12 elements
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number to search for
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        // Call the search method and store the result
        boolean found = searchNumber(numbers, target);

        // Display the result
        if (found) {
            System.out.println("The number " + target + " is found in the array.");
        } else {
            System.out.println("The number " + target + " is not found in the array.");
        }
    }

    // Method to search for a number in the array
    public static boolean searchNumber(int[] array, int target) {
        for (int number : array) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }
}
