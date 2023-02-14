import java.io.*;
import java.util.*;
/**
 * @author Kieran Joshi
 * @version 1.1
 *
 * A program that locates contractions within a text file, used to notify the user of contractions in formal writing.
 */
public class ContractionChecker {
    public static void main(String[] args) {
        try{
            File text = new File("textfile.txt");  //creating file
            File contractFile = new File("Contractions.txt");  //creating file
            Scanner contScanner = new Scanner(contractFile);
            Scanner scnr = new Scanner(text); //creating scanner
            String contractions[] = new String[50];
            for(int i = 0; i < 50; i++){ //creating array of contractions to be compared against the text file;
                contractions[i] = contScanner.next();
            }
            int count = 0;
            while(scnr.hasNext()){         //loop iterates through the text file, comparing the each word with the list of contractions, if that word is found it is printed along with the word number
                String word = scnr.next();
                count++;
                if(word.contains("'")){
                    for(int i = 0; i < contractions.length; i++){
                        if(word.equals(contractions[i])){
                            System.out.println("Contraction found : \""+word+"\", it is word "+count+" in the file");
                        }
                    }

                }
            }
            scnr.close();
            contScanner.close();
        }
        catch(FileNotFoundException e) { //exception handling
            throw new RuntimeException(e);
        }
    }
}
