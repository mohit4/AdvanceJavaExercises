import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		Stack names = new Stack();
		names.push("Mohit");
		names.push("Amit");
		names.push("Hiro");
		names.push("Amial");
		names.push("Benedict");
		//be aware to check if the stack is not empty
		//before using pop operation otherwise
		//it'll throw and exception
		names.pop();
		System.out.println("Top : "+names.peek());
	}
}
