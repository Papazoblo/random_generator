package amedvedev.com.builder;

import amedvedev.com.dto.FloatGeneratorProperty;
import amedvedev.com.generator.FloatGenerator;
import lombok.AccessLevel;
import lombok.Getter;

public class FloatGeneratorBuilder implements GeneratorBuilder<Float> {

    @Getter(AccessLevel.PACKAGE)
    private final FloatGeneratorProperty property;
    private final FloatGenerator generator;

    public FloatGeneratorBuilder() {
        generator = new FloatGenerator();
        property = new FloatGeneratorProperty();
    }

    public FloatGeneratorBuilder min(Float min) {
        this.property.setMin(Math.abs(min));
        return this;
    }

    public FloatGeneratorBuilder max(Float max) {
        this.property.setMax(Math.abs(max));
        return this;
    }

    public FloatGeneratorBuilder positive() {
        this.property.setPositive(true);
        return this;
    }

    public FloatGeneratorBuilder negative() {
        this.property.setNegative(true);
        return this;
    }

    @Override
    public Float generate() {
        return generator.generate(property);
    }
}
