package com.salestax;

import java.util.Arrays;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput(new Scanner(System.in), new double[2]);
        for(int i = 0; i < 3; i++) {
            String input = inputOutput.getItem();
            double [] quantityandPrice = inputOutput.getQuantityAndPrice(input);
            System.out.println(Arrays.toString(quantityandPrice));
        }
    }
}
