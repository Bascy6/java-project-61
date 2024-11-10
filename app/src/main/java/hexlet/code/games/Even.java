package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Even {
    public static void evenMain() {

        int randomInt = (int) (Math.random() * 100);
        int count = 0;
        Cli.userName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + randomInt);
        String answer = Even.answer();

        while (count != 3) {
            if (randomInt % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    randomInt = (int) (Math.random() * 100);
                    System.out.println("Question: " + randomInt);
                    answer = Even.answer();
                }
            } else if (randomInt % 2 == 0 && !answer.equals("yes")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            } else if (randomInt % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    randomInt = (int) (Math.random() * 100);
                    System.out.println("Question: " + randomInt);
                    answer = Even.answer();
                }
            } else if (randomInt % 2 != 0 && !answer.equals("no")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
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
}
