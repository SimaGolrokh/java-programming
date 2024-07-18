public class QuickSort {
    // Method to partition the array into two halves
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the pivot element
        int i = (low - 1); // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }

    // Main method to implement QuickSort
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // partitionIndex is the index where the array is partitioned
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Method to print the array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the QuickSort algorithm
    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        System.out.println("Unsorted array:");
        sorter.printArray(array);

        sorter.quickSort(array, 0, n - 1);

        System.out.println("Sorted array:");
        sorter.printArray(array);
    }
}
