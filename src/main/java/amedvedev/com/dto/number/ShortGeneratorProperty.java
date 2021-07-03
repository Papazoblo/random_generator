package amedvedev.com.dto.number;

import lombok.Data;

@Data
public class ShortGeneratorProperty extends BaseNumberGeneratorProperty<Short> {

    public ShortGeneratorProperty() {
        super(Short.class);
    }
}
