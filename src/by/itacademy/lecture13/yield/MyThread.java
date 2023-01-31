package by.itacademy.lecture13.yield;

public class MyThread extends Thread {

    public MyThread() {
        this.start();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " уступает свое место");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }

}
