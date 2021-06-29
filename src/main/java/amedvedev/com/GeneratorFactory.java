package amedvedev.com;

import amedvedev.com.builder.ByteGeneratorBuilder;
import amedvedev.com.builder.IntegerGeneratorBuilder;
import amedvedev.com.builder.ShortGeneratorBuilder;
import amedvedev.com.builder.StringGeneratorBuilder;

public class GeneratorFactory {

    public static StringGeneratorBuilder strings() {
        return new StringGeneratorBuilder();
    }

    public static IntegerGeneratorBuilder ints() {
        return new IntegerGeneratorBuilder();
    }

    public static ShortGeneratorBuilder shorts() {
        return new ShortGeneratorBuilder();
    }

    public static ByteGeneratorBuilder bytes() {
        return new ByteGeneratorBuilder();
    }
}
