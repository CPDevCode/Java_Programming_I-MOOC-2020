
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //initiates count and sum
        int count = 0;
        int sum = 0;

        //loops and gives sum and count of #'s given, break with 0
        while (true) {
            System.out.println("Give a number:");
            int useNum = Integer.valueOf(scanner.nextLine());
            if(useNum == 0) {
                System.out.println("Number of numbers: " + count + "\nSum of the numbers: " + sum);
                break;
            }
            count = count + 1;
            sum = sum + useNum;
            
        }

    }
}
