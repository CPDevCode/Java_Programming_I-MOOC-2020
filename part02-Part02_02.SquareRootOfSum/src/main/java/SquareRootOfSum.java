
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //asks for two numbers and gets the square root of the sum
        int useNum1 = Integer.valueOf(scanner.nextLine());
        int useNum2 = Integer.valueOf(scanner.nextLine());
        int sum = useNum1 + useNum2;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);

    }
}
