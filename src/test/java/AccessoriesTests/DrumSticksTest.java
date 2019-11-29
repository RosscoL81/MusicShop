package AccessoriesTests;

import items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Hickory", 0.99, 4.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("Hickory", drumSticks.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(0.99, drumSticks.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(4.99, drumSticks.getSellPrice(),0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.00, drumSticks.calculateMarkUp(), 0.01);
    }
}
