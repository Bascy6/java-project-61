package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int HUNDRED = 100;
    public static final int ROUNDS = 3;
    public static final int SIX = 6;
    public static final int NINE = 9;
    public static final int TEN = 10;
    private static String name;

    public static void game(String[][] data, String rule) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rule);

        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + data[i][0]);
            System.out.print("Your answer: ");
            String result = scanner.nextLine();
            if (!result.equals(data[i][1])) {
                System.out.println("'" + result + "' is wrong answer ;(. Correct answer was '" + data[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }

    public static void great() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
