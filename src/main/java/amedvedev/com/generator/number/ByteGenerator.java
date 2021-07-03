package amedvedev.com.generator.number;

import amedvedev.com.dto.number.ByteGeneratorProperty;

import java.math.BigDecimal;

public class ByteGenerator extends BaseNumberGenerator<Byte, ByteGeneratorProperty> {

    @Override
    protected BigDecimal getMaxValue() {
        return BigDecimal.valueOf(Byte.MAX_VALUE);
    }

    @Override
    protected Byte convertNumber(Number number) {
        return number.byteValue();
    }

    @Override
    protected Byte changeSing(boolean negative, boolean positive, Byte val) {
        if ((negative && val >= 0) || (positive && val < 0)) {
            return (byte) -val;
        }
        return val;
    }
}
