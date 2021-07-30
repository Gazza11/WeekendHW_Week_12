package instrumentTests;

import instruments.DrumSet;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSetTest {

    DrumSet drumSet;

    @Before
    public void before(){
        drumSet = new DrumSet("Zildjian", "Gold", InstrumentType.DRUMSET, 149.98, 300., 5, 3);
    }

    @Test
    public void hasMake(){
        assertEquals("Zildjian", drumSet.getMake());
    }

    @Test
    public void hasColour(){
        assertEquals("Gold", drumSet.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.DRUMSET, drumSet.getType());
    }

    @Test
    public void hasBoughtForAmount(){
        assertEquals(149.98, drumSet.getBoughtFor(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(300, drumSet.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNumberOfDrums(){
        assertEquals(5, drumSet.getNumberOfDrums(), 0.01);
    }

    @Test
    public void hasNumberOfCymbals(){
        assertEquals(3, drumSet.getNumberOfCymbals(), 0.01);
    }

    @Test
    public void canSetNumberOfDrums(){
        drumSet.setNumberOfDrums(6);
        assertEquals(6, drumSet.getNumberOfDrums(), 0.01);
    }

    @Test
    public void canSetNumberOfCymbals(){
        drumSet.setNumberOfCymbals(5);
        assertEquals(5, drumSet.getNumberOfCymbals(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Seven Nation Army", drumSet.play());
    }
}
