package amedvedev.com.dto;

import lombok.Data;

@Data
public class IntegerGeneratorProperty extends BaseGeneratorProperty<Integer> {

    private boolean positive;
    private boolean negative;
    private Integer min;
    private Integer max;

    public IntegerGeneratorProperty() {
        super(Integer.class);
    }
}
