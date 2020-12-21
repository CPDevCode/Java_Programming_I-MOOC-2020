
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        //creates new item objects, breaks with empty
        while (true) {
            System.out.println("Name: ");
            String item = scanner.nextLine();
            if(item.isEmpty()) {
                break;
            }
            items.add(new Item(item));
        }
        
        for(Item each: items) {
            System.out.println(each);
        }
        
        

    }
}
