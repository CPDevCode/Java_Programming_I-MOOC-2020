
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //asks for name and job and put's them into premade story (using \n for new line instead of mult print commands)
        System.out.println("I will tell you a story, but I need some information first." + "\n" + "What is the main character called?" );
        String name = scanner.nextLine();
        System.out.println("What is their job?");
        // job take the form of a + job
        String job = scanner.nextLine();
        System.out.println("Here is the story:\n" +
"Once upon a time there was " + name+ ", who was " + job + ".\n" +
"On the way to work, " + name + " reflected on life.\n" +
"Perhaps " + name + " will not be " + job + " forever.");
        

    }
}
