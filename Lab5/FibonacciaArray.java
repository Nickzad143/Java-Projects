public class FibonacciaArray {
    public static void main(String[] args) {
        // A. Sequence: 
        int[] sequenceA = new int[30];
        for (int i = 0; i < sequenceA.length; i++) {
            sequenceA[i] = (i % 2 == 0) ? i + 1 : -(i + 1);
        }
        System.out.println("Sequence of A:");
        for (int num : sequenceA) {
            System.out.print(num + " ");
        }
        System.out.println();

        // B. Sequence: 
        int[] sequenceB = new int[30];
        for (int i = 0; i < sequenceB.length; i++) {
            sequenceB[i] = (i / 2) + 1;
        }
        System.out.println("Sequence of B:");
        for (int num : sequenceB) {
            System.out.print(num + " ");
        }
        System.out.println();

        // C. Sequence:
        int[] sequenceC = new int[30];
        for (int i = 0; i < sequenceC.length; i++) {
            sequenceC[i] = (int) Math.pow(2, i);
        }
        System.out.println("Sequence of C:");
        for (int num : sequenceC) {
            System.out.print(num + " ");
        }
        System.out.println();

        // D. Sequence: 
        int[] sequenceD = new int[30];
        sequenceD[0] = 1;
        sequenceD[1] = 1;
        for (int i = 2; i < sequenceD.length; i++) {
            sequenceD[i] = sequenceD[i - 1] + sequenceD[i - 2];
        }
        System.out.println("Sequence of D:");
        for (int num : sequenceD) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
