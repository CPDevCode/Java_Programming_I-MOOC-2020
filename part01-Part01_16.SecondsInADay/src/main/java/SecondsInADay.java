
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // asks user for days then converts to seconds of X days
        
        //gets # of days
        System.out.println("How many days would you like to convert to seconds?");
        int useDays = Integer.valueOf(scanner.nextLine());
        
        //converts to seconds and stores in a var
        int secondsInDay = useDays * 24 * 60 * 60;
        
        System.out.println(secondsInDay);
        

    }
}
