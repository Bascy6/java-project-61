package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static String[][] round() {
        String[][] data = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomInt(0, Utils.HUNDRED);
            int secondNumber = Utils.getRandomInt(0, Utils.HUNDRED);
            data[i][0] = firstNumber + " " + secondNumber;
            data[i][1] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        return data;
    }

    public static void runGame() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] data = round();
        Engine.game(data, rule);
    }

    public static int gcd(int firstNumber, int secondNumber) {
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        return firstNumber;
    }
}
