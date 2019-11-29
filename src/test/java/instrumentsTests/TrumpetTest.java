package instrumentsTests;

import instruments.FamilyType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(FamilyType.BRASS, "brass", 300.00, 375.00, 3, "flugelhorn");
    }

    @Test
    public void hasFamilyType(){
        assertEquals(FamilyType.BRASS, trumpet.getFamilyType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(300.00, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(375.00, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void hasHowToPlay(){
        assertEquals("Blow", trumpet.howToPlay());
    }

    @Test
    public void hasMarkUp(){
        assertEquals(75.00, trumpet.calculateMarkUp(), 0.01);
    }

    @Test
    public void hasNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves(), 0.01);
    }

    @Test
    public void hasType(){
        assertEquals("flugelhorn", trumpet.getType());
    }
}
