package by.itacademy.lecture20.factory.method;

import by.itacademy.lecture20.factory.method.service.CarTransportationService;
import by.itacademy.lecture20.factory.method.service.PlaneTransportationService;
import by.itacademy.lecture20.factory.method.service.TransportationService;
import by.itacademy.lecture20.factory.method.transport.Transport;
import java.util.Scanner;

/**
 * Сервис трансортировки грузов. Требования:
 * существуют разные виды транспорта (автомобиль, самолет), пользователь может выбирать
 * необходимый ему вид транспорта в меню пользователя и затем делать запрос на
 * транспортировку из точи А в точку Б
 */
public class TransportationApplication {

    private static TransportationService transportationService;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ транспортировки: 1 - автомобиль, 2 - самолет");

        int choice = 1;
        while (choice != 0) {
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Был выбран автомобиль в качестве способа транспортировки");
                    transportationService = new CarTransportationService();
                    choice = 0;
                    break;
                case 2:
                    System.out.println("Был выбран самолет в качестве способа транспортировки");
                    transportationService = new PlaneTransportationService();
                    choice = 0;
                    break;
                case 0:
                    choice = 0;
                    break;
                default:
                    System.out.println("Неверный вариант!");
            }

        }

        // оформление заявки на транспортировку
        Transport transport = transportationService.createTransport();
        transportationService.makeRequest(transport);
    }
}
