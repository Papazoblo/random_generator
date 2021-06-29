package amedvedev.com.dto;

import lombok.Data;

@Data
public class ShortGeneratorProperty extends BaseGeneratorProperty<Short> {

    private boolean positive;
    private boolean negative;
    private Short min;
    private Short max;

    public ShortGeneratorProperty() {
        super(Short.class);
    }
}
