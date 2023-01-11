package by.itacademy.practice1.bookshop.menu;

import by.itacademy.practice1.bookshop.Bookshop;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в книжный магазин!");
        System.out.println("Выберите действие: 1 - Перейти в книги, 2 - Перейти в канцелярию, 3 - Выход");

        int choice = scanner.nextInt();

        Bookshop bookshop = new Bookshop();

        switch (choice) {
            case 1:
                System.out.println(bookshop.getBooks());
            case 2:
            case 3:
                break;
        }
    }
}
