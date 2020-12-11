
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //builds an array
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
        
        //prints array 
        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Asks for two indices and swaps the value
        //get's the two indices to be swapped
        System.out.println("Give two indices to swap:");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());

        int indexToSwap = array[index1];
        array[index1] = array[index2];
        array[index2] = indexToSwap;
        
        
        
        //reprints the array
        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(index + "porato");
            System.out.println(array[index]);
            index++;
        }
    }

}
