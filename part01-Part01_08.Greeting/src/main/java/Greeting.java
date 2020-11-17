
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //ask's for name and say's hi to user
        System.out.println("What's your name?");
        String useName = scanner.nextLine();
        System.out.println("Hi " + useName);

    }
}
