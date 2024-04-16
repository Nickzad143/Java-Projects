import java.util.Scanner;


public class CountAs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countA = 0;

        System.out.println("Enter Aphabets from keyboard. Enter 'Q' to quit.");

        while (true) {
            char input = scanner.next().charAt(0);
            if (input == 'Q') {
                break; 
            } else if (input == 'A') {
                countA++; 
            }
        }

        System.out.println("Total number of 'A's you Entered: " + countA);
    }
}
