package by.itacademy.lecture20.factory.abstractfactory;

import by.itacademy.lecture20.factory.abstractfactory.factory.BmwFactory;
import by.itacademy.lecture20.factory.abstractfactory.factory.MercedesFactory;
import java.util.Scanner;

public class CarFactoryApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите производителя: 1 - BMйW, 2 - мерседес");

        int choice = 1;
        while (choice != 0) {
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("БМВ");
                    BmwFactory bmwFactory = new BmwFactory();
                    System.out.println("Выберите тип автомобиля: 1 - , 2 -, 3 - ");

                    //..

                    choice = 0;
                    break;
                case 2:
                    System.out.println("Мерседес");
                    MercedesFactory mercedesFactory = new MercedesFactory();
                    System.out.println("Выберите тип автомобиля: 1 - , 2 - ");

                    //...

                    choice = 0;
                    break;
                case 0:
                    choice = 0;
                    break;
                default:
                    System.out.println("Неверный вариант!");
            }
        }
    }
}
