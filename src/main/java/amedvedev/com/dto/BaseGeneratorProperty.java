package amedvedev.com.dto;

public abstract class BaseGeneratorProperty<T> implements GeneratorProperty<T> {

    private final Class<T> type;

    protected BaseGeneratorProperty(Class<T> type) {
        this.type = type;
    }

    public Class<T> getClassType() {
        return type;
    }

    ;
}
