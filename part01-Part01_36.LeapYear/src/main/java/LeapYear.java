
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //finds out if a number entered is a leap year
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        //message if year is or isnt
        String isLeapYear = "The year is a leap year";
        String isNotLeapYear = "The year is not a leap year";
        
        //sees if year is leap year (leap year is divisble by 4 and 100 if only by 400)
        
        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    System.out.println(isLeapYear);
                } else {
                    System.out.println(isNotLeapYear);
                }
            } else {
                System.out.println(isLeapYear);
            }
        } else {
            System.out.println(isNotLeapYear);
        }
        
                
    }
}
