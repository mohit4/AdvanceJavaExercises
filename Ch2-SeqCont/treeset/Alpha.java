//TreeSet is used to store the elements
//and maintain a sorted order
import java.util.TreeSet;

public class Alpha {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Mayank");
		names.add("Jatin");
		names.add("Mohit");
		names.add("Amit");
		for(String s: names)
			System.out.println(s);
		System.out.println("Name before me : "+names.lower("Mohit"));
		System.out.println("Name after me : "+names.higher("Mohit"));
		System.out.println("First name is : "+names.first());
		System.out.println("Last name is : "+names.last());
	}
}
