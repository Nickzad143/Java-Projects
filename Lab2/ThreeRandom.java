public class ThreeRandom {
    public static void main(String[] args) {

        double a = Math.random();
        double b = Math.random();
        double c = Math.random();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a < 0.5 && b < 0.5 && c < 0.5) {
            System.out.println("All are tiny");
        } else if ((a < 0.5 && b >= 0.5 && c >= 0.5) || (a >= 0.5 && b < 0.5 && c >= 0.5) || (a >= 0.5 && b >= 0.5 && c < 0.5)) 
        {
            System.out.println("only one is tiny");
        } else if (a >= 0.5 && b >= 0.5 && c >= 0.5) {
            System.out.println("None is tiny");
        } else {
            System.out.println("None of conditions met");
        }
    }
}
