import behaviours.ISell;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ISell sheetMusic;

    @Before
    public void before(){
        customer = new Customer("student", 10);
        sheetMusic = new SheetMusic("Thriller Sheet Music", 8.00, 9.99);
    }

    @Test
    public void canGetEmploymentStatus(){
        assertEquals("student", customer.getEmploymentStatus());
    }

    @Test
    public void canGetWallet(){
        assertEquals(10, customer.getWallet());
    }


    @Test
    public void canMakePurchase(){
        customer.makePurchase(sheetMusic);
        assertEquals(1, customer.numberOfPurchases());
        assertEquals(0.01, customer.getWallet(), 0.01);

    }
}
