
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //asks for two numbers and gives basic arthmatic between the two
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        
        //gets totals as var (sum, difference, product, quotient (as double)
        int sum = firstNum + secondNum; 
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        double quotient = firstNum / (double) secondNum;
        
        System.out.println(firstNum + " + " + secondNum + " = " + sum);
        System.out.println(firstNum + " - " + secondNum + " = " + difference);
        System.out.println(firstNum + " * " + secondNum + " = " + product);
        System.out.println(firstNum + " / " + secondNum + " = " + quotient);
        

    }
}
