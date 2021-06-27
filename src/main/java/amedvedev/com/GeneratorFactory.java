package amedvedev.com;

import amedvedev.com.builder.StringGeneratorBuilder;

public class GeneratorFactory {

    public static StringGeneratorBuilder strings() {
        return new StringGeneratorBuilder();
    }
}
