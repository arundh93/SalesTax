package salestax;

import com.saletax.UnExemptedImportItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnExemptedImportItemTest {

    @Test
    public void foo() {
        UnExemptedImportItem item = new UnExemptedImportItem(20.0);

        assertEquals(3.0, item.calculateTax(), 0);
    }



}
