package by.itacademy.lecture13;

public class MultithreadingExample {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(new MyRunnable("Поток " + i)).start();
        }
    }
}
