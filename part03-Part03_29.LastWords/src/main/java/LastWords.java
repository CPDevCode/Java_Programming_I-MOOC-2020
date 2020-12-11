
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //reads words from user till empty is entered, prints the first word entered
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] split = sentence.split(" ");
            System.out.println(split[split.length - 1]);
        }

    }
}
