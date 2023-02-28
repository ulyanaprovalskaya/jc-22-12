package by.itacademy.lecture20.facade;

public class FacadeApplication {

    public static void main(String[] args) {
        SupportFacade supportFacade = new SupportFacade();

        supportFacade.blockCard();
        supportFacade.makeNewCard();
        supportFacade.updatePasscode();
    }
}
