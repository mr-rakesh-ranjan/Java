/*
  Depth First 
  	-> Inorder (left root right)
  	-> PreOrder (root left right)
  	-> PostOrder (left right root)
  	
 */
package tree;

public class TreeTraversal {
	
	//function for inorder traversal
	public static void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}
	
	/*
	 Time complexity:- theta(n)
	 auxiliary space:- theta(h) where h - height of the tree
	 */

	//function for postorder traversal 
	public static void postorder(Node root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.key + " ");
		}
		
	}
	
	/*
	 Time complexity:- theta(n)
	 auxiliary space:- theta(h) where h - height of the tree
	 */

	//function for preorder traversal 
	public static void preorder(Node root) {
		if(root != null) {
			System.out.print(root.key + " ");
			preorder(root.left);
			preorder(root.right);
		}		
	}
	
	/*
	 Time complexity:-theta(n)
	 auxiliary space:- theta(h) where h - height of the tree
	 */
	
	//Driver code
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		root.right.right = new Node(60);
		System.out.print("Inorder Traversal : ");
		inorder(root);
		System.out.println();
		System.out.print("Preorder Traversal : ");
		preorder(root);
		System.out.println();
		System.out.print("Postorder Traversal : ");
		postorder(root);
	}

	

}
