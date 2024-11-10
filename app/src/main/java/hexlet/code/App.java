package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String game = scanner.nextLine();

        switch (game) {
            case "1":
                Cli.userName();
                break;
            case "2":
                Even.evenMain();
                break;
            case "3":
                Calc.calcMain();
                break;
            case "4":
                GCD.gcdMain();
                break;
            case "5":
                Progression.progressionMain();
                break;
            default:
                break;
        }
    }
}
