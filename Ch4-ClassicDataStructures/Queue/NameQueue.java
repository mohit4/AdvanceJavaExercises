import java.util.LinkedList;

public class NameQueue {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();
		names.addLast("Cynthia");
		names.addLast("Raymond");
		names.addLast("David");
		//printing the names
		for(String name : names) 
			System.out.println(name);
		names.removeFirst();
		System.out.println();
		for(String name : names)
			System.out.println(name);
		names.addLast("Myrando");
		for(String name : names)
			System.out.println(name);
		System.out.println("Size of Queue : "+names.size());
		if(!names.isEmpty())
			names.removeFirst();
		System.out.println("After removing : "+names.size());
	}
}
