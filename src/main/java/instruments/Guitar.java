package instruments;

public class Guitar extends Instrument implements IPlay{

    private Integer numberOfStrings;

    public Guitar(String make, String colour, InstrumentType type, Double boughtFor, Double sellingPrice, Integer numberOfStrings) {
        super(make, colour, type, boughtFor, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Wonderwall";
    }
}
