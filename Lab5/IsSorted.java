public class IsSorted {

  public static void main(String[] args) {
    int[] numbers = {1, 3, 4, 2}; 

    boolean sorted = true;

    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] > numbers[i + 1]) {
        sorted = false;
        break; 
      }
    }

    System.out.println(sorted ? "Sorted" : "Not Sorted");
  }
}
