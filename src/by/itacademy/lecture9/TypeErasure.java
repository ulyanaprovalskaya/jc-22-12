package by.itacademy.lecture9;

public class TypeErasure<T> {

    private T value1;
    private T value2;

    public void printValues() {
        System.out.println(value1);
        System.out.println(value2);
    }

    public static <T> TypeErasure<T> createAndAdd2Values(Object o1, Object o2) {
        TypeErasure<T> result = new TypeErasure<>();
        result.value1 = (T) o1;
        result.value2 = (T) o2;
        return result;
    }

    public static void main(String[] args) {
        TypeErasure<Integer> erasureInt = TypeErasure.createAndAdd2Values("abc", 2.4);
        erasureInt.printValues();
    }

}
