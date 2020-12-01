
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initiates count
        int count = 0;
        
        
        //aks for numbers until 0 and gives count of numbers entered
        while (true) {
            System.out.println("Give a number: ");
            int useNum = Integer.valueOf(scanner.nextLine());
            if (useNum == 0) {
                System.out.println("Number of numbers: " + count);
                break;
            }
            count = count + 1;
        }

    }
}
