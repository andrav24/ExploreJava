package dev.andrav.atm;

import java.util.ArrayList;
import java.util.List;

public class CellBox<T extends Cell> {

    private final int maxCellQuantity = 4;
    private int cellQuantity;
    private List<Nominalable> cellNominals;
    private List<Cell> storages;

    private CellBox(int cellQuantity, BanknoteNominal ... cellNominals) {
        this.cellQuantity = cellQuantity;
        this.cellNominals = List.of(cellNominals);
        this.storages = new ArrayList<>();
        for (int i = 0; i < cellQuantity; i++) {
            storages.add(new Cell(this.cellNominals.get(i), 100));
        }
    }

    public static CellBox getInstance(int cellQuantity, BanknoteNominal ... cellNominals) {
        return new CellBox(cellQuantity, cellNominals);
    }

    public void print() {
        for (Cell storage : storages) {
            System.out.println(storage.cellCapacity);
        }
    }

    /*private void addCellNominals(Nominalable[] arr) {
        this.setCellNominals = Set.of(arr);
    }*/

    /*private void addCell(Nominalable cellNominal, int cellCapacity) {
        cellBox.add(new Cell(cellNominal, cellCapacity));
    }*/

    static class Cell {
        static int maxCellCapacity = 250;
        Nominalable cellNominal;
        int cellCapacity;
        List<Banknote<?>> cell;

        public Cell(Nominalable cellNominal, int cellCapacity) {
            this.cellNominal = cellNominal;
            this.cellCapacity = cellCapacity;
            this.cell = new ArrayList<>();
        }

        public int getCellNominal() {
            return cellNominal.getNominal();
        }

        public int getCellCapacity() {
            return cellCapacity;
        }

        public boolean add(Banknote<?> banknote) {
            return true;
        }

        public Banknote<?> get() {
            return cell.get(cell.size()-1);
        }
    }
}
