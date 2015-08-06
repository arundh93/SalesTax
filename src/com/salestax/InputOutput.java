package com.salestax;

import java.util.Scanner;

public class InputOutput {
    private Scanner scanner;
    private double[] quantityAndPrice;
    InputOutput(Scanner scanner, double[] quantityAndPrice) {
        this.scanner = scanner;
        this.quantityAndPrice = quantityAndPrice;
    }

    public double[] getItem() {
        String input = scanner.nextLine();
        return getQuantityAndPrice(input);
    }

    public double[] getQuantityAndPrice(String input) {
        String [] contents = input.split(" ");
        int quantity = Integer.parseInt(contents[0]);
        double price = Double.parseDouble(contents[contents.length - 1]);
        quantityAndPrice[0] = quantity;
        quantityAndPrice[1] = price;
        return quantityAndPrice;
    }
}
