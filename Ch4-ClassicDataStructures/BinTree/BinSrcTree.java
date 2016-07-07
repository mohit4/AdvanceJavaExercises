public class BinSrcTree {

	public Node root;

	public BinSrcTree() {
		root = null;
	}

	public void inorder() {
		System.out.println("Here goes the code for that...");
	}

	public void insert(int data) {

		Node newnode = new Node();
		newnode.data = data;
		if(root==null)
			root=newnode;
		else
		{
			Node curr = root;
			Node parent;
			while(true) {
				parent = curr;
				if(data<curr.data) {
					curr=curr.left;
					if(curr==null){
						parent.left=newnode;
						break;
					}
				}
				else {
					curr=curr.right;
					if(curr==null) {
						parent.right=newnode;
						break;
					}
				}
			}
		}
	}
}
