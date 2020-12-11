
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // creates a list and calls the method sum
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
        
        
    }
    
    //returns the sum of a list
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int each: numbers) {
            sum = sum + each;
        }
        return sum;
    }
    
}
