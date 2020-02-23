package dev.andrav.atm;

import java.util.ArrayList;
import java.util.List;

public class Cell<Banknote> {
    int cellNominal;
    int cellCapacity;
    List<Banknote> cell;

    public Cell(int cellNominal, int cellCapacity) {
        this.cellNominal = cellNominal;
        this.cellCapacity = cellCapacity;
        this.cell = new ArrayList<>();
    }

    public int getCellNominal() {
        return cellNominal;
    }

    public int getCellCapacity() {
        return cellCapacity;
    }

    public boolean add(Banknote banknote) {
        return true;
    }

    public Banknote get() {
        return cell.get(cell.size()-1);
    }
}
