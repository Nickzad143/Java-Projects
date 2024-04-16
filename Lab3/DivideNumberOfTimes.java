public class DivideNumberOfTimes {
    public static void main(String[] args) {
        double value = 1.0;
        int count = 0;

        while (value >= 0.0001) {
            value /= 2;
            count++;
        }

        System.out.println("Number of times you have to divide 1 by 2: " + count);
    }
}
