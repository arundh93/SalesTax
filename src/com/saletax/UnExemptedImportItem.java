package com.saletax;

public class UnExemptedImportItem {

    private int totalTax;
    private double basePrice;
    public UnExemptedImportItem(double basePrice) {
        this.basePrice = basePrice;
        totalTax = 15;
    }

    public double calculateTax() {
        return basePrice * totalTax / 100;
    }
}
