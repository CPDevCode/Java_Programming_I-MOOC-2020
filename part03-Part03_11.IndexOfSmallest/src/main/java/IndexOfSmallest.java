
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //adds number to a list and gives the index of the smallest numbers...stops with 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        
        //set's max value so we can find smaller number
        int smallNumber = 999999999;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                
                //finds the smallest number
                for (int each: numbers) {
                    if (each < smallNumber) {
                        smallNumber = each;
                    }
                }
                System.out.println("Smallest number: " + smallNumber);
                
                
                
                //finds index of small numbers
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == smallNumber) {
                        System.out.println("Found at index: " + i);
                    }
                }
                break;
            }
            numbers.add(number);
        }
        
        

        
    }
}
