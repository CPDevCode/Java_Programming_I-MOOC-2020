
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //adds numbers to a list and gives the AVG of the list, breaks with -1
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int count = 0;
        
        while (true) {
            int useNum = Integer.valueOf(scanner.nextLine());
            if (useNum == -1) {
                for (int each: numbers) {
                    sum = sum + each;
                    count = count + 1;
                }
                break;
            }
            numbers.add(useNum);
        }
        
        double avg = sum / (double) count;
        System.out.println("Average: " + avg);
        
    }
}
