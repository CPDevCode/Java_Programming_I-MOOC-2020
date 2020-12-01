
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initiates sum
        int sum = 0;
        
        //loops for #'s and gives sum, 0 breaks
        while (true) {
            System.out.println("Give a number: ");
            int useNum = Integer.valueOf(scanner.nextLine());
            if (useNum == 0) {
                System.out.println("Sum of the numbers: " + sum);
                break;
            } 
            sum = useNum + sum;
            
        }

    }
}
