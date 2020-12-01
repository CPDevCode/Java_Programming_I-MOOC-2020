
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //asks for number until 4 
        while (true) {
            System.out.println("Give a number");
            int useNum = Integer.valueOf(scanner.nextLine());
            if (useNum == 4) {
                break;
            }
        }

    }
}
