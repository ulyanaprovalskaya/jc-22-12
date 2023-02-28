package by.itacademy.lecture20.strategy.sort;

import java.util.Collection;

public class BubbleSort<T> implements SortingStrategy<T> {

    @Override
    public void sort(Collection<T> collection) {
        System.out.printf("Сортировка пузырьком: %s\n", collection);
    }
}
