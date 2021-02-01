import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int count;
    private int maximumWeight;
    
    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.count = 0;
        this.maximumWeight = maximumWeight;
    }
    
    //adds suitcases to hold
    public void addSuitcase(Suitcase suitcase) {
        this.count++;
        this.suitcases.add(suitcase);
    }
    
    public String toString() {
        int totalWeights = 0;
        for(Suitcase each: this.suitcases) {
            totalWeights += each.totalWeight();
            System.out.println(totalWeights);
        }
        return this.count + " suitcases (" + totalWeights + " kg)";
    }
}
