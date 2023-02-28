package by.itacademy.lecture20.mediator;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private List<Pilot> pilots = new ArrayList<>();

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void sendWarning(Pilot pilot, String message) {
        System.out.printf("Диспетчер получил сообщение от пилота %s: %s\n", pilot.getName(), message);
        for(Pilot p : pilots) {
            if(!p.equals(pilot)) {
                p.receiveMessage(message);
            }
        }
    }
}
