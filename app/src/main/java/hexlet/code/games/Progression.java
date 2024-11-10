package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {
    public static void progressionMain() {

        Cli.userName();
        System.out.println("What number is missing in the progression?");

        int count = 0;
        int[] array = new int[Engine.TEN];
        array[0] = Engine.getRandomInt(0, Engine.NINE);
        int step = Engine.getRandomInt(2, Engine.SIX);
        int gap = Engine.getRandomInt(1, Engine.NINE);
        for (int i = 1; i < Engine.TEN; i++) {
            array[i] = array[i - 1] + step;
        }

        System.out.print("Question: ");
        for (int j = 0; j < Engine.TEN; j++) {
            if (array[j] == array[gap]) {
                System.out.print(".. ");
            } else {
                System.out.print(array[j] + " ");
            }
        }
        int answer = Engine.answerInt();

        while (count != Engine.ROUNDS) {
            if (answer == array[gap]) {
                System.out.println("Correct!");
                count++;
                if (count == Engine.ROUNDS) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    array[0] = Engine.getRandomInt(0, Engine.NINE);
                    step = Engine.getRandomInt(2, Engine.SIX);
                    gap = Engine.getRandomInt(1, Engine.NINE);
                    for (int i = 1; i < Engine.TEN; i++) {
                        array[i] = array[i - 1] + step;
                    }
                    System.out.print("Question: ");
                    for (int j = 0; j < Engine.TEN; j++) {
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
