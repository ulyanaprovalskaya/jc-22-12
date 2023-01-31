package by.itacademy.lecture13;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Запущен поток " + getName());
    }
}
