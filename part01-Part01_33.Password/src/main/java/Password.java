
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String password = "Caput Draconis";
        System.out.println("Password?");
        
        // asks for password and compaes to message (if message is same welcome)
        String usePassword = scan.nextLine();
        if(usePassword.equals(password)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
