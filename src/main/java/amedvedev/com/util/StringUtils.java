package amedvedev.com.util;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class StringUtils {

    private final static String symbols = "qwertyuiopasdfghjklzxcvbnm QWERTYUIOPASDFGHJKLZXCVBNM!№;%:?*()_+,./";

    public static String generateStringWithLength(Integer length) {
        StringBuilder sb = new StringBuilder();
        char[] symbolArray = symbols.toCharArray();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(symbolArray[random.nextInt(symbols.length() + 1)]);
        }
        return sb.toString();
    }
}
