
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        //gets user message and prints 3 times
        String useMessage = scanner.nextLine();
        System.out.println(useMessage);
        System.out.println(useMessage);
        System.out.println(useMessage);

    }
}
