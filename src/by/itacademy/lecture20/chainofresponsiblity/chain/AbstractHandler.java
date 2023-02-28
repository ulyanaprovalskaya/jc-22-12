package by.itacademy.lecture20.chainofresponsiblity.chain;

import by.itacademy.lecture20.chainofresponsiblity.BanknoteValue;
import by.itacademy.lecture20.chainofresponsiblity.Money;
import java.util.Map;

public abstract class AbstractHandler {

    protected AbstractHandler next;

    public abstract Map<BanknoteValue, Integer> handle(Money money, Map<BanknoteValue, Integer> resultCash);

    public void setNext(AbstractHandler next) {
        this.next = next;
    }
    
    protected void calculateBanknotes(Money money, Map<BanknoteValue, Integer> resultCash, BanknoteValue banknoteValue) {
        while (money.getValue() >= banknoteValue.getValue()) {
            int value = 1;
            if (resultCash.get(banknoteValue) != null) {
                value = resultCash.get(banknoteValue) + 1;
            }
            resultCash.put(banknoteValue, value);
            money.setValue(money.getValue() - banknoteValue.getValue());
        }
        
    }
}
