package by.itacademy.lecture7.car;

import java.util.Random;
import java.util.Scanner;

public class Train implements Drivable {

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turnRight() {

    }

    public static void main(String[] args) {
        System.out.println("Введите размер маассива (n > 0):");
        int size = enterPositiveNumber();

        int[] array = fillArrayAndPrint(size);

        int min = array[1];
        int minI = 0;
        for (int i = 1; i < size; i += 2) {
            if (min > array[i]) {
                min = array[i];
                minI = i;
            }
        }

        System.out.println("Максимум: " + min);
        System.out.println("Его индекс: " + minI);

    }

    private static int enterPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int size;
        while ((size = scanner.nextInt()) <= 0) {
            System.out.println("Ошибка! Число должно быть > 0");
            System.out.println("Введите корректное значение: ");
        }

        return size;
    }

    private static int[] fillArrayAndPrint(int arraySize) {
        Random random = new Random();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        return array;
    }
}
