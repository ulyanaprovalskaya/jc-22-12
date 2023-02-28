package by.itacademy.lecture20.adapter;

import by.itacademy.lecture20.adapter.cable.Cable;
import by.itacademy.lecture20.adapter.socket.AmericanSocket;

public class AmericanSocketAdapter {

    private Cable cable;
    private AmericanSocket americanSocket;

    public AmericanSocketAdapter(Cable cable, AmericanSocket americanSocket) {
        this.cable = cable;
        this.americanSocket = americanSocket;
    }

    public void connectThroughAdapter() {
        System.out.println("Подключаем адаптер");
        americanSocket.plug(cable);
    }


}
