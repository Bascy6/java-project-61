package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userChoise() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String input = scanner.nextLine();
        return input;
    }

    public static String userName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String input = scanner.nextLine();
        return input;
    }
}
