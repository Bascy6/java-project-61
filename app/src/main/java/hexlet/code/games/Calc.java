package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Calc {
    private static String[][] round() {
        String[][] data = new String[Utils.ROUNDS][Utils.ROUNDS];
        for (int i = 0; i < Utils.ROUNDS; i++) {
            int firstNumber = Utils.getRandomInt(0, Utils.NINE);
            int secondNumber = Utils.getRandomInt(0, Utils.NINE);
            char operation = getOperation();
            data[i][0] = Integer.toString(firstNumber) + " " + operation + " " + Integer.toString(secondNumber);
            data[i][1] = Integer.toString(calculator(firstNumber, secondNumber, operation));
        }
        return data;
    }

    public static void runGame() {
        String rule = "What is the result of the expression?";
        String[][] data = round();
        Engine.game(data, rule);
    }

    public static char getOperation() {
        char[] operation = {'+', '-', '*'};
        Random rand = new Random();
        return operation[rand.nextInt(operation.length)];
    }

    public static int calculator(int firstNumber, int secondNumber, char operation) {
        int sum = 0;
        switch (operation) {
            case '+':
                sum = firstNumber + secondNumber;
                break;
            case '-':
                sum = firstNumber - secondNumber;
                break;
            case '*':
                sum = firstNumber * secondNumber;
                break;
            default:
                break;
        }
        return sum;
    }
}
