
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //finds the larger of two values
        int useNum1 = Integer.valueOf(scanner.nextLine());
        int useNum2 = Integer.valueOf(scanner.nextLine());
        
        if (useNum1 > useNum2) {
            System.out.println(useNum1 + " is greater than " + useNum2 + ".");
        } else if (useNum1 < useNum2) {
            System.out.println(useNum1 + " is smaller than " + useNum2 + ".");
        } else {
            System.out.println(useNum1 + " is equal to " + useNum2 + ".");
        }

    }
}
