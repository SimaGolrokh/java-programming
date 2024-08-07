public class BinarySearch {
    // Iterative binary search method
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Find the middle element

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If the key is greater, ignore the left half
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // If the key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If the key is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 3, 4, 10, 40};
        int key = 10;
        int result = binarySearch(sortedArray, key);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

