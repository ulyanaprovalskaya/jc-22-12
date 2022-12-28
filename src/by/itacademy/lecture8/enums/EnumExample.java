package by.itacademy.lecture8.enums;

import java.util.Arrays;

public class EnumExample {

    public static void main(String[] args) {
        Day monday = Day.MONDAY;

        System.out.println(Arrays.toString(Day.values()));
        System.out.println(monday.ordinal());
        Day sunday = Day.valueOf("SUNDAY");

        System.out.println(sunday.getTitle());


        Operation sum = Operation.SUM;
        Operation subtraction = Operation.SUBTRACT;

        System.out.println(sum.calculate(1,2));
        System.out.println(sum.calculate(52,2));

        System.out.println(subtraction.calculate(1,2));
        System.out.println(subtraction.calculate(52,2));
    }
}
