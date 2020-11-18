
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //ask user to write something
        System.out.println("Write something:");
        // convert to boolean using Boolean class with valueOf method
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + value);

    }
}
