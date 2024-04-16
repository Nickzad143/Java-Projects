public class CheckSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9}; // Change this array to test different cases

        boolean sorted = true;

        // Check if the array is sorted
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        // Print the result
        if (sorted) {
            System.out.println( "Sorted");
        } else {
            System.out.println(" Not Sorted");
        }
    }
}
 