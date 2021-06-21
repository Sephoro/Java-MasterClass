package za.co.besolutions;

public class Entry {

    private String name;
    private String type;
    private double estimateAmount;
    private double actualAmount;
    private double variance;

    public Entry(){
        this("Entry", "not set", 0.0d, 0.0d);
    }
    public Entry(String name, String type, double estimateAmount, double actualAmount){

        this.name = name;
        this.type = type;
        this.actualAmount = actualAmount;
        this.estimateAmount = estimateAmount;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEstimateAmount() {
        return estimateAmount;
    }

    public void setEstimateAmount(double estimateAmount) {
        this.estimateAmount = estimateAmount;
    }

    public double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public double getVariance() {
        return variance;
    }

    public void setVariance(double variance) {
        this.variance = variance;
    }


}
