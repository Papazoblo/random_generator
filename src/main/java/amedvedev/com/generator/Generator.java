package amedvedev.com.generator;

import amedvedev.com.dto.BaseGeneratorProperty;

public interface Generator<T, PROPERTY extends BaseGeneratorProperty<T>> {

    T generate(PROPERTY property);
}
