/*
 * Hugh Tuckwell & Samuel Duffy
 * 07/06/2022
 * The Deck of class, used for holding all the cards in a deck, and 
 */
package duffytuckwellfinalproject;

import java.util.Random; // Import Random for drawing a random card from the deck
import java.util.ArrayList; // Import an ArrayList to represent the deck full of cards

/**
 *
 * @author hutuc9524
 */
public class Deck extends CollectionOfCards {

    Random random = new Random(); // Create a new random object for drawing a random card from the deck
    
    /**
     * The Constructor, declares a card and the 4 suits for the cards, then adds them
     * to an array list representing the deck
    */
    public Deck() {
        
        Card card; // Declare a new card object to add to the deck 52 times

        char[] chars = {'s', 'd', 'c', 'h'}; // Create a new array with chars representing the suits

        // For every number in the deck as well as every suit, add a card to the the ArrayList
        for (int i = 1; i <= 13; i++) {
            for (int k = 0; k < 4; k++) {
                card = new Card(i, chars[k]); // Declare the card object to a new card with a number and a suit
                cards.add(card);
            }
        }
    }
    
    
    /**
     * The getDeck method, used to return the entire deck of cards
     * @return - the ArrayList containing the deck of cards
     */
    public ArrayList<Card> getDeck() {
        return cards;
    }
    
    /**
     * The getRandomCard method, used for drawing a card out of the deck to use for the
     * Blackjack game
     * @return - the chosen card
     */
    public Card getRandomCard(){
        int rNum = random.nextInt(cards.size());
        Card c = cards.get(rNum);
        cards.remove(rNum); // remove the grabbed card from the deck so it is not grabbed again
        return c; // return the chosen card
    }

}
