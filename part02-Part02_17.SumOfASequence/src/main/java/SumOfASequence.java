
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // gives the factorial of n number
        System.out.println("Last number?");
        int factNum = Integer.valueOf(scanner.nextLine());
        
        //initiates sum
        int sum = 0;
        
        for (int i = 0; i <= factNum; i++) {
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
