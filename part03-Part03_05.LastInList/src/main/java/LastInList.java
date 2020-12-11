
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        //adds names to list and prints last name entered
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                String lastNameEnter = list.get(list.size() - 1);
                System.out.println(lastNameEnter);
                break;
            }

            list.add(input);
        }

    }
}
