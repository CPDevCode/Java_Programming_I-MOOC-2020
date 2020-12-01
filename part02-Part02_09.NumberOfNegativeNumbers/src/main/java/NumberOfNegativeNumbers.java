
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //initiates count
        int count = 0;
        
        //loops asking for negative #'s and gives the count of negative #'s
        while (true) {
            System.out.println("Give a number: ");
            int useNum = Integer.valueOf(scanner.nextLine());
            if (useNum ==  0) {
                System.out.println("Number of negative numbers: " + count);
                break;
            } else if (useNum < 0) {
                count = count + 1;
            }
            
        }

    }
}
