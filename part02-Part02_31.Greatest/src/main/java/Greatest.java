
public class Greatest {
    
    
    // gives the largest number of three
    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int largeNumber = 0;
        if(number1 > number2) {
            if(number1 > number3) {
                largeNumber = number1;
            } else {
                largeNumber = number3;
            }
        } else {
            if (number2 > number3) {
                largeNumber = number2;
            } else {
                largeNumber = number3;
            }
        }
        
        return largeNumber;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
