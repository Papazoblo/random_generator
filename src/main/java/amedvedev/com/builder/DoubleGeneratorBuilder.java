package amedvedev.com.builder;

import amedvedev.com.dto.DoubleGeneratorProperty;
import amedvedev.com.generator.DoubleGenerator;
import lombok.AccessLevel;
import lombok.Getter;

public class DoubleGeneratorBuilder implements GeneratorBuilder<Double> {

    @Getter(AccessLevel.PACKAGE)
    private final DoubleGeneratorProperty property;
    private final DoubleGenerator generator;

    public DoubleGeneratorBuilder() {
        generator = new DoubleGenerator();
        property = new DoubleGeneratorProperty();
    }

    public DoubleGeneratorBuilder min(Double min) {
        this.property.setMin(Math.abs(min));
        return this;
    }

    public DoubleGeneratorBuilder max(Double max) {
        this.property.setMax(Math.abs(max));
        return this;
    }

    public DoubleGeneratorBuilder positive() {
        this.property.setPositive(true);
        return this;
    }

    public DoubleGeneratorBuilder negative() {
        this.property.setNegative(true);
        return this;
    }

    @Override
    public Double generate() {
        return generator.generate(property);
    }
}
