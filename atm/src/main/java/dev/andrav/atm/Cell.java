package dev.andrav.atm;

import java.util.ArrayList;
import java.util.List;

public class Cell<Banknote> {

    int cellCapacity = 2500;
    int cellNominal;
    int currentSize;
    List<Banknote> cell;

    public Cell() {
        this.cell = new ArrayList<>();
    }

    public Cell(int cellNominal, int cellCapacity) {
        this.cellNominal = cellNominal;
        this.cellCapacity = cellCapacity;
        this.cell = new ArrayList<>();
    }

    public int getCurrentSize() {
        return cell.size();
    }

    public int getCellNominal() {
        return cellNominal;
    }

    public int getCellCapacity() {
        return cellCapacity;
    }

    public boolean add(Banknote banknote) {
        cell.add(banknote);
        return true;
    }

    public Banknote get() {
        return cell.get(cell.size()-1);
    }
}
