package amedvedev.com.generator;

import amedvedev.com.dto.DoubleGeneratorProperty;

import java.util.Random;

public class DoubleGenerator extends BaseGenerator<Double, DoubleGeneratorProperty> {

    @Override
    public Double generate(DoubleGeneratorProperty property) {
        Double result;
        Random random = new Random();
        Double min = property.getMin();
        Double max = property.getMax();

        if (max != null && min != null) {
            if (max < min) {
                Double tmp = max;
                max = min;
                min = tmp;
            }
            result = random.nextInt((int) (max - min + 1)) + min;
        } else if (min != null) {
            result = random.nextInt((int) (Double.MAX_VALUE - min + 1)) + min;
        } else if (max != null) {
            result = (double) random.nextInt((int) (max + 1));
        } else {
            result = (double) (random.nextInt());
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
