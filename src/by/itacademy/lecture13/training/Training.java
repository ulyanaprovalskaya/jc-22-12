package by.itacademy.lecture13.training;

public class Training {

    private final Object ball = new Object();

    public void throwBallToPerson(Person person) {
        synchronized (ball) {
            System.out.println("Привет! Меня зовут " + person.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Training training = new Training();

        Person ivan = new Person("Иван");
        Person olya = new Person("Оля");
        Person masha = new Person("Маша");

        Runnable throwBallToIvan = new Runnable() {
            @Override
            public void run() {
                training.throwBallToPerson(ivan);
            }
        };
        Runnable throwBallToOlya = new Runnable() {
            @Override
            public void run() {
                training.throwBallToPerson(olya);
            }
        };
        Runnable throwBallToMasha = new Runnable() {
            @Override
            public void run() {
                training.throwBallToPerson(masha);
            }
        };

        new Thread(throwBallToMasha).start();
        new Thread(throwBallToIvan).start();
        new Thread(throwBallToOlya).start();
    }
}
