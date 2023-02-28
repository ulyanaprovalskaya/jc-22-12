package by.itacademy.lecture20.chainofresponsiblity.chain;

import by.itacademy.lecture20.chainofresponsiblity.BanknoteValue;
import by.itacademy.lecture20.chainofresponsiblity.Money;
import java.util.Map;

public class TwentyBanknoteHandler extends AbstractHandler {

    @Override
    public Map<BanknoteValue, Integer> handle(Money money, Map<BanknoteValue, Integer> resultCash) {
        calculateBanknotes(money, resultCash, BanknoteValue.TWENTY);
        return next.handle(money, resultCash);
    }
}
