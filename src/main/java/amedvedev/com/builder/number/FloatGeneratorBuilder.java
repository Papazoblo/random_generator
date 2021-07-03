package amedvedev.com.builder.number;

import amedvedev.com.dto.number.FloatGeneratorProperty;
import amedvedev.com.generator.number.FloatGenerator;

public class FloatGeneratorBuilder extends BaseNumberGeneratorBuilder<Float, FloatGeneratorProperty> {

    public FloatGeneratorBuilder(FloatGeneratorProperty property, FloatGenerator generator) {
        super(property, generator);
    }
}
