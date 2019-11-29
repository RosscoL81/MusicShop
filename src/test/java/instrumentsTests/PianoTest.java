package instrumentsTests;

import instruments.FamilyType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(FamilyType.PERCUSSION, "wood", 600.00, 750.00, 88);
    }

    @Test
    public void hasFamilyType(){
        assertEquals(FamilyType.PERCUSSION, piano.getFamilyType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(600.00, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(750, piano.getSellPrice(), 0.01);
    }

    @Test
    public void hasHowToPlay(){
        assertEquals("press keys", piano.howToPlay());
    }

    @Test
    public void hasMarkUp(){
        assertEquals(150.00, piano.calculateMarkUp(), 0.01);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(88, piano.getNumberOfKeys(), 0.01);
    }



}
