
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        String emptyMessage = "The collection " + this.name + " is empty.";
        String oneMessage = "The collection " + this.name + " has 1 element:";
        String messages = "The collection " + this.name + " has " + this.elements.size() + " elements:";
        
        if (this.elements.isEmpty()) {
            return emptyMessage;
        } else if (this.elements.size()==1) {
            return oneMessage + "\n" + this.elements.get(0);
        } else {
            for(String each: this.elements) {
                messages = messages + "\n" + each;
            }
            return messages;
        }    
    }
}
