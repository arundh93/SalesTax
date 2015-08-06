package com.saletax;

public class ExemptedItem {

    private int totalTax;
    private double basePrice;

    public ExemptedItem(double basePrice) {
        this.totalTax = 0;
        this.basePrice = basePrice;
    }

    public double calculateTax() {
        return 0;
    }

}
