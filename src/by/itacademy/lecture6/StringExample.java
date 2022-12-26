package by.itacademy.lecture6;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        int multiplication = a * b;

        System.out.printf("Сколько будет %d умножить на %d?", a, b);
        int userAnswer = scanner.nextInt();

        if(userAnswer == multiplication) {
            System.out.println("Поздравляю! Вы знаете таблицу умножения");
        } else {
            System.out.printf("Неверный ответ!!! %d * %d = %d", a, b, multiplication);
        }

        int m = 4;
        int n = 4;
        int[][] firstMatrix = new int[m][n];
        int[][] secondMatrix = new int[m][n];

        int[][] result = new int[m][n];

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = firstMatrix[i][j] * a;
            }
        }

    }

}
