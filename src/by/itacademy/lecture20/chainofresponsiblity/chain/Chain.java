package by.itacademy.lecture20.chainofresponsiblity.chain;

import by.itacademy.lecture20.chainofresponsiblity.BanknoteValue;
import by.itacademy.lecture20.chainofresponsiblity.Money;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Chain {

    private final List<AbstractHandler> chain = new LinkedList<>();

    public Chain() {
        AbstractHandler first = new HundredBanknoteHandler();
        AbstractHandler second = new FiftyBanknoteHandler();
        AbstractHandler third = new TwentyBanknoteHandler();
        AbstractHandler fourth = new TenBanknoteHandler();

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

        chain.add(first);
        chain.add(second);
        chain.add(third);
        chain.add(fourth);
    }

    public Map<BanknoteValue, Integer> execute(Money money) {
        return chain.get(0).handle(money, new HashMap<>());
    }
}
