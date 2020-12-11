
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // asks for a sentance (min 2 words) and prints each word on its own line
        while (true) {
            String message = scanner.nextLine();
            if (message.isEmpty()) {
                break;
            }
            String[] split = message.split(" ");
            for (String each: split) {
                System.out.println(each);
            }
        }
        
        


    }
}
