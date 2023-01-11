package by.itacademy.practice1.bookshop.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {

    public static <T> List<T> processArray(T[] array) {
        int count = 0;
        for(T a : array) {
            if (a != null){
                count++;
            }
        }

        List<T> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            list.add(array[i]);
        }
        return list;
    }
}
