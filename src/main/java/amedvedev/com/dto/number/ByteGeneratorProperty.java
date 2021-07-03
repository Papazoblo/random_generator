package amedvedev.com.dto.number;

import lombok.Data;

@Data
public class ByteGeneratorProperty extends BaseNumberGeneratorProperty<Byte> {

    public ByteGeneratorProperty() {
        super(Byte.class);
    }
}
