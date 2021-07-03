package amedvedev.com.generator;

import amedvedev.com.dto.number.ShortGeneratorProperty;

import java.math.BigDecimal;

public class ShortGenerator extends BaseNumberGenerator<Short, ShortGeneratorProperty> {

    @Override
    protected BigDecimal getMaxValue() {
        return BigDecimal.valueOf(Short.MAX_VALUE);
    }

    @Override
    protected Short convertNumber(Number number) {
        return number.shortValue();
    }

    @Override
    protected Short changeSing(boolean negative, boolean positive, Short val) {
        if ((negative && val >= 0) || (positive && val < 0)) {
            return (short) -val;
        }
        return val;
    }
}
