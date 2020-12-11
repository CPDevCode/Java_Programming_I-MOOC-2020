
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // asks user for sentences and then prints words from sentence that contain av, brakes with empty string
        
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] split = sentence.split(" ");
            for (String each: split) {
                if (each.contains("av")) {
                    System.out.println(each);
                }
            }
        }


    }
}
