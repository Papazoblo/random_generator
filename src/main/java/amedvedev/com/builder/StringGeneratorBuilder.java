package amedvedev.com.builder;

import amedvedev.com.dto.StringGeneratorProperty;
import amedvedev.com.generator.StringGenerator;
import lombok.AccessLevel;
import lombok.Getter;

public class StringGeneratorBuilder implements GeneratorBuilder<String> {

    @Getter(AccessLevel.PACKAGE)
    private final StringGeneratorProperty property;
    private final StringGenerator generator;

    public StringGeneratorBuilder() {
        generator = new StringGenerator();
        property = new StringGeneratorProperty();
    }

    public StringGeneratorBuilder length(Integer length) {
        this.property.setLength(length);
        return this;
    }

    public StringGeneratorBuilder minLength(Integer minLength) {
        this.property.setMinLength(minLength);
        return this;
    }

    public StringGeneratorBuilder maxLength(Integer maxLength) {
        this.property.setMaxLength(maxLength);
        return this;
    }

    @Override
    public String generate() {
        return generator.generate(property);
    }
}
