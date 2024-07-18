public class BinarySearchRecursive {
    // Recursive binary search method
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2; // Find the middle element

            // Check if the key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If the key is smaller than mid, search the left subarray
            if (arr[mid] > key) {
                return binarySearch(arr, left, mid - 1, key);
            }

            // Else search the right subarray
            return binarySearch(arr, mid + 1, right, key);
        }

        // If the key is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 3, 4, 10, 40};
        int key = 10;
        int result = binarySearch(sortedArray, 0, sortedArray.length - 1, key);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
