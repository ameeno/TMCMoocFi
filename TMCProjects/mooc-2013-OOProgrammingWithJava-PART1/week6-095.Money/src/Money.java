
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int addeur = this.euros + added.euros;
        int addcents = this.cents + added.cents;

        return new Money(addeur, addcents);
    }

    public boolean less(Money compared) {

        return ((this.euros*100 + (this.cents)) < (compared.euros*100 + (compared.cents)));
    }

    public Money minus(Money decremented) {
        int thiseur = (this.euros*100 + this.cents);
        int deceur = (decremented.euros*100 + decremented.cents);
        int neweur = thiseur-deceur;
        if(neweur<0) neweur=0;

        return new Money(0, neweur);
    }

}
