package instruments;

public class Instrument {

    private String make;
    private String colour;
    private InstrumentType type;
    private Double boughtFor;
    private Double sellingPrice;

    public Instrument(String make, String colour, InstrumentType type, Double boughtFor, Double sellingPrice) {
        this.make = make;
        this.colour = colour;
        this.type = type;
        this.boughtFor = boughtFor;
        this.sellingPrice = sellingPrice;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public Double getBoughtFor() {
        return boughtFor;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setBoughtFor(Double boughtFor) {
        this.boughtFor = boughtFor;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
