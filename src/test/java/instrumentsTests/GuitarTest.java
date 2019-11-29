package instrumentsTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("String", "Wood", 100.00, 120.00, 6);
    }

    @Test
    public void hasType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(50.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(60.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasHowToPlay(){
        assertEquals("Strum", guitar.howToPlay());
    }

    @Test
    public void hasMarkUp(){
        assertEquals(10.00, guitar.calculateMarkUp(), 0.01);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings(), 0.01);
    }

}
