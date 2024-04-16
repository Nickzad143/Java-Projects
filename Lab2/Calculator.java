import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a dollar amount: $");
        double dollarAmount = scanner.nextDouble();

        int totalCents = (int) (dollarAmount * 100);
        int quarters = totalCents / 25;
        totalCents %= 25; 
        int dimes = totalCents / 10;
        totalCents %= 10;
        int nickels = totalCents / 5;
        int pennies = totalCents % 5;

        System.out.println("quarters" +quarters);
        System.out.println("dimes"    +dimes);
        System.out.println("nickels"  +nickels);
        System.out.println("pennies"  +pennies);
    }
}
