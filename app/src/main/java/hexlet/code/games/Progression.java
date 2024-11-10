package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionMain() {

        Cli.userName();
        System.out.println("What number is missing in the progression?");

        int count = 0;
        int[] array = new int[10];
        array[0] = Number.getRandomInt(0, 9);
        int step = Number.getRandomInt(2, 6);
        int gap = Number.getRandomInt(1, 9);
        for (int i = 1; i < 10; i++) {
            array[i] = array[i - 1] + step;
        }

        System.out.print("Question: ");
        for (int j = 0; j < 10; j++) {
            if (array[j] == array[gap]) {
                System.out.print(".. ");
            } else {
                System.out.print(array[j] + " ");
            }
        }
        int answer = Progression.answer();

        while (count != 3) {
            if (answer == array[gap]) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    array[0] = Number.getRandomInt(0, 9);
                    step = Number.getRandomInt(2, 6);
                    gap = Number.getRandomInt(1, 9);
                    for (int i = 1; i < 10; i++) {
                        array[i] = array[i - 1] + step;
                    }
                    System.out.print("Question: ");
                    for (int j = 0; j < 10; j++) {
                        if (array[j] == array[gap]) {
                            System.out.print(".. ");
                        } else {
                            System.out.print(array[j] + " ");
                        }
                    }
                    answer = Progression.answer();
                }
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + array[gap] + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
    }

    public static int answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nYour answer: ");
        int input = scanner.nextInt();
        return input;
    }

    public class Number {
        public static int getRandomInt(int min, int max) {
            Random rand = new Random();
            return rand.nextInt(max - min + 1) + min;
        }
    }
}
