package by.itacademy.lecture14.synchronizer.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerExample {

    public static Exchanger<Letter> EXCHANGER;

    public static void main(String[] args) throws InterruptedException {
        EXCHANGER = new Exchanger<>();

        Letter[] posts1 = new Letter[2];
        Letter[] posts2 = new Letter[2];

        posts1[0] = new Letter("п.В - Петров");
        posts1[1] = new Letter("п.Г - Киса Воробьянинов");
        posts2[0] = new Letter("п.Г - Остап Бендер");
        posts2[1] = new Letter("п.В - Иванов");

        // Отправление почтальонов
        new Thread(new Postman("a", "А", "В", posts1)).start();
        Thread.sleep(100);
        new Thread(new Postman("б", "Б", "Г", posts2)).start();
    }

}
