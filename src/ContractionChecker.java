import java.io.*;
import java.util.*;
/**
 * @author Kieran Joshi
 * @version 1.0
 *
 * A program that locates contractions within a text file, used to notify the user of contractions in formal writing.
 */
public class ContractionChecker {
    public static void main(String[] args) {
        try{
            File text = new File("textfile.txt");
            Scanner scnr = new Scanner(text);
        }
        catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
