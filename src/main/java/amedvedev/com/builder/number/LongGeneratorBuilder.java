package amedvedev.com.builder.number;

import amedvedev.com.dto.number.LongGeneratorProperty;
import amedvedev.com.generator.number.LongGenerator;

public class LongGeneratorBuilder extends BaseNumberGeneratorBuilder<Long, LongGeneratorProperty> {

    public LongGeneratorBuilder(LongGeneratorProperty property, LongGenerator generator) {
        super(property, generator);
    }
}
