package amedvedev.com.dto.number;

import amedvedev.com.dto.BaseGeneratorProperty;
import lombok.Data;

@Data
public abstract class BaseNumberGeneratorProperty<T extends Number> extends BaseGeneratorProperty<T> {

    protected boolean positive;
    protected boolean negative;
    protected Integer min;
    protected Integer max;

    public BaseNumberGeneratorProperty(Class<T> clazz) {
        super(clazz);
    }
}
