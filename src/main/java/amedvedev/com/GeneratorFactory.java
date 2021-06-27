package amedvedev.com;

import amedvedev.com.builder.IntegerGeneratorBuilder;
import amedvedev.com.builder.StringGeneratorBuilder;

public class GeneratorFactory {

    public static StringGeneratorBuilder strings() {
        return new StringGeneratorBuilder();
    }

    public static IntegerGeneratorBuilder ints() {
        return new IntegerGeneratorBuilder();
    }
}
