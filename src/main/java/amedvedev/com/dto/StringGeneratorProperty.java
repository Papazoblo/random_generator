package amedvedev.com.dto;

import lombok.Data;

@Data
public class StringGeneratorProperty extends BaseGeneratorProperty<String> {

    private Integer length;
    private Integer minLength;
    private Integer maxLength;

    public StringGeneratorProperty() {
        super(String.class);
    }
}
