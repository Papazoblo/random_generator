package amedvedev.com.dto;

import lombok.Data;

@Data
public class FloatGeneratorProperty extends BaseGeneratorProperty<Float> {

    private boolean positive;
    private boolean negative;
    private Float min;
    private Float max;

    public FloatGeneratorProperty() {
        super(Float.class);
    }
}
