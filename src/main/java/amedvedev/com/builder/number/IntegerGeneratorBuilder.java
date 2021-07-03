package amedvedev.com.builder.number;

import amedvedev.com.dto.number.IntegerGeneratorProperty;
import amedvedev.com.generator.IntegerGenerator;

public class IntegerGeneratorBuilder extends BaseNumberGeneratorBuilder<Integer, IntegerGeneratorProperty> {

    public IntegerGeneratorBuilder(IntegerGeneratorProperty property, IntegerGenerator generator) {
        super(property, generator);
    }
}
