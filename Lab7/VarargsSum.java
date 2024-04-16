public class VarargsSum {

    public static int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, and 3: " + sum(1, 2, 3));
        System.out.println("Sum of 10, 20, 30, and 40: " + sum(10, 20, 30, 40));
        System.out.println("Sum of 5, 10, 15, 20, and 25: " + sum(5, 10, 15, 20, 25));
        System.out.println("Sum of no numbers: " + sum());
    }
}