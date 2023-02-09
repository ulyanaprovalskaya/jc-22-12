package by.itacademy.lecture17;

import by.itacademy.lecture17.annotation.DefaultValue;

public class BaseClass {

    @DefaultValue("field value")
    private String field;

    public void doSmthVersion2(String str) {
        System.out.println(str);
    }
}
