/*
 * Hugh Tuckwell & Samuel Duffy
 * 06/10/2022
 * The SaveFiles class is a class containing 3 essential methods all pertaining to the reading and writing of objects into files
 * I figured it would make sense to group these files into one class because they require the same inputs and serve a similar purpose
 */
package duffytuckwellfinalproject;

//input statements
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SaveFiles {

    /**
     * Method used to read the contents of a file and return a Player object
     *
     * @param playerName the username of the player, the method will search for
     * a file with this name
     * @return the player object stored within the specified file
     */
    public static Player readObjectNoSelection(String playerName) {

        Player p = null; //creates an empty player object to be overwritten later. must be defined outside of the try/catch clause so that it is within the scope of the return statemtn
        try {// begininning of a try/catch statement, file reading can entail several unexpected errors
            FileInputStream in = new FileInputStream("src/duffytuckwellfinalproject/saves/" + playerName); //locates the user's file and creates a FileInputStream object with it
            ObjectInputStream s = new ObjectInputStream(in); //ObjectInputStream Object created using the FileInputStream as a parameter
            p = (Player) s.readObject(); //overwrites the null player object from before with the object read from the file
        } catch (ClassNotFoundException | IOException e) { //catches the class not found and IO exception errors
            System.out.println(e); //prints the error(s)
        }
        return p; //returns the overwritten player object
    }

    /**
     * Method used to save a Player object to a file. If the file does not
     * exist, one is automatically created.
     *
     * @param p the player object that will be stored in the File
     */
    public static void saveObjectNoSelection(Player p) {

        try { //try/catch clause so that errors wont crash the program
            File f = new File("src/duffytuckwellfinalproject/saves/" + p.getName()); //attempts to find file with the same name as the player's username
            if (f.exists()) { //if the file exists
                FileOutputStream out = new FileOutputStream(f); //creates FileOutputStream object using the previously defined file object as a parameter
                ObjectOutput save = new ObjectOutputStream(out); //creates an ObjectgOutput object using the FileOutPutStream as a parameter
                save.writeObject(p); //writes the player object to the file using the ObjectOutput object 
            } else { //if the file does not exist
                f.createNewFile(); //create a new file of the same name
                saveObjectNoSelection(p); //recursively calls the method, this time the file will (hopefully) exist and the object will be saved to it
            }

        } catch (IOException e) { //catches the IO Exception error
            System.out.println(e); //prints the error
        }
    }

    /**
     * Method used to loop through the folder containing the save files, and
     * store the objects within the files into an ArrayList
     *
     * @return an ArrayList containing all existing player objects
     */
    public static ArrayList loadPlayers() {
        ArrayList<Player> a = new ArrayList(); //instantiates an empty ArrayList
        File dir = new File("src/duffytuckwellfinalproject/saves"); //creates a file object that actually signifies the entire save folder containing all save files
        for (File file : dir.listFiles()) { //loops through every file in the folder
            a.add(SaveFiles.readObjectNoSelection(file.getName())); //reads the player object from each file, and adds it to the arraylist
        }
        return a; //returns the full arraylist which preumably contains every player object stored in the save folder
    }

}
