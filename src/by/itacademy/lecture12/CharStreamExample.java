package by.itacademy.lecture12;

import java.io.*;

public class CharStreamExample {

    public static void main(String[] args) {
        try (Reader reader = new FileReader("file.txt");
             Writer writer = new FileWriter("copy.txt")) {

            int i = -1;
            while ((i = reader.read()) != -1) {
                char ch = (char) i;
                writer.write(ch);
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
