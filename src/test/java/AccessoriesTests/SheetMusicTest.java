package AccessoriesTests;

import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Thriller Sheet Music", 8.00, 9.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("Thriller Sheet Music", sheetMusic.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(8.00, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(9.99, sheetMusic.getSellPrice(),0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1.99, sheetMusic.calculateMarkUp(), 0.01);
    }


}
