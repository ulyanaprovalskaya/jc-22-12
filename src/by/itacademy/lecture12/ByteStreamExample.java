package by.itacademy.lecture12;

import java.io.*;
import java.util.Scanner;

public class ByteStreamExample {

    public static void main(String[] args) {
        try {
            InputStream fin = new FileInputStream("file.txt");
            OutputStream ous = new FileOutputStream("copy.txt");
            System.out.printf("File size: %d bytes \n", fin.available());

            byte[] text = new byte[fin.available()];
            for (int i = 0; i < text.length; i++) {
                char ch = (char) fin.read();
                text[i] = (byte) ch;
                System.out.print(ch);
            }
            ous.write(text);
            //fin.close();

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nВведите символ, чтобы продолжить: ");
            scanner.next();

            ous.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
