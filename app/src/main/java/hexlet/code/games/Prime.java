package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeMain() {

        int count = 0;
        Cli.userName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int randomInt = Number.getRandomInt(2, 100);
        System.out.println("Question: " + randomInt);
        String answer = Prime.answer();

        while (count != 3) {
            if ((isNatural(randomInt).equals("yes") && answer.equals("yes")) || isNatural(randomInt).equals("no") && answer.equals("no")) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    randomInt = Number.getRandomInt(2, 100);
                    System.out.println("Question: " + randomInt);
                    answer = Prime.answer();
                }
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
    }

    public static String answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String input = scanner.nextLine();
        return input;
    }

    public static String isNatural(int randomInt) {
        for(int i = 2; i < randomInt / 2; i++) {
            if (randomInt % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public class Number {
        public static int getRandomInt(int min, int max) {
            Random rand = new Random();
            return rand.nextInt(max - min + 1) + min;
        }
    }
}
