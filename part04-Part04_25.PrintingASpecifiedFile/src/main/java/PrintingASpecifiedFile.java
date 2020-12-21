
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask's a user for a file and prints the info row by row (made for songs)
        System.out.println("Which file should have its contents printed?");
        String useFile = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(useFile))) {
            
            while(scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
