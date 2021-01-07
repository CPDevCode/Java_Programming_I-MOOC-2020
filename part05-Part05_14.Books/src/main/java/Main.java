
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
//        Book cat = new Book("cat", 1);
//        Book cat1 = new Book("cat", 1);
//        Book dog = new Book("dog", 2);
//        
//        if (cat.equals(cat1)) {
//            System.out.println("Potato");
//        } else {
//            System.out.println("Meow");
//        }
//        
//        if (cat.equals(dog)) {
//            System.out.println("Doggy");
//        } else {
//            System.out.println("Hamburger");
//        }


        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);
            }
        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
