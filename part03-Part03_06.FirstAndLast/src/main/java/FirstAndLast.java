
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        //adds names to a list and prints first and last values entered
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                String firstValue = list.get(0);
                String lastValue = list.get(list.size() - 1);
                System.out.println(firstValue);
                System.out.println(lastValue);
                break;
            }

            list.add(input);
        }

    }
}
