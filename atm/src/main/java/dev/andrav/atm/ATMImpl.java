package dev.andrav.atm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ATMImpl<T extends Banknote<? extends MyCurrency>> extends ATM<T> {


    public ATMImpl(Class<T> currencyClass) {
        super(currencyClass);
    }

    void init() {}


    @Override
    public List<T> deposit(List<T> banknote) {
        return Collections.<T>emptyList();
    }

    @Override
    public List<T> withdraw(int amount) {
        return Collections.<T>emptyList();
    }

    @Override
    public int getBalanceATM() {
        return 0;
    }

    public List<T> getDemoData() {
        List<T> listBanknotes = new ArrayList<>();
        int i;
        for (i = 0; i < 1; i++) {
            listBanknotes.add((T) new Banknote<MyCurrency>(RUB.getInstance(100)));
            listBanknotes.add((T) new Banknote<MyCurrency>(RUB.getInstance(500)));
            listBanknotes.add((T) new Banknote<MyCurrency>(USD.getInstance(50)));
            listBanknotes.add((T) new Banknote<MyCurrency>(RUB.getInstance(1000)));
        }
        return listBanknotes;
    }
}
