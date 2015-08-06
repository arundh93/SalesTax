package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnExemptedImportItemTest {

    @Test
    public void calculateTaxForItem() {
        UnExemptedImportItem item = new UnExemptedImportItem(20.0);

        assertEquals(3.0, item.calculateTax(), 0);
    }

    @Test
    public void calculateFinalPriceAfterTaxForItem() {
        UnExemptedImportItem item = new UnExemptedImportItem(20.0);

        assertEquals(23.0, item.getFinalValue(), 0);
    }

}
