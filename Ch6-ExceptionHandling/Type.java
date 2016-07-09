//program to demonstrate Exception Handling in java
import java.io.*;
import java.util.*;

public class Type {
	public static void main(String[] args) {
		String file = args[0];
		BufferedReader inFile;
		try {
			inFile = new BufferedReader(new FileReader(file));
			System.out.println("File found! Reading ...");
			String line="";
			while((line=inFile.readLine())!=null)
				System.out.println(line);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found. Try again.");
		}
		catch(IOException e) {
			System.out.println("Problem reading file.");
		}
		//will execute regardless
		//use when needed to close resources
		finally {
			if(inFile!=null) {
				try {
					inFile.close();
				}
				catch(IOException e) {
					System.out.println("Problem with file.");
				}
			}
		}
	}
}
