import java.util.TreeSet;
public class ex1{
	public static void main(String[] args){
		String text = "He was never aware of what was coming after him all his life he was running and doing things randomly always like a maniac his father wanted him to be the one true heir to his family they deserve but no he had something else in mind he wanted to follow his dreams badly that had him cornered in the end so much for his wild fantasies and now hes no one";
		String[] words = text.split(" ");
		for(String word:words)
			System.out.println(word);
		System.out.println("Total no of words are "+words.length);
		//now maintaining a TreeSet and inserting every word into it
		//duplicate entries wont be inserted
		TreeSet<String> uW = new TreeSet<String>();
		for(String w:words)
			uW.add(w);
		for(String v:uW)
			System.out.println(v);
		System.out.println("Unique words are "+uW.size());

	}
}
