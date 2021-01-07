
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    //adds money 
    public Money plus(Money addition) {
        Money newMoney = new Money((addition.euros() + this.euros), (addition.cents() + this.cents));
        return newMoney;
    }
    
    //returns true if this < compared
    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } else if (this.euros==compared.euros) {
            if (this.cents > compared.cents) {
                return false;
            }
            return true;
        }
        return true;
    }
    
    //returns new Money object after decrease is passed....set's to 0 if negative
    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)==true) {
            Money broke = new Money(0,0);
            return broke;
        } else if (this.cents >= decreaser.cents) {
            Money remainMoney = new Money(this.euros - decreaser.euros,this.cents - decreaser.cents);
            return remainMoney;
        } else {
            Money uhmMoney = new Money(this.euros - decreaser.euros - 1, 100+(this.cents-decreaser.cents));
            return uhmMoney;
        }

    }
    

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
