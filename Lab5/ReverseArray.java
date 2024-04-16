public class ReverseArray {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5}; 

    int temp;
    for (int i = 0; i < numbers.length / 2; i++) {
      temp = numbers[i];
      numbers[i] = numbers[numbers.length - 1 - i];
      numbers[numbers.length - 1 - i] = temp;
    }
    System.out.print("Original array: ");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println();

    System.out.print("Reversed array: ");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }
}
