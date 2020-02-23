package dev.andrav.atm;


public class Banknote<T extends MyCurrency> implements Comparable<Banknote> {
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


    /*@Override
    public int compareTo(T o) {
        return this.getBanknoteValue() - o;
    }*/

    @Override
    public int compareTo(Banknote o) {
        return this.getBanknoteValue() - o.getBanknoteValue();
    }
}
