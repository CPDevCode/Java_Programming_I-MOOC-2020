
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        // asks for string, int, double, bool 
        System.out.println("Give a string:");
        // notice how our new scanner instance is scan not scanner.... scan.nextLine() not scanner.nextLine();
        String useString = scan.nextLine(); 
        System.out.println("Give an integer:");
        int useInteger = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double useDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean useBool = Boolean.valueOf(scan.nextLine());
        
        // repeats with use Answers
        System.out.println("You gave the string " + useString);
        System.out.println("You gave the integer " + useInteger);
        System.out.println("You gave the double " + useDouble);
        System.out.println("You gave the boolean " + useBool);

    }
}
