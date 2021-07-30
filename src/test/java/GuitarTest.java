import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Red", instrumentType.GUITAR, 6, 120.99, 250.00);
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(instrumentType.GUITAR, guitar.getInstrumentType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasBoughtForAmount(){
        assertEquals(120.99, guitar.getBoughtForAmount(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(250, guitar.getSellingPrice(), 0.01);
    }
}
