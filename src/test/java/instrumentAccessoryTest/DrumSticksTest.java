package instrumentAccessoryTest;

import InstrumentAccs.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("12in, Wooden", 9.99, 23.45);
    }

    @Test
    public void hasDescription(){
        assertEquals("12in, Wooden", drumSticks.getDescription());
    }

    @Test
    public void hasBoughtFor(){
        assertEquals(9.99, drumSticks.getBoughtFor(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(23.45, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(13.46, drumSticks.calculateMarkup(), 0.01);
    }
}
