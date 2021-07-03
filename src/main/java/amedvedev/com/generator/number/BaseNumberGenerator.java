package amedvedev.com.generator.number;

import amedvedev.com.dto.number.BaseNumberGeneratorProperty;
import amedvedev.com.generator.BaseGenerator;

import java.math.BigDecimal;
import java.util.Random;

public abstract class BaseNumberGenerator<T extends Number, PROPERTY extends BaseNumberGeneratorProperty<T>>
        extends BaseGenerator<T, PROPERTY> {

    @Override
    public T generate(PROPERTY property) {
        Number result;
        Random random = new Random();
        Integer min = property.getMin();
        Integer max = property.getMax();
        BigDecimal maxOfType = getMaxValue();

        if (max != null && min != null) {
            if (max < min) {
                Integer tmp = max;
                max = min;
                min = tmp;
            }
            result = random.nextInt(max - min + 1) + min;
        } else if (min != null) {
            result = random.nextInt(maxOfType.intValue() - min + 1) + min;
        } else if (max != null) {
            if (maxOfType.compareTo(BigDecimal.valueOf(max)) < 0) {
                max = maxOfType.intValue();
            }
            result = random.nextInt(max + 1);
        } else {
            result = random.nextInt();
        }

        return changeSing(property.isNegative(), property.isPositive(), convertNumber(result));
    }

    protected abstract BigDecimal getMaxValue();

    protected abstract T convertNumber(Number number);

    protected abstract T changeSing(boolean negative, boolean positive, T val);
}
