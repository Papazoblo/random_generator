package amedvedev.com.builder.number;

import amedvedev.com.dto.number.ByteGeneratorProperty;
import amedvedev.com.generator.ByteGenerator;

public class ByteGeneratorBuilder extends BaseNumberGeneratorBuilder<Byte, ByteGeneratorProperty> {

    public ByteGeneratorBuilder(ByteGeneratorProperty property, ByteGenerator generator) {
        super(property, generator);
    }
}
