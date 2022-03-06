package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void printLevel(Node root) {
		if(root == null)
			return;
		Queue <Node> q = new LinkedList<Node>();
		q.add(root);
		while(q.isEmpty() == false) {
			Node curr = q.poll();
			System.out.print(curr.key + " ");
			if(curr.left != null)
				q.add(curr.left);
			if(curr.right != null)
				q.add(curr.right);
		}
	}

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(30);
		root.right = new Node(20);
		root.left.left= new Node(70);
		root.right.left= new Node(40);
		root.right.right= new Node(50);
		printLevel(root);

	}

}
