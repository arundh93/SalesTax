package com.salestax;

public class UnExemptedItem {

    private int totalTax;
    private double basePrice;

    public UnExemptedItem(double basePrice) {
        totalTax = 10;
        this.basePrice = basePrice;
    }

    public double calculateTax() {
        return basePrice * totalTax / 100;
    }

    public double getFinalPrice() {
        return basePrice + calculateTax();
    }
}
