import java.util.Arrays;

public class ReversArray {
    public static void reverse(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        reverseHelper(array, 0, array.length - 1);
    }

    private static void reverseHelper(int[] array, int start, int end) {
        if (start >= end) {
            return; 
        }
    
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
      
        reverseHelper(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
