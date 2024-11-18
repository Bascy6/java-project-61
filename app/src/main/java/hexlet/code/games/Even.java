package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static String[][] round() {
        String[][] data = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomInt = Utils.getRandomInt(0, Utils.HUNDRED);
            data[i][0] = Integer.toString(randomInt);
            data[i][1] = evenOrNot(randomInt) ? "yes" : "no";
        }
        return data;
    }

    public static boolean evenOrNot(int number) {
        return number % 2 == 0;
    }

    public static void runGame() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] data = round();
        Engine.game(data, rule);
    }
}
