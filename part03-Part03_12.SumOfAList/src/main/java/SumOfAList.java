
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        //adds numbers to a list and prints sum
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                for (int each: list) {
                    sum = sum + each;
                }
                System.out.println("Sum: " + sum);
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
    }
}
