package amedvedev.com.builder;

import amedvedev.com.dto.LongGeneratorProperty;
import amedvedev.com.generator.LongGenerator;
import lombok.AccessLevel;
import lombok.Getter;

public class LongGeneratorBuilder implements GeneratorBuilder<Long> {

    @Getter(AccessLevel.PACKAGE)
    private final LongGeneratorProperty property;
    private final LongGenerator generator;

    public LongGeneratorBuilder() {
        generator = new LongGenerator();
        property = new LongGeneratorProperty();
    }

    public LongGeneratorBuilder min(Long min) {
        this.property.setMin(Math.abs(min));
        return this;
    }

    public LongGeneratorBuilder max(Long max) {
        this.property.setMax(Math.abs(max));
        return this;
    }

    public LongGeneratorBuilder positive() {
        this.property.setPositive(true);
        return this;
    }

    public LongGeneratorBuilder negative() {
        this.property.setNegative(true);
        return this;
    }

    @Override
    public Long generate() {
        return generator.generate(property);
    }
}
