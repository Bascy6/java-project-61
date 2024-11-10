package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    public static void primeMain() {

        int count = 0;
        Cli.userName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int randomInt = Engine.getRandomInt(2, 100);
        System.out.println("Question: " + randomInt);
        String answer = Engine.answerStr();

        while (count != 3) {
            if ((isNatural(randomInt).equals("yes") && answer.equals("yes"))
                    || isNatural(randomInt).equals("no") && answer.equals("no")) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    randomInt = Engine.getRandomInt(2, 100);
                    System.out.println("Question: " + randomInt);
                    answer = Engine.answerStr();
                }
            } else {
                if (isNatural(randomInt).equals("no") && !answer.equals("no")) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + Cli.name + "!");
                    break;
                }
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
    }

    public static String isNatural(int randomInt) {
        for (int i = 2; i < randomInt / 2; i++) {
            if (randomInt % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
