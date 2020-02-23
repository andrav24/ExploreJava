package dev.andrav.atm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CellBoxTrue {

    private Map<BanknoteNominal, List<Banknote<?>>> storage = new HashMap<>();

    public CellBoxTrue() {
    }

    public void push(Banknote<?> banknote) {
        storage.put(banknote.getBanknoteCurrencyUnit().getNominalType(), )
    }
}
