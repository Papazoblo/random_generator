package amedvedev.com.builder.number;

import amedvedev.com.dto.number.DoubleGeneratorProperty;
import amedvedev.com.generator.DoubleGenerator;

public class DoubleGeneratorBuilder extends BaseNumberGeneratorBuilder<Double, DoubleGeneratorProperty> {

    public DoubleGeneratorBuilder(DoubleGeneratorProperty property, DoubleGenerator generator) {
        super(property, generator);
    }
}
