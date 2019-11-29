package instrumentsTests;

import instruments.FamilyType;
import instruments.Guitar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(FamilyType.STRING, "Wood", 100.00, 120.00, 6, "acoustic");
    }

    @Test
    public void hasFamilyType(){
        assertEquals(FamilyType.STRING, guitar.getFamilyType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(120.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasHowToPlay(){
        assertEquals("Strum", guitar.howToPlay());
    }

    @Test
    public void hasMarkUp(){
        assertEquals(20.00, guitar.calculateMarkUp(), 0.01);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings(), 0.01);
    }

    @Test
    public void hasType(){
        assertEquals("acoustic", guitar.getType());
    }
}
