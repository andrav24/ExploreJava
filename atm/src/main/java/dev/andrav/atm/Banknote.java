package dev.andrav.atm;

public class Banknote<T extends MyCurrency> {
    private T currencyUnit;

    public Banknote(T currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    public T getBanknoteCurrencyUnit() {
        return currencyUnit;
    }

    public int getBanknoteValue() {
        return currencyUnit.getValue();
    }

    public String getBanknoteCurrencySymbol() {
        return currencyUnit.getCurrencySymbol();
    }
}
