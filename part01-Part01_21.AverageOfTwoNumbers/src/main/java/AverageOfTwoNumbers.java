
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //asks for two #'s then gets the AVG
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        //cal the AVG of two #'s and converts to a double too
        double avgNum = (firstNum + secondNum) / (double) 2;
        System.out.println("The average is " + avgNum);

    }
}
