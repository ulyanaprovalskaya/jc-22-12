package by.itacademy.lecture13;

public class MyRunnable implements Runnable {

    private String name;

    // boolean monitor: true - свободен, false - занят

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm Thread! My name is " + name);
    }
}
