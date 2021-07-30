package InstrumentAccs;

import instruments.ISell;

public class DrumSticks extends InstrumentAccessory implements ISell {

    public DrumSticks(String description, Double boughtFor, Double sellingPrice) {
        super(description, boughtFor, sellingPrice);
    }

    public Double calculateMarkup(){
        return getSellingPrice() - getBoughtFor();
    }
}
