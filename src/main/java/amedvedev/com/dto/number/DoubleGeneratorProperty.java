package amedvedev.com.dto.number;

import lombok.Data;

@Data
public class DoubleGeneratorProperty extends BaseNumberGeneratorProperty<Double> {

    public DoubleGeneratorProperty() {
        super(Double.class);
    }
}
