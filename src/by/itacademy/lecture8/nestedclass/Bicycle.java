package by.itacademy.lecture8.nestedclass;

public class Bicycle {

    private String model;
    private float weight;

    public Bicycle(String model, float weight) {
        this.model = model;
        this.weight = weight;
    }

    public void printClassInfo() {
        System.out.println("Это класс " + this.getClass());
        Bicycle.Seat seat = this.new Seat();
    }

    public class Seat {
        public void up() {
            System.out.printf("У модели \"%s\" было поднято сиденье\n", model);
        }

        public void down() {
            System.out.println("Сиденье опущено");
        }
    }
}
