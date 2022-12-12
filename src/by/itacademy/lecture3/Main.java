package by.itacademy.lecture3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты точки:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        String message = "Точка (" + x + "; " + y + ") находится";

        if (x > 0 && y > 0) {
            System.out.println(message + " в первой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println(message + " во второй четверти");
        } else if (x < 0 && y < 0) {
            System.out.println(message + " в третьей четверти");
        } else if (x > 0 && y < 0) {
            System.out.println(message + " в четвертой четверти");
        } else {
            System.out.println(message + " на координатной прямой");
        }

        System.out.println(sum(1, 2));
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
