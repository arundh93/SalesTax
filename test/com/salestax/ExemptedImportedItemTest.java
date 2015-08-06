package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExemptedImportedItemTest {

    @Test
    public void calculateTaxForItem() {
        ExemptedImportedItem item = new ExemptedImportedItem(10);

        assertEquals(0.5, item.calculateTax(), 0);
    }
}
