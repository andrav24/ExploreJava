package dev.andrav.atm;

public class Banknote<T extends MyCurrency> {
    private T currency;

    public Banknote(T currency) {
        this.currency = currency;
    }

    public T getCurrency() {
        return currency;
    }

    public int getNominal() {
        return currency.getNominal();
    }
}
