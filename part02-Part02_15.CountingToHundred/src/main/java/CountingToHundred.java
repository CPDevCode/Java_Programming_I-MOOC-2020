
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prints iterate of +1 until 100
        int useNum = Integer.valueOf(scanner.nextLine());
        for (int i = useNum; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
