package amedvedev.com.generator;

import amedvedev.com.dto.FloatGeneratorProperty;

import java.util.Random;

public class FloatGenerator extends BaseGenerator<Float, FloatGeneratorProperty> {

    @Override
    public Float generate(FloatGeneratorProperty property) {
        Float result;
        Random random = new Random();
        Float min = property.getMin();
        Float max = property.getMax();

        if (max != null && min != null) {
            if (max < min) {
                Float tmp = max;
                max = min;
                min = tmp;
            }
            result = random.nextInt((int) (max - min + 1)) + min;
        } else if (min != null) {
            result = random.nextInt((int) (Float.MAX_VALUE - min + 1)) + min;
        } else if (max != null) {
            result = (float) random.nextInt((int) (max + 1));
        } else {
            result = (float) (random.nextInt());
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
