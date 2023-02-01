package Util;

import java.util.Random;

public class IDUtil {
    public static String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_@#$%^&*".split("");

    public static String generateId() {
        return IDUtil.generateId(8);
    }
    public static String generateId(int length) {
        Random randomAlphabetAccessor = new Random();
        String id = "";
        for(int i = 0; i < length; i++) {
            int randomIndex = randomAlphabetAccessor.nextInt(alphabet.length);
            id += alphabet[randomIndex];
        }
        return id;
    }
}
