package by.itacademy.lecture20.chainofresponsiblity;

import by.itacademy.lecture20.chainofresponsiblity.chain.Chain;
import java.util.Map;

public class ChainOfResponsibilityApplication {

    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine(new Chain());
        Money money = new Money(280);

        Map<BanknoteValue, Integer> result = atmMachine.withdrawCash(money);

        result.entrySet().stream().forEach(entry -> {
            System.out.println("Купюра номиналом " + entry.getKey().getValue() + ": " + entry.getValue());
        });

    }
}
