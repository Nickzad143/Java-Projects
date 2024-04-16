public class TriangularArray {

  public static void main(String[] args) {
    int[][] A = new int[10][]; 

    for (int i = 0; i < A.length; i++) {
      A[i] = new int[i + 1]; 
      for (int j = 0; j < A[i].length; j++) {
        A[i][j] = i + j; 
      }
    }

    for (int[] row : A) {
      for (int i = 10 - row.length; i > 0; i--) {
        System.out.print(" ");
      }
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println(); 
    }
  }
}
