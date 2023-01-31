package by.itacademy.lecture13.threadlocal;

public class ThreadLocalExample {

    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name + " first threadLocal: " + threadLocal.get());
                threadLocal.set(name + " thread value");
                System.out.println(name + " end threadLocal: " + threadLocal.get());
            }
        };

        threadLocal.set("From main thread");
        Thread thread1 = new Thread(runnable, "first_thread");
        thread1.start();
        Thread thread2 = new Thread(runnable, "second_thread");
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("fromMainThread: " + threadLocal.get());

    }
}
