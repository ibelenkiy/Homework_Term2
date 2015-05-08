public class Card{
    public int Value;
    public String Suit;
    int[] Values = [2,3,4,5,6,7,8,9,10,11,12,13,14];
    String[] Suits = ["Hearts","Spades","Clubs","Diamonds"];
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
}
