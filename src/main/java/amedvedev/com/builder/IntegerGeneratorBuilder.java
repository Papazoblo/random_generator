package amedvedev.com.builder;

import amedvedev.com.dto.IntegerGeneratorProperty;
import amedvedev.com.generator.IntegerGenerator;
import lombok.AccessLevel;
import lombok.Getter;

public class IntegerGeneratorBuilder implements GeneratorBuilder<Integer> {

    @Getter(AccessLevel.PACKAGE)
    private final IntegerGeneratorProperty property;
    private final IntegerGenerator generator;

    public IntegerGeneratorBuilder() {
        generator = new IntegerGenerator();
        property = new IntegerGeneratorProperty();
    }

    public IntegerGeneratorBuilder min(Integer min) {
        this.property.setMin(Math.abs(min));
        return this;
    }

    public IntegerGeneratorBuilder max(Integer max) {
        this.property.setMax(Math.abs(max));
        return this;
    }

    public IntegerGeneratorBuilder positive() {
        this.property.setPositive(true);
        return this;
    }

    public IntegerGeneratorBuilder negative() {
        this.property.setNegative(true);
        return this;
    }

    @Override
    public Integer generate() {
        return generator.generate(property);
    }
}
