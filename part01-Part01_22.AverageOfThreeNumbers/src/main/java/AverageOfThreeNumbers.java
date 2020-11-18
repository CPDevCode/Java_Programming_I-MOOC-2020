
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //asks for three #'s then gets the AVG as a double
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scanner.nextLine());
        //cal the AVG of two #'s and converts to a double too
        double avgNum = (firstNum + secondNum + thirdNum) / (double) 3;
        System.out.println("The average is " + avgNum);

    }
}
