package by.itacademy.lecture9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        Integer[][] integers = new Integer[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix<Integer> integerMatrix = new Matrix<>(integers);

        integerMatrix.printMatrix();
        System.out.println();
        integerMatrix.swapRows(0, 2);
        integerMatrix.printMatrix();

        Matrix<Integer> matrixInt = new Matrix<>(new Integer[3][3]);
        Matrix matrix = new Matrix(new Double[3][3]);

        Matrix<Double> matrixDouble = new Matrix<>(new Double[3][3]);
        //Matrix<String> matrixStr; - ошибка!

        List<Number> nums = Arrays.<Number>asList(4.1F, 0.2F);
        List<Integer> ints = Arrays.asList(1, 2);

        copy(nums, ints);
        System.out.println(nums);

        reverse(ints);
        System.out.println(ints);
    }

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dest.set(i, src.get(i)); // dest[i] = src[i]
        }
    }

    public static void reverse(List<?> list) {
        rev(list);
    }

    // wildcard capture
    public static <T> void rev(List<T> list) { // 1 2 3 4 5 -> 5 4 3 2 1
        List<T> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size()-i-1)); // compile-time error
        }
    }


}
