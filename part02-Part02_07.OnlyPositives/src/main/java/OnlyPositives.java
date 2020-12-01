
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int useNum = Integer.valueOf(scanner.nextLine());
            if (useNum == 0) {
                break;
            } else if (useNum < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(useNum * useNum);
            }
        }

    }
}
