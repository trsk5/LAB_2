import java.util.Scanner;

public class PointQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координати точки (x, y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в першому квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в другому квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в третьому квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в четвертому квадранті.");
        } else {
            System.out.println("Точка знаходиться на одній з вісей або в початку координат.");
        }

        scanner.close();
    }
}
