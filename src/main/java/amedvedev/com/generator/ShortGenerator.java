package amedvedev.com.generator;

import amedvedev.com.dto.ShortGeneratorProperty;

import java.util.Random;

public class ShortGenerator extends BaseGenerator<Short, ShortGeneratorProperty> {

    @Override
    public Short generate(ShortGeneratorProperty property) {
        Short result;
        Random random = new Random();
        Short min = property.getMin();
        Short max = property.getMax();

        if (max != null && min != null) {
            if (max < min) {
                Short tmp = max;
                max = min;
                min = tmp;
            }
            result = (short) (random.nextInt(max - min + 1) + min);
        } else if (min != null) {
            result = (short) (random.nextInt(Short.MAX_VALUE - min + 1) + min);
        } else if (max != null) {
            result = (short) (random.nextInt(max + 1));
        } else {
            result = (short) (random.nextInt());
        }

        if (property.isNegative()) {
            if (result >= 0) {
                result = (short) -result;
            }
        } else if (property.isPositive()) {
            if (result < 0) {
                result = (short) -result;
            }
        }

        return result;
    }
}
