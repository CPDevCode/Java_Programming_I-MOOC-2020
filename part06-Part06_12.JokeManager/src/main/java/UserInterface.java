import java.util.Scanner;
import java.util.Random;


public class UserInterface {
    private JokeManager joke;
    private Scanner scanner;
    
    
    public UserInterface(JokeManager joke, Scanner scanner) {
        this.joke = joke;
        this.scanner = scanner;
    }
    
    //starts UI
    public void start() {
        while (true) {
            System.out.println("Commands: \n 1-add a joke \n 2-draw a joke \n 3-list jokes \n X-stop");
            String command = this.scanner.nextLine();
            //quits
            if(command.equals("X")) {
                break;
            }
            //adds joke
            else if(command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.joke.addJoke(joke);
            }
            //draws random joke
            else if(command.equals("2")) {
                System.out.println("Drawing a joke.");
                String randomJoke = this.joke.drawJoke();
                System.out.println(randomJoke);
            }
            //prints all jokes
            else if(command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.joke.printJokes();
            }
            
        }
    }
}
