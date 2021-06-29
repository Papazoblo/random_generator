package amedvedev.com.dto;

import lombok.Data;

@Data
public class ByteGeneratorProperty extends BaseGeneratorProperty<Byte> {

    private boolean positive;
    private boolean negative;
    private Byte min;
    private Byte max;

    public ByteGeneratorProperty() {
        super(Byte.class);
    }
}
