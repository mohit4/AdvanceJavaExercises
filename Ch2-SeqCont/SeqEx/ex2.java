import java.util.PriorityQueue;
import java.io.*;

public class ex2{
	public static void main(String[] args){
		PriorityQueue<String>men=new PriorityQueue<String>();
		PriorityQueue<String>women=new PriorityQueue<String>();
		String line=null;
		String file=".\\dance.txt";
		String sex="";
		BufferedReader input;
		try{
			input=new BufferedReader(new FileReader(file));
			while((line=input.readLine())!=null){
				sex=line.substring(0,1);
				if(sex.equals("M"))
					men.add(line.substring(2));
				else
					women.add(line.substring(2));
			}
			input.close();
		}
		catch(IOException except){
			System.out.println("Error opening file");
		}
		//now we make pairs
		while(!men.isEmpty()&&!women.isEmpty())
			System.out.println(men.poll()+" and "+women.poll());
		if(!women.isEmpty()){
			System.out.println("Women waiting "+women.size());
			System.out.println("Next is "+women.peek());
		}
		if(!men.isEmpty()){
			System.out.println("Men waiting "+men.size());
			System.out.println("Next is "+men.peek());
		}
		
	}
}
