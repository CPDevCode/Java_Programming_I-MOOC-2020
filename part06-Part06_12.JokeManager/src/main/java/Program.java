
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JokeManager joke = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(joke, scanner);
        ui.start();
    }
}
