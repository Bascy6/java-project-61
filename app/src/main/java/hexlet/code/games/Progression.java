package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static String[][] round() {
        String[][] data = new String[Utils.ROUNDS][Utils.ROUNDS];
        for (int i = 0; i < Utils.ROUNDS; i++) {
            int step = Utils.getRandomInt(2, Utils.SIX);
            int gap = Utils.getRandomInt(1, Utils.NINE);
            int[] array = new int[Utils.TEN];
            array[0] = Utils.getRandomInt(0, Utils.NINE);
            for (int k = 1; k < Utils.TEN; k++) {
                array[k] = array[k - 1] + step;
            }
            data[i][0] = String.join(" ", question(array, gap));
            data[i][1] = Integer.toString(array[gap]);
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
            if (array[j] == array[gap]) {
                numbers[j] = "..";
            } else {
                numbers[j] = Integer.toString(array[j]);
            }
        }
        return numbers;
    }
}
