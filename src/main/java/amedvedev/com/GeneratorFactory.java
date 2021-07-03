package amedvedev.com;

import amedvedev.com.builder.StringGeneratorBuilder;
import amedvedev.com.builder.number.*;
import amedvedev.com.dto.number.*;
import amedvedev.com.generator.number.*;

public class GeneratorFactory {

    public static StringGeneratorBuilder strings() {
        return new StringGeneratorBuilder();
    }

    public static IntegerGeneratorBuilder ints() {
        return new IntegerGeneratorBuilder(new IntegerGeneratorProperty(), new IntegerGenerator());
    }

    public static ShortGeneratorBuilder shorts() {
        return new ShortGeneratorBuilder(new ShortGeneratorProperty(), new ShortGenerator());
    }

    public static ByteGeneratorBuilder bytes() {
        return new ByteGeneratorBuilder(new ByteGeneratorProperty(), new ByteGenerator());
    }

    public static LongGeneratorBuilder longs() {
        return new LongGeneratorBuilder(new LongGeneratorProperty(), new LongGenerator());
    }

    public static DoubleGeneratorBuilder doubles() {
        return new DoubleGeneratorBuilder(new DoubleGeneratorProperty(), new DoubleGenerator());
    }

    public static FloatGeneratorBuilder floats() {
        return new FloatGeneratorBuilder(new FloatGeneratorProperty(), new FloatGenerator());
    }
}
