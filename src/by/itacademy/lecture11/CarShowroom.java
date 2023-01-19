package by.itacademy.lecture11;

import java.util.List;

public class CarShowroom {

    private List<Car> cars;

    public CarShowroom(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        if (cars == null) {
            throw new CarNotfoundException("В салоне нет машин");
        }
        return cars;
    }
}
