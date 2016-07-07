import java.util.HashMap;
import java.io.*;

//in hashMap the order of items is not sorted

public class Grades {
	public static void main(String[] args) {
		HashMap<String,Integer> grades = new HashMap<String,Integer>();
		grades.put("Mohit",62);
		grades.put("Himanshu",65);
		grades.put("Hemant",70);
		grades.put("Manish",89);
		grades.put("Mintoo",77);
		grades.remove("Manish");
		BufferedReader br;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			String key = br.readLine();
			if(grades.containsKey(key))
				System.out.println("Marks scored by "+key+" are "+grades.get(key));
			else
				System.out.println("No such entry");
		}
		catch(IOException except)
		{
			System.out.println("Error in input!");
		}
	}
}
