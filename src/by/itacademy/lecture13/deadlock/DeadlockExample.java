package by.itacademy.lecture13.deadlock;

public class DeadlockExample {

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");
        Runnable bowToGaston = new Runnable() {
            @Override
            public void run() {
                alphonse.bow(gaston);
            }
        };
        Runnable bowToAlphonse = new Runnable() {
            @Override
            public void run() {
                gaston.bow(alphonse);
            }
        };
        new Thread(bowToGaston).start(); // Альфонсо кланяется Гастону
        new Thread(bowToAlphonse).start(); // Гастон кланяется Альфонсо

    }
}
