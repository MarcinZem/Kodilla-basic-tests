package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.values = new int[10];
    }

    public void add(int value) {
        this.size++;
//        int[] newTab = new int[this.size];
//        System.arraycopy(values, 0, newTab, 0, values.length);
//        newTab[this.size - 5] = value;
//        this.values = newTab;
        this.values[this.size] = value;
    }



    public int[] getValues() {
        return values;
    }
}
