
public class FindFact {
    public static void main(String[] args) {
        int num = 1;

        while (true) {
            if (countFactors(num) == 9) {
                System.out.println("Number with exactly nine factors: " + num);
                break;
            }
            num++;
        }
    }
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)
                    count++;
                else
                    count += 2;
            }
        }
        return count;
    }
}
