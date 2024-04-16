public class ReverseArray {

  public static void reverse(int[] data) {
    if (data == null || data.length <= 1) {
    }

    int left = 0;
    int right = data.length - 1;
    
    while (left < right) {
      int temp = data[left];
      data[left] = data[right];
      data[right] = temp;
      left++;
      right--;
    }
  }

  public static void main(String[] args) {
    int[] data = {1, 2, 3, 4, 5};
    System.out.println("Before reverse: " + java.util.Arrays.toString(data));
    reverse(data);
    System.out.println("After reverse: " + java.util.Arrays.toString(data));
  }
}
