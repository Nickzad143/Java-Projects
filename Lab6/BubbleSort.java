public class BubbleSort {

  public static void sort(String[] data) {
    for (int i = 0; i < data.length - 1; i++) {
      boolean swapped = false;
      for (int j = 0; j < data.length - i - 1; j++) {
        if (data[j].length() > data[j + 1].length()) {
          String temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    String[] data = {"apple", "banana", "grape", "cherry", "mango"};
    System.out.println("Original data: " + String.join(", ", data));

    sort(data);

    System.out.println("Sorted data by length: " + String.join(", ", data));
  }
}
