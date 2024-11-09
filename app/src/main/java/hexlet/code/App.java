package hexlet.code;

public class App {
    public static String name;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        String choice = Cli.userChoise();
        System.out.println("\nWelcome to the Brain Games!");
        name = Cli.userName();
        System.out.println("Hello, " + name + "!");
        if (choice.equals("2")) {
            Even even = new Even();
            Even.evenMain();
        } else if (choice.equals("3")) {
            Calc calc = new Calc();
            Calc.calcMain();
        }
    }
}
