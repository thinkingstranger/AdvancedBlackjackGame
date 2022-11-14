/*
 * Hugh Tuckwell & Samuel Duffy
 * 06/08/2022
 * The Player class, acts as a player in a Blackjack game. A Player has a name,
 * a password, and an amount of tokens ranging from 0-Infinity. 
 */
package duffytuckwellfinalproject;

import java.io.Serializable; // Import Serializable to save files

/**
 *
 * @author hutuc9524
 */
public class Player implements Serializable{ // Implement Serializable to save files
    // Declare a long for the serialVersionID, without this, file saving would not work
    private static final long serialVersionUID = 5968357720596337066L;
    // Delcare global variables for the player's name, password, and a default token value of 1000 (starting value)
    String name;
    String password;
    int tokens = 1000;

    /**
     * The primary constructor, used if a Player object is declared with only a 
     * name and a password. The tokens stay the same amount (1000) default value
     * 
     * @param name - the inputted name of the player
     * @param password - the inputted password of the player
     */
    public Player(String name, String password){
        this.name = name;
        this.password = password;
    }
    
    /**
     * The secondary constructor, used if a Player object is declared with a 
     * name, token values and a password.
     * 
     * @param name - the inputted name of the player
     * @param password - the inputted password of the player
     * @param tokens - the inputted tokens of the player
     */
    public Player(String name, String password, int tokens){
        this.name = name;
        this.password = password;
        this.tokens = tokens;
        
    }
    
    /**
     * The getName accessor, it simply returns the name of the player.
     * 
     * @return - the name of the user
     */
    public String getName(){
        return name;
    }
    
    /**
     * The getPassword accessor, it simply returns the password of the player.
     * 
     * @return - the password of the user
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * The setName mutator method, used to change the current name of the player
     * to a new, inputted name
     * 
     * @param name - the new name of the player
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * The setPassword mutator method, used to change the current password of the player
     * to a new, inputted password
     * 
     * @param password - the new password of the player
     */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
     * The getTokens accessor method, it simply returns the current values of the tokens
     * of the player.
     * 
     * @return tokens - the current value of the player's token
     */
    public int getTokens(){
        return tokens;
    }
    
    /**
     * The setTokens mutator method, used to change the current tokens of the player
     * to a new, inputted tokens value
     * 
     * @param tokens - the new value of the player's tokens
     */
    public void setTokens (int tokens){
        this.tokens = tokens;
    }
    
}