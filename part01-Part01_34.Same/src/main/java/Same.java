
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        //compares two strings
        
        //assigns first string
        System.out.println("Enter the first string:");
        String firstString = scan.nextLine();
        
        //assigns second string
        System.out.println("Enter the second string:");
        String secondString = scan.nextLine();
        
        
        //compares
        if(firstString.equals(secondString)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
