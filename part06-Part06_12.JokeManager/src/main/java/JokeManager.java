import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    //adds joke
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    //returns a single joke at random
    public String drawJoke() {
        if(!this.jokes.isEmpty()) {
            Random rand = new Random();
            return this.jokes.get(rand.nextInt(this.jokes.size()));
        } else {
            return "Jokes are in short supply.";
        }

    }
    
    //prints all jokes
    public void printJokes() {
        for (String joke: this.jokes) {
            System.out.println(joke);
        }
    }
}
