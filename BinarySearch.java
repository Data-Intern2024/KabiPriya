public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if x is present at mid
            if (arr[mid] == x) {
                return mid;
            }

            // If x greater, ignore left half
            if (arr[mid] < x) {
                low = mid + 1;
            }
            // If x is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }

        // Element is not present in array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        int result = binarySearch(arr, x);

        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element is not present in array");
        }
    }
}
