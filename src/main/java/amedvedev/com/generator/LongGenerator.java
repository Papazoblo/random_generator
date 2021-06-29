package amedvedev.com.generator;

import amedvedev.com.dto.LongGeneratorProperty;

import java.util.Random;

public class LongGenerator extends BaseGenerator<Long, LongGeneratorProperty> {

    @Override
    public Long generate(LongGeneratorProperty property) {
        Long result;
        Random random = new Random();
        Long min = property.getMin();
        Long max = property.getMax();

        if (max != null && min != null) {
            if (max < min) {
                Long tmp = max;
                max = min;
                min = tmp;
            }
            result = random.nextInt((int) (max - min + 1)) + min;
        } else if (min != null) {
            result = random.nextInt((int) (Integer.MAX_VALUE - min + 1)) + min;
        } else if (max != null) {
            result = (long) random.nextInt((int) (max + 1));
        } else {
            result = (long) (random.nextInt());
        }

        if (property.isNegative()) {
            if (result >= 0) {
                result = -result;
            }
        } else if (property.isPositive()) {
            if (result < 0) {
                result = -result;
            }
        }

        return result;
    }
}
