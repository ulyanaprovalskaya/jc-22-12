package by.itacademy.lecture20.strategy.command;

import by.itacademy.lecture20.strategy.sort.BubbleSort;
import by.itacademy.lecture20.strategy.sort.InsertionSort;
import by.itacademy.lecture20.strategy.sort.SortingStrategy;
import java.util.ArrayList;
import java.util.List;

public class InsertionSortCommand extends Command {

    @Override
    public void execute() {
        SortingCommand sortingCommand = new SortingCommand();
        sortingCommand.execute();

        SortingStrategy strategy = new InsertionSort();
        strategy.sort(sortingCommand.getList());
    }
}
