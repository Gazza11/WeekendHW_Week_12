package instrumentAccessoryTest;

import InstrumentAccs.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("18in, Iron", 12., 25.);
    }


    @Test
    public void hasDescription(){
        assertEquals("18in, Iron", guitarStrings.getDescription());
    }

    @Test
    public void hasBoughtFor(){
        assertEquals(12, guitarStrings.getBoughtFor(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(25, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(13, guitarStrings.calculateMarkup(), 0.01);
    }
}
