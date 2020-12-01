
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int useNum = Integer.valueOf(scanner.nextLine());
        //squares user number
        int squareNum = useNum * useNum;
        System.out.println(squareNum);
        

    }
}
