package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    private static String[][] round() {
        String[][] data = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomInt = Engine.getRandomInt(0, Engine.HUNDRED);
            data[i][0] = Integer.toString(randomInt);
            data[i][1] = randomInt % 2 == 0 ? "yes" : "no";
        }
        return data;
    }

    public static void runGame() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] data = round();
        Engine.game(data, rule);
    }
}
