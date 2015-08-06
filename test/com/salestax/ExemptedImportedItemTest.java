package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExemptedImportedItemTest {

    @Test
    public void calculateTaxForItem() {
        ExemptedImportedItem item = new ExemptedImportedItem(10);

        assertEquals(0.5, item.calculateTax(), 0);
    }

    @Test
    public void calculateFinalPriceAfterTaxForItem() {
        ExemptedImportedItem item = new ExemptedImportedItem(10.0);

        assertEquals(10.5, item.getFinalValue(), 0);
    }
}
