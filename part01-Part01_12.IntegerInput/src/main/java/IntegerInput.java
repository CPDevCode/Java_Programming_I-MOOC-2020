
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //ask for number and prints the input
        System.out.println("Give a number:");
        // remember to convert using Integer class with the valueOf method
        int useNum = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + useNum);

    }
}
