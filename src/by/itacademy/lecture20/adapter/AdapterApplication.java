package by.itacademy.lecture20.adapter;

import by.itacademy.lecture20.adapter.cable.AmericanCable;
import by.itacademy.lecture20.adapter.cable.Cable;
import by.itacademy.lecture20.adapter.cable.EuropeanCable;
import by.itacademy.lecture20.adapter.socket.AmericanSocket;
import by.itacademy.lecture20.adapter.socket.EuropeanSocket;

public class AdapterApplication {

    public static void main(String[] args) {
        Cable americanCable = new AmericanCable();
        Cable europeanCable = new EuropeanCable();

        AmericanSocket americanSocket = new AmericanSocket();
        americanSocket.plug(americanCable);

        EuropeanSocket europeanSocket = new EuropeanSocket();
        europeanSocket.plug(europeanCable);

        AmericanSocketAdapter americanSocketAdapter
                = new AmericanSocketAdapter(europeanCable, americanSocket);
        americanSocketAdapter.connectThroughAdapter();

        EuropeanSocketAdapter europeanSocketAdapter
                = new EuropeanSocketAdapter(americanCable, europeanSocket);
        europeanSocketAdapter.connectThroughAdapter();
    }
}
