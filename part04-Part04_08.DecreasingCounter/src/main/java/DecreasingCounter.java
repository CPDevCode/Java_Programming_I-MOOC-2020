
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter
    private int resetValue;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
        this.resetValue = 0;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // decreses a value by 1, never goes below 0
        if ((this.value - 1) < 0) {
            
        } else {
            this.value = this.value - 1;
        }
    }
    
    public void reset() {
        this.value = this.resetValue;
    }
    

    // the other methods go here
}
