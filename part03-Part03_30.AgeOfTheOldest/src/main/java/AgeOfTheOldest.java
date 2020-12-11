import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //program continues to ask for name and age (name,age format)...breaks with space and give the age of the oldest
        
        int startAge = 0;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        while (true) {
            String person = scanner.nextLine();
            if (person.isEmpty()) {
                break;
            }
            String[] split = person.split(",");
            String name = split[0];
            int age = Integer.valueOf(split[1]);   
            names.add(name);
            ages.add(age);
        }
        
        for (int each: ages) {
            if (each > startAge) {
                startAge = each;
            }
        }
        
        System.out.println("Age of the oldest: " + startAge);
        
    }
}
