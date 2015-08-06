package com.salestax;

import com.saletax.ExemptedItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExemptedItemTest {

    @Test
    public void calculateTaxForItem() {
        ExemptedItem item = new ExemptedItem(10);

        assertEquals(0.0, item.calculateTax(), 0);
    }

    @Test
    public void calculateFinalPriceForItem() {
        ExemptedItem item = new ExemptedItem(10);

        assertEquals(10.0, item.getFinalValue(), 0);
    }
}
