package by.itacademy.lecture14.synchronizer.phaser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class PhaserExample {

    public static Phaser PHASER;

    private static String OPEN = "     открытие дверей ";
    private static String CLOSE = "     закрытие дверей ";

    public static void main(String[] args) throws InterruptedException {
        // Регистрация объекта синхронизации
        PHASER = new Phaser(1);

        List<Passenger> passengers = new ArrayList<>();

        // Формирование массива пассажиров
        for (int i = 1; i < 5; i++) {
            if ((int) (Math.random() * 2) > 0) {
              // Этот пассажир проезжает одну станцию
                passengers.add(new Passenger(10 + i, i, i + 1));
            }
            if ((int) (Math.random() * 2) > 0) {
                // Этот пассажир едет до конечной
                Passenger p = new Passenger(20 + i, i, 5);
                passengers.add(p);
            }
        }

        // Фазы 0 и 6 - конечные станции
        // Фазы 1...5 - промежуточные станции
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    System.out.println("Метро вышло из тупика");
                    // Нулевая фаза, участников нет
                    PHASER.arrive();
                    break;
                case 6:
                    // Завершаем синхронизацию
                    System.out.println("Метро ушло в тупик");
                    PHASER.arriveAndDeregister();
                    break;
                default:
                    int currentStation = PHASER.getPhase();
                    System.out.println("Станция " + currentStation);
                    // Проверка наличия пассажиров на станции
                    for (Passenger pass : passengers) {
                        if (pass.getDeparture() == currentStation) {
                            // Регистрация участника
                            PHASER.register();
                            new Thread(pass).start();
                        }
                    }
                    System.out.println(OPEN);

                    // Phaser ожидает завершения фазы
                    // всеми участниками
                    PHASER.arriveAndAwaitAdvance();

                    System.out.println(CLOSE);
            }
        }
    }
}
