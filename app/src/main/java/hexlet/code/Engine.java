package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int HUNDRED = 100;
    public static final int ROUNDS = 3;
    public static final int SIX = 6;
    public static final int NINE = 9;
    public static final int TEN = 10;

    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static String answerStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        return scanner.nextLine();
    }
    public static int answerInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        return scanner.nextInt();
    }
}
