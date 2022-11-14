/*
 * Hugh Tuckwell & Samuel Duffy
 * 06/07/2022
 * A card class designed to represent a card for use in the Blackjack game, 
 * Cards have a number and a suit, as well as a corrosponding image for the number and suit.
 */
package duffytuckwellfinalproject;

//Import ImageIcon to use for implementing a card image for 
import javax.swing.ImageIcon;

public class Card {
    
// Declare variables for number and suit, they are null by default
int number;
char suit;

    /**
     * Primary Constructor, used to make an instance of the Card object,
     * has a number and a suit represented by a char
     * @param number - the number of the card
     * @param suit - the suit of the card
     */
    public Card(int number, char suit){
        this.number = number;
        this.suit = suit;
    }
    
    /**
     * The getNumber method, used to return the number of the card
     * @return - the number of the card
     */
    public int getNumber(){
        return number;
    }
    
    /**
     * The getSuit method, used to return the suit of the card
     * @return - the char representing the first letter of the suit
     */
    public char getSuit(){
        return suit;
    }

    /**
     * The getImage method, used to return the ImageIcon representing the card
     * @return - the image representing the card
     */
    public ImageIcon getImage(){
        String url = ("src/duffytuckwellfinalproject/images/Cards/"+number+suit+".png"); // Find the image of the corrosponding card
        ImageIcon pic = new ImageIcon(url); 
        ImageIcon resizedPic = new ImageIcon(pic.getImage().getScaledInstance(100,150,java.awt.Image.SCALE_SMOOTH)); // Resize the card image
        return resizedPic; 
    }

    
}
