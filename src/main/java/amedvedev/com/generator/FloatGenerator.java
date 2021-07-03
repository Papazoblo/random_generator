package amedvedev.com.generator;

import amedvedev.com.dto.number.FloatGeneratorProperty;

import java.math.BigDecimal;

public class FloatGenerator extends BaseNumberGenerator<Float, FloatGeneratorProperty> {

    @Override
    protected BigDecimal getMaxValue() {
        return BigDecimal.valueOf(Integer.MAX_VALUE);
    }

    @Override
    protected Float convertNumber(Number number) {
        return number.floatValue();
    }

    @Override
    protected Float changeSing(boolean negative, boolean positive, Float val) {
        if ((negative && val >= 0) || (positive && val < 0)) {
            return -val;
        }
        return val;
    }
}
