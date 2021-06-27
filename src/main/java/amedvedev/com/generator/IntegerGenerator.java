package amedvedev.com.generator;

import amedvedev.com.dto.IntegerGeneratorProperty;

import java.util.Random;

public class IntegerGenerator extends BaseGenerator<Integer, IntegerGeneratorProperty> {

    @Override
    public Integer generate(IntegerGeneratorProperty property) {
        Integer result;
        Random random = new Random();
        Integer min = property.getMin();
        Integer max = property.getMax();

        if (max != null && min != null) {
            if (max < min) {
                Integer tmp = max;
                max = min;
                min = tmp;
            }
            result = random.nextInt(max - min + 1) + min;
        } else if (min != null) {
            result = random.nextInt(Integer.MAX_VALUE - min + 1) + min;
        } else if (max != null) {
            result = random.nextInt(max + 1);
        } else {
            result = random.nextInt();
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
