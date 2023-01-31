package by.itacademy.lecture13.join;

public class JoinExample {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Поток начал свою работу");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Поток завершил свою работу");
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

        try {
            thread1.join();// главный поток остановит свое выполнение до тех пор, пока thread1 не завершится
            System.out.println("Главный поток продолжил свое выполнение");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
