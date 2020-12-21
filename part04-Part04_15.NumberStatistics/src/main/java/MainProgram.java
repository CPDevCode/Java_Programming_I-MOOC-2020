
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Statistics listOfNum = new Statistics();
        Statistics evenNum = new Statistics();
        Statistics oddNum = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while (true) {
            int useNum = Integer.valueOf(scanner.nextLine());
            if(useNum == -1) {
                break;
            }
            if((useNum % 2) == 0) {
                evenNum.addNumber(useNum);
            } else {
                oddNum.addNumber(useNum);
            }
            listOfNum.addNumber(useNum);
        }

        System.out.println("Sum: " + listOfNum.sum());
        System.out.println("Sum of even numbers: " + evenNum.sum());
        System.out.println("Sum of odd numbers: " + oddNum.sum());
    }
}
