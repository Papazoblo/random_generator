package amedvedev.com.builder;

import amedvedev.com.dto.ByteGeneratorProperty;
import amedvedev.com.generator.ByteGenerator;
import lombok.AccessLevel;
import lombok.Getter;

public class ByteGeneratorBuilder implements GeneratorBuilder<Byte> {

    @Getter(AccessLevel.PACKAGE)
    private final ByteGeneratorProperty property;
    private final ByteGenerator generator;

    public ByteGeneratorBuilder() {
        generator = new ByteGenerator();
        property = new ByteGeneratorProperty();
    }

    public ByteGeneratorBuilder min(Byte min) {
        this.property.setMin((byte) Math.abs(min));
        return this;
    }

    public ByteGeneratorBuilder max(Byte max) {
        this.property.setMax((byte) Math.abs(max));
        return this;
    }

    public ByteGeneratorBuilder positive() {
        this.property.setPositive(true);
        return this;
    }

    public ByteGeneratorBuilder negative() {
        this.property.setNegative(true);
        return this;
    }

    @Override
    public Byte generate() {
        return generator.generate(property);
    }
}
