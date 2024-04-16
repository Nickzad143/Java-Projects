import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!\nPress Enter to continue");
        input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

    }
}
