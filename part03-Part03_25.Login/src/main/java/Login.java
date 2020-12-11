
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        // assigns two usersname and thier respective passwords. Checks to see if they match
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        
        users.add("alex");
        users.add("emma");
        passwords.add("sunshine");
        passwords.add("haskell");
        
        System.out.println("Enter username: ");
        String useName = scanner.nextLine();
        System.out.println("Enter password: ");
        String passWord = scanner.nextLine();
        
        String sucLogin = "You have successfully logged in!";
        String unSecLogin = "Incorrect username or password!";
        
        if (users.get(0).equals(useName) && passwords.get(0).equals(passWord)) {
            System.out.println(sucLogin);
        } else if (users.get(1).equals(useName) && passwords.get(1).equals(passWord)) {
            System.out.println(sucLogin);
        } else {
            System.out.println(unSecLogin);
        }
        

    }
}
