import java.util.PriorityQueue;

public class Line{
	public static void main(String[] args){
		PriorityQueue<String> line = new PriorityQueue<String>();
		line.add("Sam");
		line.add("Dean");
		line.add("Bobby");
		line.add("Castiel");
		line.add("Crowley");
		for(String s: line)
			System.out.println(s);
		//to simulate a Q use this
		line.poll();
		//can also be done using remove
		line.remove("Crowley");
		System.out.println("The line now is : ");
		for(String ss: line)
			System.out.println(ss);
	}
}
