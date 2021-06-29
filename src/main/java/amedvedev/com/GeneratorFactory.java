package amedvedev.com;

import amedvedev.com.builder.*;

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

    public static LongGeneratorBuilder longs() {
        return new LongGeneratorBuilder();
    }
}
