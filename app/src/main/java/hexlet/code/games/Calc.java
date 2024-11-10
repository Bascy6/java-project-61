package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calcMain() {

        int first = Number.getRandomInt(9);
        int second = Number.getRandomInt(9);
        int random = Number.getRandomInt(2);

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
        int answer = Calc.answer();

        while (count != 3) {
            if (answer == solution) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + Cli.name + "!");
                } else {
                    first = Number.getRandomInt(9);
                    second = Number.getRandomInt(9);
                    random = Number.getRandomInt(2);
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
                    answer = Calc.answer();
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + solution + "'.");
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

    public class Number {
        public static int getRandomInt(int max) {
            Random rand = new Random();
            return rand.nextInt(max);
        }
    }
}
