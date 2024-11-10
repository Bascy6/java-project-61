package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    public static void calcMain() {

        int first = Engine.getRandomInt(0, 9);
        int second = Engine.getRandomInt(0, 9);
        int random = Engine.getRandomInt(0, 2);

        int count = 0;
        int solution;
        String operation;

        if (random == 0) {
            operation = " + ";
            solution = first + second;
        } else if (random == 1) {
            operation = " - ";
            solution = first - second;
        } else {
            operation = " * ";
            solution = first * second;
        }

        Cli.userName();
        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + first + operation + second);
        int answer = Engine.answerInt();

        while (count != 3) {
            if (answer == solution) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    first = Engine.getRandomInt(0, 9);
                    second = Engine.getRandomInt(0, 9);
                    random = Engine.getRandomInt(0, 2);
                    if (random == 0) {
                        operation = " + ";
                        solution = first + second;
                    } else if (random == 1) {
                        operation = " - ";
                        solution = first - second;
                    } else {
                        operation = " * ";
                        solution = first * second;
                    }
                    System.out.println("Question: " + first + operation + second);
                    answer = Engine.answerInt();
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + solution + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
    }
}
