import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число:");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99 && number % 2 == 0) {
            System.out.println("Число " + number + " є двозначним і парним.");
        } else {
            System.out.println("Число " + number + " не є двозначним і парним.");
        }

        scanner.close();
    }
}
