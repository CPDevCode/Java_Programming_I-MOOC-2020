
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        //asks for # and if 1984 prints Orwell
        System.out.println("Give a number:");
        // notice scan instance again
        int useNum = Integer.valueOf(scan.nextLine());
        if (useNum == 1984) {
            System.out.println("Orwell");
        } 
    }
}
