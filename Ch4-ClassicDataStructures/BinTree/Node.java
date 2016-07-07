public class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int data) {
		this.data = data;
		left=right=null;
	}

	public Node() {
		left=right=null;
	}

	int getData() {
		return data;
	}
}
