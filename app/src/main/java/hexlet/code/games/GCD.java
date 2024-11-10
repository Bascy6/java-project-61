package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    public static void gcdMain() {

        int first = Engine.getRandomInt(0, Engine.HUNDRED);
        int second = Engine.getRandomInt(0, Engine.HUNDRED);

        int count = 0;

        Cli.userName();
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + first + " " + second);
        int answer = Engine.answerInt();

        while (count != Engine.ROUNDS) {
            if (gcd(first, second) == answer) {
                System.out.println("Correct!");
                count++;
                if (count == Engine.ROUNDS) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    first = Engine.getRandomInt(0, Engine.HUNDRED);
                    second = Engine.getRandomInt(0, Engine.HUNDRED);
                    System.out.println("Question: " + first + " " + second);
                    answer = Engine.answerInt();
                }
            } else {
                System.out.println("'"
                        + answer + "'"
                        + " is wrong answer ;(. Correct answer was '"
                        + gcd(first, second)
                        + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }

    }

    public static int gcd(int first, int second) {
        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return first;
    }
}
