package amedvedev.com.dto;

import lombok.Data;

@Data
public class DoubleGeneratorProperty extends BaseGeneratorProperty<Double> {

    private boolean positive;
    private boolean negative;
    private Double min;
    private Double max;

    public DoubleGeneratorProperty() {
        super(Double.class);
    }
}
