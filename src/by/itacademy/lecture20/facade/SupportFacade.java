package by.itacademy.lecture20.facade;

import by.itacademy.lecture20.facade.support.ForgotPasscodeSupport;
import by.itacademy.lecture20.facade.support.LostCardSupport;
import by.itacademy.lecture20.facade.support.ScammerProblemSupport;

public class SupportFacade {

    private final ForgotPasscodeSupport forgotPasscodeSupport = new ForgotPasscodeSupport();
    private final LostCardSupport lostCardSupport = new LostCardSupport();
    private final ScammerProblemSupport scammerProblemSupport = new ScammerProblemSupport();

    public void updatePasscode() {
        forgotPasscodeSupport.updatePasscode();
    }

    public void blockCard() {
        lostCardSupport.blockCard();
    }

    public void makeNewCard() {
        lostCardSupport.makeNewCard();
    }

    public void rollbackTransaction() {
        scammerProblemSupport.rollbackTransaction();
    }

}

