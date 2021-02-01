import java.util.ArrayList;


public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    private int totalPounds;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.totalPounds = 0;
    }
    
    //add's item to suitcase
    public void addItem(Item item) {
        int totalWeight = 0;
        for(Item each: this.items) {
            totalWeight += each.getWeight();
        }
        this.totalPounds = totalWeight;
        if (totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    //prints each item
    public void printItems() {
        for(Item each: this.items) {
            System.out.println(each);
        }
    }
    
    //returns totalweight
    public int totalWeight() {
        int totalItemWeight = 0;
        for (Item each: this.items) {
            totalItemWeight += each.getWeight();
        }
        return totalItemWeight;
    }
    
    //returns heaviest item
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        int heavyItem = 0;
        int indexOfHeavyItem = 0;
        for(int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getWeight() >= heavyItem) {
                indexOfHeavyItem = i;
                heavyItem =  this.items.get(i).getWeight();
                System.out.println(indexOfHeavyItem);
            }
        }
        return this.items.get(indexOfHeavyItem);
    }
    
    
    public String toString() {
        int totalWeight = 0;
        for(Item each: this.items) {
            totalWeight += each.getWeight();
        }
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size()==1) {
            return "1 item (" + totalWeight + " kg)";
        } 
        return this.items.size() + " items (" + totalWeight + " kg)";
    }
}
