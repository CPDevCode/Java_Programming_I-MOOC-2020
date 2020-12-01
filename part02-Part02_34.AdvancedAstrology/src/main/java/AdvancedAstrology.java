
public class AdvancedAstrology {

    
    // for printing stars
    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    // printing given number of spaces
    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }
    
    // prints a rectangle using printStars and printSpaces method
    public static void printTriangle(int size) {
        // part 2 of the exercise
        
        for (int i = 1; i <= size; i++) {
            //print spaces
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int firstStar = 1;
        
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(firstStar);
            firstStar = firstStar + 2;
        }
        
        for (int i = 1; i < 3; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

//        printTriangle(5);
//        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
