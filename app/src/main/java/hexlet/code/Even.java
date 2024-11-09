package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenMain() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int randomInt = (int) (Math.random() * 100);
        System.out.println("Question: " + randomInt);
        String even = Even.choiceEven();
        int count = 0;
        while (count != 3) {
            // если число четное
            if (randomInt % 2 == 0 && even.equals("yes")) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + App.name + "!");
                } else {
                    randomInt = (int) (Math.random() * 100);
                    System.out.println("Question: " + randomInt);
                    even = Even.choiceEven();
                }
            } else if (randomInt % 2 == 0 && !even.equals("yes")) {
                // неверный ответ при четном числе
                System.out.println(even + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + App.name + "!");
                break;
                // если чесно нечетное
            } else if (randomInt % 2 != 0 && even.equals("no")) {
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + App.name + "!");
                } else {
                    randomInt = (int) (Math.random() * 100);
                    System.out.println("Question: " + randomInt);
                    even = Even.choiceEven();
                }
            } else if (randomInt % 2 != 0 && !even.equals("no")) {
                System.out.println(even + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + App.name + "!");
                break;
            }
        }
    }

    public static String choiceEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String input = scanner.nextLine();
        return input;
    }
}
