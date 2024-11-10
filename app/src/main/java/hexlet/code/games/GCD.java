package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gcdMain() {

        int first = Number.getRandomInt(99);
        int second = Number.getRandomInt(99);

        int count = 0;

        Cli.userName();
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + first + " " + second);
        int answer = GCD.answer();

        while (count != 3) {
            if (gcd(first, second) == answer) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    first = Number.getRandomInt(99);
                    second = Number.getRandomInt(99);
                    System.out.println("Question: " + first + " " + second);
                    answer = GCD.answer();
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

    public static int answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        int input = scanner.nextInt();
        return input;
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

    public class Number {
        public static int getRandomInt(int max) {
            Random rand = new Random();
            return rand.nextInt(max);
        }
    }
}
