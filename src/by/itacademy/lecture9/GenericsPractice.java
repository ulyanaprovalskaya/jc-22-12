package by.itacademy.lecture9;

import java.util.Arrays;
import java.util.List;

public class GenericsPractice {

    public static void main(String[] args) {
        List<Number> intList = Arrays.asList(3, 2, 2, 4);
        Number max = findMax(intList);
        System.out.println(max);

        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5};
        swapElements(intArr, 0, 4);
        System.out.println(Arrays.toString(intArr));

        String[] strArr = new String[]{"c", "a", "a", "a", "b"};
        swapElements(strArr, 0, 4);
        System.out.println(Arrays.toString(strArr));

        List<? extends Number> listToSort = Arrays.asList(3.7, 2.0, 2.5, 4);
        sort(listToSort);
        System.out.println(listToSort);;
    }

    //Найти max элемент в списке
    public static <T extends Number> T findMax(List<T> list) {
        T max = list.get(0);
        double maxInt = list.get(0).doubleValue();
        for (T element : list) {
            double elementInt = element.doubleValue();
            if (elementInt > maxInt) {
                max = element;
            }
        }
        return max;
    }

    //Поменять местами элементы массива i и j
    public static <T> void swapElements(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void sort(List<? extends Number> list) {
        sortT(list);
    }

    //wildcard capture
    public static <T extends Number> void sortT(List<T> list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < i; j++) {
                if (list.get(i).doubleValue() < list.get(j).doubleValue()) {
                    T tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
    }

    public static <T extends Number> double sum(T el1, T el2) {
        return el1.doubleValue() + el2.doubleValue();
    }
}
