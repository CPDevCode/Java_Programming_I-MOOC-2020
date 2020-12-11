
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        
        //adds numbers to list and prints them back, stops with -1
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                for (int each: numbers) {
                    System.out.println(each);
                }
                break;
            }

            numbers.add(luku);
        }

    }
}
