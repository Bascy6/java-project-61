package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {
    public static void progressionMain() {

        Cli.userName();
        System.out.println("What number is missing in the progression?");

        int count = 0;
        int[] array = new int[10];
        array[0] = Engine.getRandomInt(0, 9);
        int step = Engine.getRandomInt(2, 6);
        int gap = Engine.getRandomInt(1, 9);
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
        int answer = Engine.answerInt();

        while (count != 3) {
            if (answer == array[gap]) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    array[0] = Engine.getRandomInt(0, 9);
                    step = Engine.getRandomInt(2, 6);
                    gap = Engine.getRandomInt(1, 9);
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
                    answer = Engine.answerInt();
                }
            } else {
                System.out.println("'"
                        + answer + "'"
                        + " is wrong answer ;(. Correct answer was '"
                        + array[gap]
                        + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
    }
}
