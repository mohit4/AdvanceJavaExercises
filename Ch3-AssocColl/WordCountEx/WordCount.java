import java.util.TreeMap;
import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		String text;
		text = "Either the well was very deep or she fell very"
			+"slowly for she had plenty of time as she"+
			"went down to look about her and to what was"
			+"going to happen next First she tried to look"+
			"down and make out what she was coming to out"+
			"it was too dark to see anything then she looked"
			+"at the sides of the well and noticed that they"
			+"were filled with cupboards and bookshelves"+
			"here and there she saw maps and pictures hung";
		String[] words = text.split(" ");
		Arrays.sort(words);
		int count = 0;
		for(String word : words) {
			System.out.println("Words : "+word);
		}
		TreeMap<String,Integer> wordList = new TreeMap<String,Integer>();
		String thisWord ="";
		String nextWord ="";
		for(int i=0;i<(words.length-1);i++) {
			thisWord = words[i];
			count++;
			nextWord = words[i+1];
			if(!thisWord.equals(nextWord)) {
				wordList.put(thisWord,count);
				count=0;
			}
		}
		//handling odd word list count
		nextWord = words[words.length-1];
		if(thisWord.equals(nextWord)){
			count++;
		}
		else {
			count=1;
		}
		if(words.length%2!=0) {
			wordList.put(nextWord,count);
		}
		//getting all the keys
		Set<String> S = wordList.keySet();
		for(String s: S)
			System.out.println(s+" : "+wordList.get(s));

	}
}
