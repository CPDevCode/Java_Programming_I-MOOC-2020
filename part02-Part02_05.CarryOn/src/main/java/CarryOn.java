
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //continues message until user enters no
        while (true) {
            System.out.println("Shall we carry on?");
            String message = scanner.nextLine();
            if (message.equals("no")) {
                break;
            }
        }

    }
}
