
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //program counts from one number to another by 1
        System.out.println("Where to?");
        int useNumTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int useNumFrom = Integer.valueOf(scanner.nextLine());
        for (int i = useNumFrom; i <= useNumTo; i++) {
            System.out.println(i);
        }
    }
}
