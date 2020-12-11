
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        // adds numbers to list and asks for number to be searched...gives the index
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Search for?");
                int searchNum = Integer.valueOf(scanner.nextLine());
                int startIndex = 0;
                for (int each: list) {
                    if (each == searchNum) {
                        System.out.println(each + " is at the index " + startIndex);
                    }
                    startIndex++;
                }
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
    }
}
