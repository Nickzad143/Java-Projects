public class MathRandom {
    public static void main(String[] args) {
        int countGreaterThanHalf = 0;

        for (int i = 0; i < 1000; i++) {
            double randomValue = Math.random();
           
            if (randomValue > 0.5) {
                countGreaterThanHalf++;
            }
        }
        System.out.println(countGreaterThanHalf);
    }
}
