package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name;
    public static final int ROUNDS = 3;

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
}
