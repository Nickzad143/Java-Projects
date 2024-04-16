import java.util.Scanner;

public class DataEntryStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items to enter or a sentinel value to stop: ");
        int capacity = scanner.nextInt();
        int[] data = new int[capacity];
        int count = 0;

        while (count < capacity) {
            System.out.print("Enter data item (or sentinel value to stop): ");
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            data[count] = value;
            count++;
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            sum += data[i];
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }

        double average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
