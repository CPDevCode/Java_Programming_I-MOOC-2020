
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        //adds numbers to list and prints the largest given
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                int largest = 0;
                for (int each: list) {
                    if (each > largest) {
                        largest = each;
                    }
                }
                System.out.println("The greatest number: " + largest);
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
    }
}
