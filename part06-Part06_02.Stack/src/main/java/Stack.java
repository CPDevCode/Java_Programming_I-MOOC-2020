import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;
    
    public Stack() {
        this.stacks = new ArrayList<>();
    }
    
    //adds a string to stacks
    public void add(String value) {
        this.stacks.add(value);
    }
    
    //returns the array
    public ArrayList<String> values(){
        return this.stacks;
    }

    //returns true if list is empty
    public boolean isEmpty() {
        if(this.stacks.isEmpty()) {
            return true;
        }
        return false;
    }
    
    // return's last value and returns it, removes it from Array
    public String take() {
        String topValue = this.stacks.get(this.stacks.size()-1);
        this.stacks.remove(this.stacks.size()-1);
        return topValue;
    }
}
