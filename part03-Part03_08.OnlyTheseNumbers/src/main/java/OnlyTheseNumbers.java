
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        
        //adds numbers to a list and prints from one index to another
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("From where?");
                int start = Integer.valueOf(scanner.nextLine());
                System.out.println("To where?");
                int end = Integer.valueOf(scanner.nextLine());
                for (int i = start; i <= end; i++){
                    System.out.println(numbers.get(i));
                }
                break;
            }

            numbers.add(number);
        }

    }
}
