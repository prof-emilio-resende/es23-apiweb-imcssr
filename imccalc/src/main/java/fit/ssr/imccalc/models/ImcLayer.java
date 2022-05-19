package fit.ssr.imccalc.models;

public class ImcLayer {
    private double minValue;
    private double maxValue;
    private String description;

    public ImcLayer() {
        super();
    }

    public ImcLayer(double minValue, double maxValue, String description) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.description = description;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
}
