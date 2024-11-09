package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void calcMain() {

        int first = (int) (Math.random() * 10);
        int second = (int) (Math.random() * 10);
        int random = (int) (Math.random() * 3);

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

        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + first + operation + second);
        int calc = Calc.answer();

        while (count != 3) {
            if (calc == solution) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + App.name + "!");
                } else {
                    first = (int) (Math.random() * 10);
                    second = (int) (Math.random() * 10);
                    random = (int) (Math.random() * 3);
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
                    calc = Calc.answer();
                }
            } else {
                System.out.println("'" + calc + "' is wrong answer ;(. Correct answer was '" + solution + "'.");
                System.out.println("Let's try again, " + App.name + "!");
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
}
