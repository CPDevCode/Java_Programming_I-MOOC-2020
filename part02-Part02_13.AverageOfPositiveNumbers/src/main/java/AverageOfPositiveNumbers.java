
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //initiates sum and count
        int sum = 0;
        int count = 0;

        //loops for #'s and gives avg of positive numbers, breaks with 0, ignores negative
        while(true) {
            int useNum = Integer.valueOf(scanner.nextLine());
            if (useNum == 0) {
                break;
            } else if (useNum < 0) {
                continue;
            }
            sum = sum + useNum;
            count = count + 1;
        }
        
        
        
        //initiates avg variable
        double avg = (double)sum / count;
        if (count != 0) {
            System.out.println("Average of the numbers: " + avg);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
