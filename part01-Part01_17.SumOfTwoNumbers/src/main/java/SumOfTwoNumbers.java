
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //asks for two numbers and gives sum value
        System.out.println("Give the first number:");
        int useNum1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int useNum2 = Integer.valueOf(scanner.nextLine());
        int total = useNum1 + useNum2;
        System.out.println("The sum of the numbers is " + total);

    }
}
