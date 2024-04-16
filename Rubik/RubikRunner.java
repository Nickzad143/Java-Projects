import java.util.Scanner;

public class RubikRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RubikCube rc = new RubikCube();
        System.out.println(rc);

        while (true) {
            System.out.println("What direction? q to quit");
            System.out.print("What direction [right, left, up, down, cw, ccw]: ");
            String direction = scanner.nextLine();

            if (direction.equalsIgnoreCase("q")) {
                break;
            }

            switch (direction.toLowerCase()) {
                case "right":
                    rc.right();
                    break;
                case "left":
                    rc.left();
                    break;
                case "up":
                    rc.up();
                    break;
                case "down":
                    rc.down();
                    break;
                case "cw":
                    rc.cw();
                    break;
                case "ccw":
                    rc.ccw();
                    break;
                default:
                    System.out.println("Invalid direction. Try again.");
                    continue;
            }

            System.out.println(rc);
        }

        scanner.close();
    }
}
