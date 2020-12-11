import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        
        //asks for name and age (name,age format) breaks with space. Gives oldest name
        while (true) {
            String person = scanner.nextLine();
            if (person.isEmpty()) {
                break;
            }
            String[] split = person.split(",");
            String name = split[0];
            int age = Integer.valueOf(split[1]);
            if (age > oldest) {
                oldest = age;
                oldestName = name;
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
