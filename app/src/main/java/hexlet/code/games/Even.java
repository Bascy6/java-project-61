package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void evenMain() {

        int randomInt = Engine.getRandomInt(0, Engine.HUNDRED);
        int count = 0;
        Cli.userName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + randomInt);
        String answer = Engine.answerStr();

        while (count != Engine.ROUNDS) {
            if (randomInt % 2 == 0 && answer.equals("yes") || randomInt % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                count++;
                if (count == Engine.ROUNDS) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    randomInt = Engine.getRandomInt(0, Engine.HUNDRED);
                    System.out.println("Question: " + randomInt);
                    answer = Engine.answerStr();
                }
            } else if (randomInt % 2 == 0) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
    }
}
