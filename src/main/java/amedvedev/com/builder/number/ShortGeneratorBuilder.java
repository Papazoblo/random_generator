package amedvedev.com.builder.number;

import amedvedev.com.dto.number.ShortGeneratorProperty;
import amedvedev.com.generator.number.ShortGenerator;

public class ShortGeneratorBuilder extends BaseNumberGeneratorBuilder<Short, ShortGeneratorProperty> {

    public ShortGeneratorBuilder(ShortGeneratorProperty property, ShortGenerator generator) {
        super(property, generator);
    }
}
