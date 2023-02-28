package by.itacademy.lecture20.strategy.command;

import by.itacademy.lecture20.strategy.sort.BubbleSort;
import by.itacademy.lecture20.strategy.sort.SelectionSort;
import by.itacademy.lecture20.strategy.sort.SortingStrategy;
import java.util.ArrayList;
import java.util.List;

public class SelectionSortCommand extends Command {

    @Override
    public void execute() {
        SortingCommand sortingCommand = new SortingCommand();
        sortingCommand.execute();

        SortingStrategy strategy = new SelectionSort();
        strategy.sort(sortingCommand.getList());
    }
}
