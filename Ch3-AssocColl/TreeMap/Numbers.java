import java.util.TreeMap;
import java.util.Set;

public class Numbers {
	public static void main(String[] args) {
		TreeMap<String,String> numbers = new TreeMap<String,String>();
		numbers.put("Mohit","4553");
		numbers.put("Cindy","9099");
		numbers.put("Claire","7763");
		System.out.println("Claire's no is : "+numbers.get("Claire"));
		numbers.remove("Cindy");
		
		//fetching all the keys using keySet and printing the values
		Set<String> all_keys = numbers.keySet();
		for(String s : all_keys)
			System.out.println(s+" : "+numbers.get(s));

		System.out.println("No of entries : "+numbers.size());
	}
}
