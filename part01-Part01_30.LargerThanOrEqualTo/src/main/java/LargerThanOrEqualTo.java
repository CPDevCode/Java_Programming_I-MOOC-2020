
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scan.nextLine());
        
        //compares two numbers and gives largest result
        if (firstNum < secondNum) {
            System.out.println("Greatest number is: " + secondNum);
        } else if (firstNum == secondNum) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greatest number is: " + firstNum);
        }

    }
}
