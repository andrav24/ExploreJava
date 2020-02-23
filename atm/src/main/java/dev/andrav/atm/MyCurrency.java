package dev.andrav.atm;

import java.util.Currency;

public abstract class MyCurrency {

    Nominalable nominal;
    CurrencyType currency;

    public MyCurrency(Nominalable nominal, CurrencyType currency) {
        this.nominal = nominal;
        this.currency = currency;
    }

    public int getNominal() {
        return nominal.getNominal();
    }

    public Currency getCurrency() {
        return currency.getCurrency();
    }

    public String getCurrencySymbol() {
        return currency.getCurrency().getSymbol();
    }

}
