package by.itacademy.lecture20.strategy.sort;

import java.util.Collection;

public interface SortingStrategy<T> {

    void sort(Collection<T> collection);
}
