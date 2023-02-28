package by.itacademy.lecture20.chainofresponsiblity;

import by.itacademy.lecture20.chainofresponsiblity.chain.Chain;
import java.util.Map;

public class AtmMachine {

    private Chain chain;

    public AtmMachine(Chain chain) {
        this.chain = chain;
    }

    public Map<BanknoteValue, Integer> withdrawCash(Money money) {
        return chain.execute(money);
    }
}
