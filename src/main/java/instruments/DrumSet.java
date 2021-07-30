package instruments;

public class DrumSet extends Instrument implements IPlay{

    private Integer numberOfDrums;
    private Integer numberOfCymbals;

    public DrumSet(String make, String colour, InstrumentType type, Double boughtFor, Double sellingPrice, Integer numberOfDrums, Integer numberOfCymbals) {
        super(make, colour, type, boughtFor, sellingPrice);
        this.numberOfDrums = numberOfDrums;
        this.numberOfCymbals = numberOfCymbals;
    }

    public Integer getNumberOfDrums() {
        return numberOfDrums;
    }

    public Integer getNumberOfCymbals() {
        return numberOfCymbals;
    }

    public void setNumberOfDrums(Integer numberOfDrums) {
        this.numberOfDrums = numberOfDrums;
    }

    public void setNumberOfCymbals(Integer numberOfCymbals) {
        this.numberOfCymbals = numberOfCymbals;
    }

    public String play(){
        return "Seven Nation Army";
    }
}
