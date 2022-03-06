/*
 -> Tree is non-linear data structure
 -> It store data in hierarchical fashion
 -> It is recursive in nature
 Degree of Node : No. of children it has.
 Leaf Node      : Nodes which has degree Zero(0).
 Internal Node  : Nodes other than leaf nodes.
 
 Properties ---
 1. Maximum number of nodes at level 'l' of a binary tree is 2^(l-1).
 2. Maximum number of nodes in a binary tree of height 'h' is 2^h - 1.
 3. In a binary tree with 'N' nodes, the maximum possible height or minimum number of level is log2(N+1).
 4. A binary tree with 'L' leaves has at level [log2(L) + 1]. 
 5. In a binary tree in which every node has 0 or 2 children, the number of leaf nodes is always one more than the nodes with two children.
 		L = T + 1
 	where T = Number of internal nodes with two children.
 		  L = Number of leaf nodes.
 
 */
package tree;

class Node{
	int key;
	Node left, right;
	Node(int k){
		key = k;
		left = right = null;
	}
}

public class Basic {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
	}

}
/*
 Output ---
 		10
 	   /  \
 	  20  30
 	 /
 	40 
 
 */
