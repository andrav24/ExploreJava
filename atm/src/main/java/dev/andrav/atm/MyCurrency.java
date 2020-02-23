package dev.andrav.atm;

import java.util.Currency;

public abstract class MyCurrency {

    protected Nominalable nominal;
    protected CurrencyType currencyType;

    public MyCurrency(Nominalable nominal, CurrencyType currencyType) {
        this.nominal = nominal;
        this.currencyType = currencyType;
    }

    public int getValue() {
        return nominal.getNominal();
    }

    public Currency getCurrency() {
        return currencyType.getCurrency();
    }

    public String getCurrencySymbol() {
        return getCurrency().getSymbol();
    }

}
