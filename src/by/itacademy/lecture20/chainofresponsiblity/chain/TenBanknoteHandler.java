package by.itacademy.lecture20.chainofresponsiblity.chain;

import by.itacademy.lecture20.chainofresponsiblity.BanknoteValue;
import by.itacademy.lecture20.chainofresponsiblity.Money;
import java.util.Map;
import java.util.Optional;

public class TenBanknoteHandler extends AbstractHandler {

    @Override
    public Map<BanknoteValue, Integer> handle(Money money, Map<BanknoteValue, Integer> resultCash) {
        calculateBanknotes(money, resultCash, BanknoteValue.TEN);
        if (next != null) {
            resultCash = next.handle(money, resultCash);
        }
        return resultCash;
    }
}
