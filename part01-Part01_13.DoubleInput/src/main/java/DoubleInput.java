
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //ask for double and gives double
        System.out.println("Give a number:");
        // convert scanner using Double class and valueOf method
        double useNum = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + useNum);

    }
}
