public class Bubblesortwithswapcount {
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        int swapCount = 0; // Counter for the number of swaps
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++; // Increment the swap counter
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;

            // Print the array after each pass
            System.out.print("Array after pass " + (i + 1) + ": ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Print the total number of swaps
        System.out.println("Total number of swaps: " + swapCount);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println("Initial array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
