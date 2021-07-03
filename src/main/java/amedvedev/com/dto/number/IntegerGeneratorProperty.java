package amedvedev.com.dto.number;

import lombok.Data;

@Data
public class IntegerGeneratorProperty extends BaseNumberGeneratorProperty<Integer> {

    public IntegerGeneratorProperty() {
        super(Integer.class);
    }
}
