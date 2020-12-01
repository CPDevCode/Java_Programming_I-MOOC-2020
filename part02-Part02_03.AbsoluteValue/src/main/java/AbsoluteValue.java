
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //gives absolute value of a number
        int useNum = Integer.valueOf(scanner.nextLine());
        if (useNum < 0) {
            useNum = useNum * -1;
        }
        System.out.println(useNum);

    }
}
