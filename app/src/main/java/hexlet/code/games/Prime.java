package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    private static String[][] round() {
        String[][] data = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomInt = Engine.getRandomInt(2, Engine.HUNDRED);
            data[i][0] = Integer.toString(randomInt);
            data[i][1] = isNatural(randomInt) ? "yes" : "no";
        }
        return data;
    }

    public static void runGame() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] data = round();
        Engine.game(data, rule);
    }

    public static boolean isNatural(int randomInt) {
        for (int i = 2; i < randomInt / 2; i++) {
            if (randomInt % i == 0) {
                return false;
            }
        }
        return true;
    }
}
