package amedvedev.com.generator;

import amedvedev.com.dto.BaseGeneratorProperty;

public abstract class BaseGenerator<T, PROPERTY extends BaseGeneratorProperty<T>>
        implements Generator<T, PROPERTY> {

}
