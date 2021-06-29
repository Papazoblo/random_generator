package amedvedev.com.dto;

import lombok.Data;

@Data
public class LongGeneratorProperty extends BaseGeneratorProperty<Long> {

    private boolean positive;
    private boolean negative;
    private Long min;
    private Long max;

    public LongGeneratorProperty() {
        super(Long.class);
    }
}
