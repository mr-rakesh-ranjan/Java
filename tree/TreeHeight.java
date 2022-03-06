/*
 * function for finding height of the binary tree
 */
package tree;

public class TreeHeight {
	
	public static int height(Node root) {
		if(root == null)
			return 0;
		else 
			return Math.max(height(root.left), height(root.right))+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		root.right.right.left = new Node(70);

		System.out.println(height(root));
		

	}

}
