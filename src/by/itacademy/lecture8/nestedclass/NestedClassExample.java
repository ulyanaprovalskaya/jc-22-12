package by.itacademy.lecture8.nestedclass;

public class NestedClassExample {

    public static void main(String[] args) {
        Bicycle aist = new Bicycle("Аист", 7.5f);
        Bicycle.Seat aistSeat = aist.new Seat();
        aistSeat.up();
        aistSeat.down();


    }
}
