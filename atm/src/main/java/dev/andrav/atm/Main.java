package dev.andrav.atm;

import java.util.Currency;

public class Main {
    public static void main(String[] args) {

        Banknote<RUB> rub100 = new Banknote<>(RUB.getInstance(20));
        System.out.println(rub100.getCurrency().getCurrencySymbol());
        System.out.println(rub100.getCurrency().getNominal());
        //System.out.println(rub100.getNominal());
        //System.out.println(rub100.getClass());

        /*Banknote b1 = new Banknote(BanknoteNominal.NOMINAL_100, Currency.getInstance("RUB"));
        System.out.println(b1.getCurrency().getSymbol());
        System.out.println(b1.getType().getClass());*/
    }
}
