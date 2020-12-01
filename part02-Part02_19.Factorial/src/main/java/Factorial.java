
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //gives factorial of a number
        System.out.println("Give a number: ");
        int factorial = Integer.valueOf(scanner.nextLine());
        int total = 1;
        for (int i = 1; i <= factorial; i++) {
            total = i * total;
        }
        System.out.println("Factorial: " + total);
    }
}
