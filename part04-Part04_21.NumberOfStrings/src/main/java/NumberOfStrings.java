
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //reads words from user and prints the number of words given, ends with "end" (end don't count)
        int count = 0;
        while (true) {
            String word = scanner.nextLine();
            if(word.equals("end")) {
                System.out.println(count);
                break;
            }
            count++;
        }

    }
}
