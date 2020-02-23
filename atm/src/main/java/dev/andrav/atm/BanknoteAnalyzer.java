package dev.andrav.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BanknoteAnalyzer<T extends Banknote<? extends MyCurrency>> {

    private List<T> accepted = new ArrayList<>();
    private List<T> unaccepted = new ArrayList<>();
    private Class<T> currencyClass;

    public BanknoteAnalyzer(Class<T> currencyClass) {
        this.currencyClass = currencyClass;
    }

    public void getAnalyze(List<T> list) {
        for (T banknote : list) {
            if (currencyClass.isInstance(banknote.getBanknoteCurrencyUnit())) {
                accepted.add(banknote);
                System.out.println("Принимаем: " + banknote.getBanknoteValue() + " " + banknote.getBanknoteCurrencySymbol());
            } else {
                unaccepted.add(banknote);
                System.out.println("Отбрасываем: " + banknote.getBanknoteValue() + " " + banknote.getBanknoteCurrencySymbol());
            }
        }
        TreeSet<T> treeSet = new TreeSet<>(accepted);
        treeSet.forEach(e -> System.out.println(e.getBanknoteValue()));
    }
}
