package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int HUNDRED = 100;
    public static final int SIX = 6;
    public static final int NINE = 9;
    public static final int TEN = 10;

    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
