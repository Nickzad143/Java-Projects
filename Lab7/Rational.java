public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public Rational(int numerator) {
        this(numerator, 1);
    }

    public Rational() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
            reduce();
        } else {
            System.out.println(" Denominator cannot be zero. ");
        }
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    public static void main(String[] args) {

        Rational rational1 = new Rational(2, 5);
        Rational rational2 = new Rational(3);
        Rational rational3 = new Rational();

        System.out.print(" Rational 1: --->  ");
        rational1.display();
        System.out.print(" Rational 2: --->  ");
        rational2.display();
        System.out.print(" Rational 3: --->  ");
        rational3.display();
    }
}
