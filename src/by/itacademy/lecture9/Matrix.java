package by.itacademy.lecture9;

public class Matrix<T extends Number> {

    private T[][] array;
    private int m;
    private int n;

    public Matrix() {
    }

    public Matrix(T[][] array) {
        this.array = array;
        this.m = array.length;
        this.n = array[0].length;
    }

    //Поменять местами строки row1 и row2
    public void swapRows(int row1, int row2) {
        T[] tmp = array[row1];
        array[row1] = array[row2];
        array[row2] = tmp;
    }

    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
