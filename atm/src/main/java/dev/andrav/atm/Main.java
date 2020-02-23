package dev.andrav.atm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Banknote> listBanknote = new ArrayList<>();
        int i;
        for (i = 0; i < 100; i++) {
            listBanknote.add(new Banknote(RUB.getInstance(100)));
            listBanknote.add(new Banknote(RUB.getInstance(500)));
        }

        for (Banknote banknote : listBanknote) {
            System.out.println(banknote.getBanknoteValue() + " " + banknote.getBanknoteCurrencySymbol());
        }
    }
}
