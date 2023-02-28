package by.itacademy.lecture20.chainofresponsiblity;

public enum BanknoteValue {
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    Integer value;

    BanknoteValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
