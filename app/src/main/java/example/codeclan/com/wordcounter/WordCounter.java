package example.codeclan.com.wordcounter;

import java.util.StringTokenizer;

/**
 * Created by davidrawson on 22/01/2018.
 */

public class WordCounter {


    public String countWords(String text){

        if (text == null || text.isEmpty()){
            return ("The text block contained no words");
        }else{
            StringTokenizer token = new StringTokenizer(text);
            return ("The number of words in the text block is " + token.countTokens());
        }
    }

}
