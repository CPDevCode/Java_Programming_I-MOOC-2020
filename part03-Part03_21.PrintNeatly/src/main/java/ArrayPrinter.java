
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    // prints an array number + , + space
    public static void printNeatly(int[] array) {
        int index = 0;
        //prints all items but the last
        while (index < (array.length - 1)) {
            System.out.print(array[index] + ", ");
            index++;
        }
        
        System.out.println(array[array.length-1]);
    }
}
