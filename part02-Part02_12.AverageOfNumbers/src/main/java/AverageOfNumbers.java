
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //initiates count and sum
        int count = 0;
        int sum = 0;
        
        
        //loops for numbers and gives the avg, break with 0
        while (true) {
            System.out.println("Give a number:");
            int useNum = Integer.valueOf(scanner.nextLine());
            if (useNum == 0) {
                break;
            }
            count = count + 1;
            sum = sum + useNum;
        }

        //initiates avg variable
        double avg = (double) sum / count;
        System.out.println("Average of the numbers: " + avg);
        
        
    }
}
