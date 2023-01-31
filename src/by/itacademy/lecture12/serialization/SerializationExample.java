package by.itacademy.lecture12.serialization;

import java.io.*;
import java.math.BigDecimal;

public class SerializationExample {

    public static void main(String[] args) {
        Car bmw = new Car("X5", "BMW", new BigDecimal(400));
        String filePath = "C:/ITAcademy/JavaCourse2022/car.txt";

        serializeObject(bmw, filePath);
        Car car = deserializeObject(filePath);

        System.out.println(car);

        File file = new File(filePath);
        System.out.println(file.getParent());
    }

    private static <T> void serializeObject(T obj, String filePath) {
        try (OutputStream outputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            objectOutputStream.writeObject(obj);
            System.out.println("Объект " + obj + " успешно сериализован в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static <T> T deserializeObject(String filePath) {
        try (InputStream inputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            T deserializedObj = (T) objectInputStream.readObject();
            System.out.println("Объект " + deserializedObj + " успешно десериализован");
            return deserializedObj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
