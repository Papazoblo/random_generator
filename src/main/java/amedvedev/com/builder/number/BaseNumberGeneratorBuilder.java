package amedvedev.com.builder.number;

import amedvedev.com.builder.GeneratorBuilder;
import amedvedev.com.dto.number.BaseNumberGeneratorProperty;
import amedvedev.com.generator.number.BaseNumberGenerator;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class BaseNumberGeneratorBuilder<T extends Number,
        PROPERTY extends BaseNumberGeneratorProperty<T>> implements GeneratorBuilder<T> {

    @Getter(AccessLevel.PACKAGE)
    protected final PROPERTY property;
    @Getter(AccessLevel.NONE)
    protected final BaseNumberGenerator<T, PROPERTY> generator;

    public BaseNumberGeneratorBuilder<T, PROPERTY> min(Integer min) {
        this.property.setMin(Math.abs(min));
        return this;
    }

    public BaseNumberGeneratorBuilder<T, PROPERTY> max(Integer max) {
        this.property.setMax(Math.abs(max));
        return this;
    }

    public BaseNumberGeneratorBuilder<T, PROPERTY> positive() {
        this.property.setPositive(true);
        return this;
    }

    public BaseNumberGeneratorBuilder<T, PROPERTY> negative() {
        this.property.setNegative(true);
        return this;
    }

    @Override
    public T generate() {
        return generator.generate(property);
    }
}
