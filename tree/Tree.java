package tree;

public class Tree {
	private static Node root;
	
	private static class Node{
		private int value;
		private Node lChild;
		private Node rChild;
		
		public Node(int v, Node l, Node r) {
			value = v;
			lChild = l;
			rChild = r;	
		}
		
		public Node(int v) {
			value = v;
			lChild = rChild = null;
		}
	}
	
	public Tree() {
		root = null;
	}
	
	public void levelOrderBinaryTree(int [] arr) {
		root = levelOrderBinaryTree(arr, 0);
	}
	
	public Node levelOrderBinaryTree(int [] arr, int start) {
		int size = arr.length;
		Node curr = new Node(arr[start]);
		int left = 2 * start + 1;
		int right = 2 * start + 2;
		if(left<size)
			curr.lChild = levelOrderBinaryTree(arr, left);
		if(right<size)
			curr.rChild = levelOrderBinaryTree(arr, right);
		return curr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		int [] arr = {1,2,3,4,5,6};
		t.levelOrderBinaryTree(arr);
		t.inorder(root);
		
	}

	private void inorder(Node root2) {
		// TODO Auto-generated method stub
		if(root2 != null) {
			inorder(root2.lChild);
			System.out.print(root2.value + " ");
			inorder(root2.rChild);
		}
		
	}

}
