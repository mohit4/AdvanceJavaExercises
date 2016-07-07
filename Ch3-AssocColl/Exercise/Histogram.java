import java.util.Set;
import java.util.TreeMap;
public class Histogram {

	public static void main(String[] args) {

		CharCount CC = new CharCount("lipsum.txt");
		TreeMap<Character,Integer> T = CC.getCount();
		Set<Character> Sc = T.keySet();
		for(Character c : Sc) {
			System.out.println(c+" : "+T.get(c));
		}
	}
}
