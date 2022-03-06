/*
 * print the nodes at given  distance from root node
 * Input - 2 	10
 			   /  \
 			  30  20
 			 /   /  \
 			70  40  50
 			
  Output - 40, 50, 70
 */
package tree;

public class printNode {
	
	public static void printKDist(Node root, int k) {
		if(root == null )
			return ;
		if(k==0) {
			System.out.print(root.key +" ");
		}
		else {
			printKDist(root.left, k-1);
			printKDist(root.right, k-1);
		}
	}
	/*
	 * Time complexity - theta(1) -> best case{when tree has only root}
	 * 		    		   O(n)   -> general case
	 * 					 theta(n) -> worst case
	 * 
	 * Aux space 	   - theta(h) -> worst case
	 * 						O(h)  -> general case				        
	 */

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(30);
		root.right = new Node(20);
		root.left.left= new Node(70);
		root.right.left= new Node(40);
		root.right.right= new Node(50);
		printKDist(root, 2);

	}

}
