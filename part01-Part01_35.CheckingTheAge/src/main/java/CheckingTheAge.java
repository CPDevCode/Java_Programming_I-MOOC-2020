
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //checks age between 0 and 120
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        //checks age between 0 and 120
        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("Ok");
        }

    }
}
