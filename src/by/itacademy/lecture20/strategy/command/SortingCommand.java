package by.itacademy.lecture20.strategy.command;

import java.util.ArrayList;
import java.util.List;

public class SortingCommand extends Command {

    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    @Override
    public void execute() {
        System.out.println("Введите числа для сортировки: ");
        String input = "1";
        list = new ArrayList<>();

        while (!(input = scanner.next()).equals("")) {
            try {
                list.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                if(retry()) {
                    break;
                }
            }
        }
    }
}
