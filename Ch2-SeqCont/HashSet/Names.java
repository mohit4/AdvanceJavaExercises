import java.util.HashSet;

public class Names {
	public static void main(String[] args) {
		//its just like a hash table
		HashSet<String> names = new HashSet<String>();
		names.add("Pikachu");
		names.add("Charmander");
		names.add("Squirtle");
		System.out.println("#names : "+names.size());
		for(String s : names)
			System.out.println(s);
		names.remove("Pikachu");
		names.add("Bulbasaur");
		String name = "Pikachu";
		if(names.contains(name))
			System.out.println(name+" is in!");
		else
			System.out.println(name+" is not in!");
		names.clear();
		System.out.println(names.size());
	}
}
