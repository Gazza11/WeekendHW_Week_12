import InstrumentAccs.DrumSticks;
import InstrumentAccs.GuitarStrings;
import instruments.DrumSet;
import instruments.Guitar;
import instruments.ISell;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar1;
    Guitar guitar2;
    DrumSet drumSet;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings1;
    GuitarStrings guitarStrings2;
    ArrayList<ISell> stock;
    ArrayList<ISell> stockWithoutGuitar2;

    @Before
    public void before(){
        guitar1 = new Guitar("Fender", "Red", InstrumentType.STRING,  120.99, 250.00, 6);
        guitar2 = new Guitar("Axe", "Electric Blue", InstrumentType.STRING, 240., 900., 6);
        drumSet = new DrumSet("Zildjian", "Gold", InstrumentType.PERCUSSION, 149.98, 300., 5, 3);
        guitarStrings1 = new GuitarStrings("18in, Iron", 12., 25.);
        guitarStrings2 = new GuitarStrings("20in, Aluminium", 20., 49.);
        drumSticks = new DrumSticks("12in, Wooden", 9.99, 23.45);
        List<ISell> stockList = Arrays.asList(guitar1, guitar2, drumSet, guitarStrings1, drumSticks);
        stock = new ArrayList<>();
        stock.addAll(stockList);
        shop = new Shop("Ray's Music", stock);
        List<ISell> stockListWithoutGuitar2 = Arrays.asList(guitar1, drumSet, guitarStrings1, drumSticks);
        stockWithoutGuitar2 = new ArrayList<>();
        stockWithoutGuitar2.addAll(stockListWithoutGuitar2);
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music", shop.getName());
    }

    @Test
    public void hasStock(){
        assertEquals(5, shop.getStockSize(), 0.01);
    }

    @Test
    public void hasStockList(){
        assertEquals(stock, shop.getStock());
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitarStrings2);
        assertEquals(6, shop.getStockSize(), 0.01);
    }

    @Test
    public void canFindItemIndex(){
        assertEquals(0, shop.findItem(guitar1), 0.01);
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.removeItem(guitar2);
        assertEquals(4, shop.getStockSize(), 0.01);
    }

    @Test
    public void canRemoveItemFromStock__ArrayCheck(){
        assertEquals(stock, shop.getStock());
        shop.removeItem(guitar2);
        assertEquals(stockWithoutGuitar2, shop.getStock());
    }

    @Test
    public void canCalculateTotalPossibleProfit(){
        assertEquals(965.49, shop.getPotentialProfit(), 0.01);
    }

    @Test
    public void canCalculatePossibleProfit__AddItem(){
        shop.addStock(guitarStrings2);
        assertEquals(994.49, shop.getPotentialProfit(), 0.01);
    }

    @Test
    public void canCalculatePossibleProfit__RemoveItem(){
        shop.removeItem(guitar1);
        assertEquals(836.48, shop.getPotentialProfit(), 0.01);
    }

}
