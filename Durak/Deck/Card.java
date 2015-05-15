public class Card{
    public int Value;
    public String Suit;
    public Card(int Value, String Suit){
	Value = this.Value;
	Suit = this.Suit;
    }
    public int getValue(){	
	    return Value;

    } 
    public String getSuit(){
	return Suit;
    }
    public String readCard(){
	return " "+ Value + " of " + Suit;
	    }
    public int compareTo(Card c){
	return Value - c.getValue();
    }
}
