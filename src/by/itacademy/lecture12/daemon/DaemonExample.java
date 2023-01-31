package by.itacademy.lecture12.daemon;

import java.time.LocalDateTime;

public class DaemonExample {

    public static void main(String[] args) {
        Runnable clock = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(LocalDateTime.now());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread clockThread = new Thread(clock);
        clockThread.setDaemon(true);
        clockThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
