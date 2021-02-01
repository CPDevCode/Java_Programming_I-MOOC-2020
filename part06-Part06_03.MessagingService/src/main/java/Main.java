
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message shortMessage = new Message("Christian", "This is the short message");
        Message longMessage = new Message("MickyMouse", "This is a very long message that will take up so much space and time becuase I need it to be longer than 280 characters long");
        System.out.println(longMessage.getContent().length());
    }
}
