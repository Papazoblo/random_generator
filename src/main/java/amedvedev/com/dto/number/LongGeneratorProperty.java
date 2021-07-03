package amedvedev.com.dto.number;

import lombok.Data;

@Data
public class LongGeneratorProperty extends BaseNumberGeneratorProperty<Long> {

    public LongGeneratorProperty() {
        super(Long.class);
    }
}
