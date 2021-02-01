import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    
    //returns true if empty
    public boolean isEmpty() {
        if(this.people.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    //finds shortest person
    public Person shortest() {
        int shortest = 999;
        int indexOfShort = 0;
        if (this.people.isEmpty()) {
            return null;
        } else {
            for(int i = 0; i < this.people.size(); i++) {
                if (this.people.get(i).getHeight() <= shortest) {
                    shortest = this.people.get(i).getHeight();
                    indexOfShort = i;
                }
            }
            Person shorty = new Person(this.people.get(indexOfShort).getName(),this.people.get(indexOfShort).getHeight());
            return shorty;
        }
    }
    
    //takes shortest person from room
    public Person take() {
        if(this.people.isEmpty()) {
            return null;
        } else {
            Person shortPerson = this.shortest();
            this.people.remove(this.shortest());
            return shortPerson;
        }
    }
    
}
