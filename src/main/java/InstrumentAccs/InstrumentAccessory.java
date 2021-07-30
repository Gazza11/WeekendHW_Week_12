package InstrumentAccs;

public abstract class InstrumentAccessory {

    private String description;
    private Double boughtFor;
    private Double sellingPrice;

    public InstrumentAccessory(String description, Double boughtFor, Double sellingPrice) {
        this.description = description;
        this.boughtFor = boughtFor;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public Double getBoughtFor() {
        return boughtFor;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }
}
