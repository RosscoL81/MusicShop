import behaviours.ISell;
import instruments.FamilyType;
import instruments.Guitar;
import items.DrumSticks;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell guitar;
    ISell sheetMusic;
    ISell drumSticks;
    ISell guitar2;
    Customer customer;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange", 1000.00);
        guitar = new Guitar(FamilyType.STRING, "wood", 100, 120, 4, "bass");
        sheetMusic = new SheetMusic("Stereophonics Sheet Music", 5.00, 7.99);
        drumSticks = new DrumSticks("Hickory", 0.99, 3.99);
        guitar2 = new Guitar(FamilyType.STRING, "wood", 150.00, 225.00, 6, "acoustic");
        customer = new Customer("student", 130);

    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(1000.00, shop.getTill(), 0.01);
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(guitar);
        shop.addStock(sheetMusic);
        shop.removeStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canGetTotalProfitOfStock(){
        shop.addStock(guitar);
        shop.addStock(sheetMusic);
        shop.addStock(drumSticks);
        shop.addStock(guitar2);
        assertEquals(100.99, shop.getPotentialProfit(), 0.01);

    }

    @Test
    public void sellToCustomer(){
        shop.addStock(guitar);
        shop.sellToCustomer(guitar, customer);
        assertEquals(0, shop.getStockCount());
        assertEquals(1120, shop.getTill(), 0.01);
        assertEquals(1, customer.numberOfPurchases());
        assertEquals(10.00, customer.getWallet(), 0.01);

    }
}
