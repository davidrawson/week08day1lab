package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidrawson on 22/01/2018.
 */

public class WordCounterTest {

    WordCounter wordCounter;

   @Before
   public void before(){
        wordCounter = new WordCounter();
   }


   @Test
    public void canCountWords(){
       assertEquals("The number of words in the text block is 6", wordCounter.countWords("This is six words typed in."));
   }


    @Test
    public void canCountNoWords(){
        assertEquals("The text block contained no words", wordCounter.countWords(""));
    }

}
