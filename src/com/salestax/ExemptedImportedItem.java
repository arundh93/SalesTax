package com.salestax;

public class ExemptedImportedItem {

    private int totalTax;
    private double basePrice;

    public ExemptedImportedItem(double basePrice) {
        this.basePrice = basePrice;
        totalTax = 5;
    }
    public double calculateTax() {
        return basePrice * totalTax / 100;
    }

    public double getFinalValue() {
        return basePrice + calculateTax();
    }
}
