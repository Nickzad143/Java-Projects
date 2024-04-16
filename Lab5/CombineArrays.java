import java.util.Arrays; 

public class CombineArrays {

  public static void main(String[] args) {
    int[] data1 = {1, 2, 3};
    int[] data2 = {4, 5, 6, 7};

    int totalLength = data1.length + data2.length;

    int[] data3 = new int[totalLength];

    for (int i = 0; i < data1.length; i++) {
      data3[i] = data1[i];
    }

    int start = data1.length;
    for (int i = 0; i < data2.length; i++) {
      data3[start + i] = data2[i];
    }
    System.out.println("data1: " + Arrays.toString(data1));
    System.out.println("data2: " + Arrays.toString(data2));
    System.out.println("data3: " + Arrays.toString(data3));
  }
}
