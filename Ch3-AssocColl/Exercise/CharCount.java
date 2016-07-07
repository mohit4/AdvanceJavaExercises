//this class counts the characters in a specific text file
import java.io.*;
import java.lang.*;
import java.util.TreeMap;
public class CharCount {

	private String fileName;

	//constructor
	public CharCount(String fN) {
		fileName = fN;
	}

	//return a TreeMap with char as key with there corresponding char count
	public TreeMap<Character,Integer> getCount() {

		//first of all declare a treeMap to hold the values
		TreeMap<Character,Integer> T = new TreeMap<Character,Integer>();

		FileReader InFile = null;

		try {
			InFile = new FileReader(fileName);
			int c;
			while((c = InFile.read())!=-1) {
				//iterate over the line and find characters
				//if they don't exist in T, make a new entry
				//else increment the previous one
				c = Character.toLowerCase(c);
				T.put((char)c,T.get((char)c)+1);
			}
			InFile.close();
		}
		catch (IOException except) {
			System.out.println("Error in reading file");
		}
		return T;
	}
}
