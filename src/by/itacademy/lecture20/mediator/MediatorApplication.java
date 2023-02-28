package by.itacademy.lecture20.mediator;

public class MediatorApplication {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        Pilot ivan = new Pilot("Иван", dispatcher);
        Pilot maria = new Pilot("Мария", dispatcher);
        Pilot anton = new Pilot("Антон", dispatcher);

        dispatcher.getPilots().add(ivan);
        dispatcher.getPilots().add(maria);
        dispatcher.getPilots().add(anton);

        ivan.sendMessage("Cамолет неожиданно идет на посадку");
    }
}
