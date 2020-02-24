package dev.andrav.atm;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CellBox<T extends Cell> {

    //private TreeSet<Integer> setNominalsInt = new TreeSet<>();
    private Map<Integer, Cell<Banknote<?>>> storage = new TreeMap<>();

    private CellBox(BanknoteNominal ... cellNominals) {
        for (int i = 0; i < cellNominals.length; i++) {
            //setNominalsInt.add(cellNominals[i].getNominal());
            storage.put(cellNominals[i].getNominal(), new Cell<>());
        }
    }

    public static CellBox getInstance(BanknoteNominal ... cellNominals) {
        return new CellBox(cellNominals);
    }

    public void addBanknote(Banknote<?> banknote) {
        storage.get(banknote.getBanknoteValue()).add(banknote);
    }

    public void print() {
        System.out.println(storage.size());
        storage.forEach((x,y) ->
                System.out.println(
                        "Cell " + x +
                                ":\tCapacity: " + storage.get(x).getCellCapacity() +
                                        "\tCurrent size: " + storage.get(x).getCurrentSize()));
        System.out.println("Cell nominals: ");
        storage.keySet().forEach(System.out::println);
    }
}
