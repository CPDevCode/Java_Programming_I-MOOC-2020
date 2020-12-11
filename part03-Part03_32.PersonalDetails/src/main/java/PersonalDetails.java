
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //asks users for name and birth year, gives AVG of birth years and longest name entered (name,YYYY format)...break with empty
        String longName = "";
        int longNameSize = 0;
        int totalYears = 0;
        int countYears = 0;
        
        
        while(true) {
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
            String[] split = name.split(",");
            if (longNameSize < split[0].length()) {
                longName = split[0];
                longNameSize = split[0].length();
            }
            totalYears = totalYears + Integer.valueOf(split[1]);
            countYears++;
        }
        
        double avgYear = totalYears / (double) countYears;
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + avgYear);
    }
}
