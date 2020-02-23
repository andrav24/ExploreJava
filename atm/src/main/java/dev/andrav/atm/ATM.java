package dev.andrav.atm;

import java.util.List;

public abstract class ATM<T extends Banknote<? extends MyCurrency>> {

    protected Class<T> currencyClass;

    public ATM(Class<T> currencyClass) {
        this.currencyClass = currencyClass;
    }

    // отдает обратно нераспознанные банкноты
    abstract List<T> deposit(List<T> banknote);

    abstract List<T> withdraw(int amount);

    abstract int getBalanceATM();
}
