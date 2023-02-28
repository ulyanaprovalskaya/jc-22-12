package by.itacademy.lecture20.facade.support;

public class ScammerProblemSupport {

    public void rollbackTransaction() {
        System.out.println("Откат последней транзакции и возврат средств на карту");
    }

    public void blockCard() {
        System.out.println("Блокировка карты");
    }
}
