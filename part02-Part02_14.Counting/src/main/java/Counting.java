
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prints from 0 till user number, iterate by 1
        int useNum = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= useNum; i++) {
            System.out.println(i);
        }

    }
}
