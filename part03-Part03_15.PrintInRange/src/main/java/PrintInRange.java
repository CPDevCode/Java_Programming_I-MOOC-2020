
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // creates a list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
        
        
    }
    
    
    //takes a list and prints numbers that are in the range given
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int each: numbers) {
            if ((each <= upperLimit) && (each >= lowerLimit)) {
                System.out.println(each);
            }
        }
    }
    
}
