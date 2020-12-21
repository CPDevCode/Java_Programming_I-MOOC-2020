import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        //creates book objects and adds them to books ArrayList, if title is empty break
        while(true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, pages, year));
        }
        
        //asks user for what information they want form books ArrayList
        System.out.println("What information will be printed?");
        String command = scanner.nextLine();
        if(command.equals("everything")) {
            for(Book each: books) {
                System.out.println(each.getName() + ", " + each.getPages() + " pages, " + each.getYear() );
            }
        } else if (command.equals("name")) {
            for(Book each: books) {
                System.out.println(each.getName());
            }
        } else if (command.equals("publication year")) {
            for(Book each: books) {
                System.out.println(each.getYear());
            }
        }    
    }
}
