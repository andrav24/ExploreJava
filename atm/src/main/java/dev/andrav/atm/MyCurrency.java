package dev.andrav.atm;

import java.util.Currency;
import java.util.Objects;

public abstract class MyCurrency {

    protected Nominalable nominal;
    protected CurrencyType currencyType;

    protected MyCurrency(Nominalable nominal, CurrencyType currencyType) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyCurrency)) return false;
        MyCurrency that = (MyCurrency) o;
        return nominal.equals(that.nominal) &&
                currencyType == that.currencyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, currencyType);
    }
}
