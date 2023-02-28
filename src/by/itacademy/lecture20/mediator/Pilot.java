package by.itacademy.lecture20.mediator;

public class Pilot {

    private String name;
    private Dispatcher dispatcher;

    public Pilot(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.printf("Пилот %s отправил сообщение диспетчеру: %s\n", name, message);
        dispatcher.sendWarning(this, message);
    }

    public void receiveMessage(String message) {
        System.out.printf("Пилот %s получил сообщение: %s\n", name, message);
    }
}
