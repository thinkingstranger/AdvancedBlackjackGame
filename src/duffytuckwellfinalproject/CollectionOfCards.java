/*
 * Hugh Tuckwell & Samuel Duffy
 * 06/07/2022
 * The CollectionOfCards class only has an ArrayList and a get Cards method,
 * returning the cards
 */
package duffytuckwellfinalproject;

// Import ArrayList to make an ArrayList representing the collection of cards
import java.util.ArrayList; 

public class CollectionOfCards {
    
    protected ArrayList<Card> cards = new ArrayList(); // Declare the protected ArrayList

    /**
     * The getCards method, it simply returns the ArrayList
     * full of cards that represents a hand or a deck in Blackjack
     * @return - the ArrayList full of cards representing a hand or a deck in Blackjack
     */
    public ArrayList<Card> getCards(){
        return cards; // return the arraylist full of cards
    }
}