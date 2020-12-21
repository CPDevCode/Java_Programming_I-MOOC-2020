import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        //adds shows to a list and their duration, break with empty show
        while (true) {
            System.out.println("Name: ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(showName, duration));
        }
        
        //ask's user for maximum duration, prints shows and durations of shows = or less than given duration
        System.out.println("Programs maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram each: programs) {
            if (each.getDuration() <= maxDuration) {
                System.out.println(each.getName() + "," + each.getDuration());;
            }
        }

    }
}
