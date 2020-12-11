
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //message to be printed if name found
        String nameFound = " was found!";
        String nameNotFound = " was not found!";
        boolean isFound = false;
        
        // adds names to a list, breaks if space
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        //ask for name and checks to see if on the list
        System.out.println("Search for?");
        String name = scanner.nextLine();
        for (String each: list) {
            if (each.equals(name)) {
                isFound = true;
            }
        }
        
        if (isFound == true) {
            System.out.println(name + nameFound);
        } else {
            System.out.println(name + nameNotFound);
        }
        
    }
}
