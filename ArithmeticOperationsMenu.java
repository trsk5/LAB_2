import java.util.Scanner;

public class ArithmeticOperationsMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("1. Обчислити добуток двох чисел");
        System.out.println("2. Обчислити суму двох чисел");
        System.out.println("3. Обчислити різницю двох чисел");
        System.out.println("Виберіть опцію:");

        int choice = scanner.nextInt();

        double num1, num2, result;

        switch (choice) {
            case 1:
                System.out.println("Введіть перше число:");
                num1 = scanner.nextDouble();
                System.out.println("Введіть друге число:");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("Добуток: " + result);
                break;
            case 2:
                System.out.println("Введіть перше число:");
                num1 = scanner.nextDouble();
                System.out.println("Введіть друге число:");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("Сума: " + result);
                break;
            case 3:
                System.out.println("Введіть перше число:");
                num1 = scanner.nextDouble();
                System.out.println("Введіть друге число:");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("Різниця: " + result);
                break;
            default:
                System.out.println("Невірний вибір.");
        }

        scanner.close();
    }
}
