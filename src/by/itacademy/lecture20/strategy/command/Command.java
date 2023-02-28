package by.itacademy.lecture20.strategy.command;

import by.itacademy.lecture20.strategy.sort.SortingStrategy;
import java.util.Scanner;

public abstract class Command {

    protected boolean exit = false;
    protected Scanner scanner = new Scanner(System.in);

    public abstract void execute();

    protected boolean retry() {
        System.out.println("Произошла ошибка! Вы уверены, что хотите завершить операцию?");

        String answer = scanner.next();

        if(answer.equals("да")) {
            return true;
        }
        return false;
    }
}
