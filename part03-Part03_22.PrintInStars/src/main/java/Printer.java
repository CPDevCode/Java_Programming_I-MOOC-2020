
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    
    //prints each value of an array with stars on it's own line
    public static void printArrayInStars(int[] array) {

        for (int each: array) {
            for (int i = 0; i < each; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
