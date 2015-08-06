package com.salestax;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class InputOutputTest {

    @Test
    public void canSplitInput() {
        InputOutput inputOutput = new InputOutput(new Scanner(System.in), new double[2]);

        assertArrayEquals(new double[]{1, 12.49}, inputOutput.getQuantityAndPrice("1 book at 12.49"), 0);
    }

}