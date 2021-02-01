import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } 
            //adds words to simpleDict
            else if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                this.simpleDictionary.add(word, translation);
            }
            //searches word for it's translation
            else if (command.equals("search")) {
                System.out.println("To be translated:");
                String wordToTranslate = this.scanner.nextLine();
                String translatedWord = this.simpleDictionary.translate(wordToTranslate);
                if (translatedWord==null) {
                    System.out.println("Word " + wordToTranslate + " was not found");
                } else {
                    System.out.println("Translation:");
                    System.out.println(translatedWord);
                }
            } 
            //if command isn't found
            else {
                System.out.println("Unkown command");
            }
        }
    }
}
