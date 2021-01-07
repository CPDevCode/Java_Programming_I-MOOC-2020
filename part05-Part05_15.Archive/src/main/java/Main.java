
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Item> noDupItems = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier?(empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()) {
                break;
            }
            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
            items.add(new Item(identifier, name));     
        }
        
        for (Item each: items) {
            if(!noDupItems.contains(each)) {
                noDupItems.add(each);
            }
        }
        
        for (Item each: noDupItems) {
            System.out.println(each);
        }
            


    }
}
