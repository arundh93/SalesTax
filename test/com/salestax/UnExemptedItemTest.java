package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnExemptedItemTest {

    @Test
    public void calculateTaxForItem() {
        UnExemptedItem item = new UnExemptedItem(10);

        assertEquals(1.0, item.calculateTax(), 0);
    }
}
