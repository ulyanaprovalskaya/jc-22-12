package by.itacademy.lecture20.strategy.command;

import by.itacademy.lecture20.strategy.sort.BubbleSort;
import by.itacademy.lecture20.strategy.sort.SortingStrategy;

public class BubbleSortCommand extends Command {

    @Override
    public void execute() {
        SortingCommand sortingCommand = new SortingCommand();
        sortingCommand.execute();

        SortingStrategy strategy = new BubbleSort();
        strategy.sort(sortingCommand.getList());
    }
}
