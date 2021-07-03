package amedvedev.com.generator;

import amedvedev.com.dto.number.LongGeneratorProperty;

import java.math.BigDecimal;

public class LongGenerator extends BaseNumberGenerator<Long, LongGeneratorProperty> {

    @Override
    protected BigDecimal getMaxValue() {
        return BigDecimal.valueOf(Integer.MAX_VALUE);
    }

    @Override
    protected Long convertNumber(Number number) {
        return number.longValue();
    }

    @Override
    protected Long changeSing(boolean negative, boolean positive, Long val) {
        if ((negative && val >= 0) || (positive && val < 0)) {
            return -val;
        }
        return val;
    }
}
