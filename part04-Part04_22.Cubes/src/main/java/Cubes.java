
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //reads string from user and pritns the cube, stops with end
        while (true) {
            String stringNum = scanner.nextLine();
            if(stringNum.equals("end")) {
                break;
            }
            int intNum = Integer.valueOf(stringNum);
            int cube = intNum * intNum * intNum;
            System.out.println(cube);
        }

    }
}
