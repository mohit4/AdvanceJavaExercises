public class ListDriver {
	public static void main(String[] args) {
		List<String> glist = new List<String>(10);
		glist.add("mohit");
		glist.add("rohan");
		glist.add("amit");
		System.out.println("Names : "+glist.toString());

		List<Integer> numbers = new List<Integer>(5);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println("Data : "+numbers.toString());
	}
}
