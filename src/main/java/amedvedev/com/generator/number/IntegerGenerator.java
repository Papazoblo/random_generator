package amedvedev.com.generator.number;

import amedvedev.com.dto.number.IntegerGeneratorProperty;

import java.math.BigDecimal;

public class IntegerGenerator extends BaseNumberGenerator<Integer, IntegerGeneratorProperty> {

    @Override
    protected BigDecimal getMaxValue() {
        return BigDecimal.valueOf(Integer.MAX_VALUE);
    }

    @Override
    protected Integer convertNumber(Number number) {
        return number.intValue();
    }

    @Override
    protected Integer changeSing(boolean negative, boolean positive, Integer val) {
        if ((negative && val >= 0) || (positive && val < 0)) {
            return -val;
        }
        return val;
    }
}
