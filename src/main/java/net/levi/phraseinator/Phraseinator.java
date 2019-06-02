package net.levi.phraseinator;

public class Phraseinator {

    String [] wordListOne = {"24/7","multi-Tier", "30,000", "B-B", "win-win","front-end"};
    String [] wordListTwo = {"empowered","sticky", "value-added", "oriented", "centric","distrubted"};
    String [] wordListThree = {"process","tipping-point", "solution", "architecture", "core competency","strategy"};
    
	public String generate() {
        
        return  generateNoun() + " "  + generateNoun() + " " + generateNoun();
    }

    public String generate2() {
        
        return  generateWord(wordListOne) + " "  + generateWord(wordListTwo) + " " + generateWord(wordListThree);
    }


    public String generateWord(String... input){

      return input[(int) (Math.random()*input.length)];
    }

	public String generateNoun() {

        int listLength = wordListOne.length;
        int rand1 = (int) (Math.random() * listLength);

        return wordListOne[rand1];

    }
    // String [] wordList = {"24/7","multi-Tier", "30,000", "B-B", "win-win","front-end","empowered","sticky", "value-added", "oriented", "centric","distrubted","process","tipping-point", "solution", "architecture", "core competency","strategy"};

    // public String generateWord(String... input){

    //     return input[(int) (Math.random()*input.length)];
    //   }

    // public String getRandom() {
    //     int listLength = wordList.length;
    //     int rand1 = (int) (Math.random() * listLength);
    //     return wordList[rand1];
    // }

}