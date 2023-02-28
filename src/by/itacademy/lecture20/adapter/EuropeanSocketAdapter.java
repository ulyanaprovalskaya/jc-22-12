package by.itacademy.lecture20.adapter;

import by.itacademy.lecture20.adapter.cable.Cable;
import by.itacademy.lecture20.adapter.socket.AmericanSocket;
import by.itacademy.lecture20.adapter.socket.EuropeanSocket;

public class EuropeanSocketAdapter {

    private Cable cable;
    private EuropeanSocket europeanSocket;

    public EuropeanSocketAdapter(Cable cable, EuropeanSocket europeanSocket) {
        this.cable = cable;
        this.europeanSocket = europeanSocket;
    }

    public void connectThroughAdapter() {
        System.out.println("Подключаем адаптер");
        europeanSocket.plug(cable);
    }


}
