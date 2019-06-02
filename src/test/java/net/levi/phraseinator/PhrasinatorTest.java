package net.levi.phraseinator;

import org.junit.Test;
import static org.junit.Assert.*;

public class PhrasinatorTest {
    @Test public void givenNothing_stringShouldBeGt4() {
        assertTrue(new Phraseinator().generate().length()>4 );
     }
 
 
     @Test 
      public void givenNothing_returnThreeStrings() {
         assertEquals(3, new Phraseinator().generate().split(" ").length);
     }
 
     @Test 
      public void givenNothing_returnNounNotEmpty() {
         assertFalse(new Phraseinator().generateNoun().isEmpty());
     }
 
     @Test
      public void givenSingleWord_returnsWord() {
         assertEquals("test",new Phraseinator().generateWord("test"));
     }
 
     @Test
     public void givenMultipleWords_returnsWord() {
       String [] x = {"test","somethingelse"};
       String genx = new Phraseinator().generateWord(x);
       
       boolean b = false;
       for(String temp:x){
         if (temp.equals(genx)) b=true;
       }
       assertTrue(b);
 
    }
 
     @Test(expected = ArrayIndexOutOfBoundsException.class)
      public void givenNothing_throwsException() {
         assertEquals("test",new Phraseinator().generateWord());
     }

}