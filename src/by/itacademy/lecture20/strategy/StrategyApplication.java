package by.itacademy.lecture20.strategy;

import by.itacademy.lecture20.strategy.command.BubbleSortCommand;
import by.itacademy.lecture20.strategy.command.ExitCommand;
import by.itacademy.lecture20.strategy.command.InsertionSortCommand;
import by.itacademy.lecture20.strategy.command.SelectionSortCommand;
import java.util.Scanner;

public class StrategyApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки: 1 - пузырьком, 2 - вставками, 3 - выбором, 0 - выход");

        int choice = scanner.nextInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    new BubbleSortCommand().execute();
                    break;
                case 2:
                    new InsertionSortCommand().execute();
                    break;
                case 3:
                    new SelectionSortCommand().execute();
                    break;
                case 0:
                    new ExitCommand().execute();
                    break;
            }
            choice = scanner.nextInt();
        }
    }
}
