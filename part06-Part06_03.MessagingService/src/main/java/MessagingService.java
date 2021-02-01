import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService() {
    this.messages = new ArrayList<>();    
    }
    
    //adds message content to messages if less than 280 length
    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            messages.add(message);
        }
    }
    
    //returns the messages added to the service
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
    
    
}
