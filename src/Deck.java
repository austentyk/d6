//implementation of a interface will implement all of the specified methods in the interface mandatorily 

import java.util.List;


public class Deck {



    private List<Card> deck;

    public Deck(){
        deck = new LinkedList<>();
        for (String suit: Constants.SUITS) {
            for (int i = 0; i < Constants.NAMES.length ; i++) {
                Card card = new Card(suit, Constants.NAMES[i], Constants.VALUES[i]);
                deck.add(card);
            }
        }
    }
    
}
