package amedvedev.com.generator;

import amedvedev.com.dto.ByteGeneratorProperty;

import java.util.Random;

public class ByteGenerator extends BaseGenerator<Byte, ByteGeneratorProperty> {

    @Override
    public Byte generate(ByteGeneratorProperty property) {
        Byte result;
        Random random = new Random();
        Byte min = property.getMin();
        Byte max = property.getMax();

        if (max != null && min != null) {
            if (max < min) {
                Byte tmp = max;
                max = min;
                min = tmp;
            }
            result = (byte) (random.nextInt(max - min + 1) + min);
        } else if (min != null) {
            result = (byte) (random.nextInt(Byte.MAX_VALUE - min + 1) + min);
        } else if (max != null) {
            result = (byte) (random.nextInt(max + 1));
        } else {
            result = (byte) (random.nextInt());
        }

        if (property.isNegative()) {
            if (result >= 0) {
                result = (byte) -result;
            }
        } else if (property.isPositive()) {
            if (result < 0) {
                result = (byte) -result;
            }
        }

        return result;
    }
}
