package by.itacademy.lecture20.adapter.socket;

import by.itacademy.lecture20.adapter.cable.AmericanCable;
import by.itacademy.lecture20.adapter.cable.Cable;
import by.itacademy.lecture20.adapter.cable.EuropeanCable;

public class AmericanSocket implements Socket {

    public void plug(Cable cable) {
        System.out.println("Подключение устройства в американскую розетку");
    }


}
