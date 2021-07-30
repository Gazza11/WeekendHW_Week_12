package InstrumentAccs;

import instruments.ISell;

public class GuitarStrings extends InstrumentAccessory implements ISell {

    public GuitarStrings(String description, Double boughtFor, Double sellingPrice) {
        super(description, boughtFor, sellingPrice);
    }

    public Double calculateMarkup(){
        return getSellingPrice() - getBoughtFor();
    }
}
