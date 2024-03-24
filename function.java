import java.util.Scanner;

public class function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення x: ");
        double x = scanner.nextDouble();

        double result = f(x);

        System.out.println("f(" + x + ") = " + result);
    }

    private static double f(double x) {
        if (x <= -2.5) {
            return Math.exp(-x);
        } else if (x <= 0) {
            return Math.pow((2 + x) / (3 - Math.pow(x, 2)), 1.0 / 3.0) / Math.pow((3 - Math.pow(x, 2)), 1.0 / 2.0);
        } else {
            return Math.exp(Math.sin(x) - Math.cos(Math.pow(x, 2))) * x;
        }
    }
}
