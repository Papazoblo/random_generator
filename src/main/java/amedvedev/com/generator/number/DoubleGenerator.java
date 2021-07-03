package amedvedev.com.generator.number;

import amedvedev.com.dto.number.DoubleGeneratorProperty;

import java.math.BigDecimal;

public class DoubleGenerator extends BaseNumberGenerator<Double, DoubleGeneratorProperty> {

    @Override
    protected BigDecimal getMaxValue() {
        return BigDecimal.valueOf(Integer.MAX_VALUE);
    }

    @Override
    protected Double convertNumber(Number number) {
        return number.doubleValue();
    }

    @Override
    protected Double changeSing(boolean negative, boolean positive, Double val) {
        if ((negative && val >= 0) || (positive && val < 0)) {
            return -val;
        }
        return val;
    }
}
