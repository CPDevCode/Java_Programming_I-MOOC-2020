
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //reads words from user till empty is entered, prints the first word entered
        while (true) {
            String word = scanner.nextLine();
            if (word.isEmpty()) {
                break;
            }
            String[] ugh = word.split(" ");
            System.out.println(ugh[0]);
        }

    }
}
