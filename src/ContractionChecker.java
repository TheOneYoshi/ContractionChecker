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
            File text = new File("textfile.txt");  //creating file
            Scanner scnr = new Scanner(text); //creating scanner
            int count = 0;
            while(scnr.hasNext()){         //loop iterates through the text file, finding words with apostrophes, if that word is found it is printed along with the word number
                String word = scnr.next();
                count++;
                if(word.contains("'")){
                    System.out.println("Contraction found : \""+word+"\", it is word "+count+" in the file");
                }
            }
            scnr.close();
        }
        catch(FileNotFoundException e) { //exception handling
            throw new RuntimeException(e);
        }
    }
}
