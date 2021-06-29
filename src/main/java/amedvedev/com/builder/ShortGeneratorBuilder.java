package amedvedev.com.builder;

import amedvedev.com.dto.ShortGeneratorProperty;
import amedvedev.com.generator.ShortGenerator;
import lombok.AccessLevel;
import lombok.Getter;

public class ShortGeneratorBuilder implements GeneratorBuilder<Short> {

    @Getter(AccessLevel.PACKAGE)
    private final ShortGeneratorProperty property;
    private final ShortGenerator generator;

    public ShortGeneratorBuilder() {
        generator = new ShortGenerator();
        property = new ShortGeneratorProperty();
    }

    public ShortGeneratorBuilder min(Short min) {
        this.property.setMin((short) Math.abs(min));
        return this;
    }

    public ShortGeneratorBuilder max(Short max) {
        this.property.setMax((short) Math.abs(max));
        return this;
    }

    public ShortGeneratorBuilder positive() {
        this.property.setPositive(true);
        return this;
    }

    public ShortGeneratorBuilder negative() {
        this.property.setNegative(true);
        return this;
    }

    @Override
    public Short generate() {
        return generator.generate(property);
    }
}
