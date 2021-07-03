package amedvedev.com.dto.number;

import lombok.Data;

@Data
public class FloatGeneratorProperty extends BaseNumberGeneratorProperty<Float> {

    public FloatGeneratorProperty() {
        super(Float.class);
    }
}
