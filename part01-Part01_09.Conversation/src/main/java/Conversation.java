
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //asks how user is doing, then asks for more info
        System.out.println("Greetings! How are you doing?");
        String useMood = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String moreInfo = scanner.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
