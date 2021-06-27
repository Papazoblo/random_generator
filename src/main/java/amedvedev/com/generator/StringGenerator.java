package amedvedev.com.generator;

import amedvedev.com.dto.StringGeneratorProperty;

import java.util.Random;

import static amedvedev.com.util.StringUtils.generateStringWithLength;

public class StringGenerator extends BaseGenerator<String, StringGeneratorProperty> {

    private static final Integer MAX_LENGTH = 1000;
    private static final Integer MIN_LENGTH = 1;

    @Override
    public String generate(StringGeneratorProperty property) {
        String result;
        if (property.getLength() != null) {
            result = generateStringWithLength(property.getLength());
        } else {
            Random random = new Random();
            if (property.getMinLength() != null && property.getMaxLength() != null) {
                result = generateStringWithLength(random.nextInt(property.getMaxLength() - property.getMinLength())
                        + property.getMinLength());
            } else if (property.getMinLength() != null) {
                result = generateStringWithLength(random.nextInt(MAX_LENGTH - property.getMinLength())
                        + property.getMinLength());
            } else if (property.getMaxLength() != null) {
                result = generateStringWithLength(random.nextInt(property.getMaxLength() - MIN_LENGTH) + MIN_LENGTH);
            } else {
                result = generateStringWithLength(random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            }
        }
        return result;
    }
}
