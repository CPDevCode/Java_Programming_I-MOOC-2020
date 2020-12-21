
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //asks user for file and then a lower and upper bound numbers, counts the number of numbers in bound
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        
        try(Scanner scan = new Scanner(Paths.get(file))) {
            
            while(scan.hasNextLine()) {
                int lineNum = Integer.valueOf(scan.nextLine());
                if (lineNum >= lowerBound && lineNum <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }    
}
