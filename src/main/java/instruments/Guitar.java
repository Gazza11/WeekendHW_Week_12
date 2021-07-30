package instruments;

public class Guitar extends Instrument{

    private Integer numberOfStrings;

    public Guitar(String make, String colour, InstrumentType type, Double boughtFor, Double sellingPrice, Integer numberOfStrings) {
        super(make, colour, type, boughtFor, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }
}
