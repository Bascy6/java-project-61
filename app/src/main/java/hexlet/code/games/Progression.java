package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static String[][] round() {
        String[][] data = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int step = Utils.getRandomInt(2, Utils.SIX);
            int gap = Utils.getRandomInt(1, Utils.NINE);
            int size = Utils.TEN;
            int first = Utils.getRandomInt(0, Utils.NINE);
            data[i][0] = String.join(" ", question(progression(step, size, first), gap));
            data[i][1] = Integer.toString(progression(step, size, first)[gap]);
        }
        return data;
    }

    public static void runGame() {
        String rule = "What number is missing in the progression?";
        String[][] data = round();
        Engine.game(data, rule);
    }

    public static String[] question(int[] array, int gap) {
        String[] numbers = new String[Utils.TEN];
        for (int j = 0; j < Utils.TEN; j++) {
            numbers[j] = Integer.toString(array[j]);
        }
        numbers[gap] = "..";
        return numbers;
    }

    public static int[] progression(int step, int size, int first) {
        int[] array = new int[size];
        array[0] = first;
        for (int i = 1; i < size; i++) {
            array[i] = array[i - 1] + step;
        }
        return array;
    }
}
