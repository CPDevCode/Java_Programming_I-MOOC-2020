
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song wrongSong = new Song("The cat that was fat", "Fat Cat", 102);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }
        
        if (wrongSong.equals(anotherSparrow)) {
            System.out.println("Yup same");
        } else {
            System.out.println("Nope wrong");
        }


    }
}
