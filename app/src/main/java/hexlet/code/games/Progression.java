package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static String[][] round() {
        String[][] data = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int step = Engine.getRandomInt(2, Engine.SIX);
            int gap = Engine.getRandomInt(1, Engine.NINE);
            int[] array = new int[Engine.TEN];
            array[0] = Engine.getRandomInt(0, Engine.NINE);
            for (int k = 1; k < Engine.TEN; k++) {
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
        String[] numbers = new String[Engine.TEN];
        for (int j = 0; j < Engine.TEN; j++) {
            if (array[j] == array[gap]) {
                numbers[j] = "..";
            } else {
                numbers[j] = Integer.toString(array[j]);
            }
        }
        return numbers;
    }
}
