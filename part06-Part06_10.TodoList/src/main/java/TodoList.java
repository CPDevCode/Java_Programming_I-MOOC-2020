import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    //adds task to list
    public void add(String task) {
        this.list.add(task);
    }
    
    //prints tasks in list
    public void print() {
        int start = 1;
        for (String each: this.list) {
            System.out.println(start + ": " + each);
            start++;
        }
    }
    
    //removes an item based index +1
    public void remove(int number) {
        this.list.remove(number - 1);
    }
    
}
