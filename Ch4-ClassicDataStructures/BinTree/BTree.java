public class BTree {
		
		public static void main(String[] args) {
				BinSrcTree b = new BinSrcTree();
				b.insert(3);
				b.insert(4);
				b.insert(5);
				System.out.println("Inserted");
				//printing the inorder traversal
				b.inorder();
				System.out.println();
		}
}
