public class LinkedList {
	public static void main(String[] args) {
		Node<String> n1 = new Node("Mohit");
		Node<String> n2 = new Node("Kumar");
		n1.next = n2;
		Node<String> n3 = new Node("Kirar");
		n2.next = n3;
		Node<String> footer = new Node("Foot");
		n3.next = footer;
		Node<String> dummy = n1;
		while(dummy.next!=null) {
			System.out.println(dummy.getData()+" ");
			dummy=dummy.next;
		}
	}
}
