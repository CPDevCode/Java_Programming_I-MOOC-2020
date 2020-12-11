
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Creates a list to test
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    
    
    //removes last item of a list
    public static void removeLast(ArrayList<String> strings) {
        //checks to make sure list has at least 1 item
        if (strings.size() != 0) {
            strings.remove(strings.size() - 1);
        }
        
        
    }

}
