import java.util.Scanner;



public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    
    //starts the user interface
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            //stops 
            if(command.equals("stop")) {
                break;
            }
            
            //adds tasks
            if(command.equals("add")) {
                System.out.println("To add:");
                String toAdd = this.scanner.nextLine();
                this.list.add(toAdd);
            }
            
            //removes
            if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int itemRemoved = Integer.valueOf(scanner.nextLine());
                this.list.remove(itemRemoved);
            }
            
            //prints list
            if(command.equals("list")) {
                this.list.print();
            }
        }
    }
    
    
}
