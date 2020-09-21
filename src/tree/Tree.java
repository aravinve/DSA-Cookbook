package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	TreeNode root;
	
	public Tree() {
		this.root = null;
	}
	
	public void insert(int val) {
		TreeNode current = new TreeNode();
		current.val = val;
		if(root == null) {
			root = current;
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode latest = queue.remove();
			if(latest.left == null) {
				latest.left = current;
				return;
			}else if(latest.right == null) {
				latest.right = current;
				return;
			}else {
				queue.add(latest.left);
				queue.add(latest.right);
			}
		}
	}
	
	public void preorder(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}
	
	public void postorder(TreeNode root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val + " ");
	}
	
	public void levelorder(TreeNode root) {
		if(root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode latest = queue.remove();
			System.out.print(latest.val + " ");
			if(latest.left != null) queue.add(latest.left);
			if(latest.right != null) queue.add(latest.right);
		}
	}
	
	public void search(int value) {
		if(root == null) {
			System.out.println("Tree is Null");
			return;
		}
		if(root.val == value) {
			System.out.println("Found: " + root.val);
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode latest = queue.remove();
			if(latest.val == value) {
				System.out.println("Found: " + latest.val);
				return;
			}
			if(latest.left != null) queue.add(latest.left);
			if(latest.right != null) queue.add(latest.right);
		}
		System.out.println("Not Found: " + value);
	}
	
	public TreeNode getDeepestNode() {
		if(root == null) {
			return null;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		TreeNode latest = null;
		while(!queue.isEmpty()) {
			latest = queue.remove();
			if(latest.left != null) queue.add(latest.left);
			if(latest.right != null) queue.add(latest.right);
		}
		System.out.println("Deepest Node Val: " + latest.val);
		return latest;
	}
	
	public void deleteDeepestNode() {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		TreeNode previous, latest = null;
		while(!queue.isEmpty()) {
			previous = latest;
			latest = queue.remove();
			if(latest.left == null) {
				previous.right = null;
				return;
			} else if(latest.right == null) {
				latest.left = null;
				return;
			}
			queue.add(latest.left);
			queue.add(latest.right);
		}
		System.out.println("Deleted Deepest Node");
	}
	
	public void delete(int value) {
		if(root == null) {
			System.out.println("Tree is Null");
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode latest = queue.remove();
			if(latest.val == value) {
				System.out.println("Found: " + latest.val);
				int deepNodeVal = getDeepestNode().val;
				System.out.println("Replacing "+ latest.val + " with " + deepNodeVal);
				latest.val = deepNodeVal;
				deleteDeepestNode();
				return;
			}
			if(latest.left != null) queue.add(latest.left);
			if(latest.right != null) queue.add(latest.right);
		}
		System.out.println("Not Found: " + value);
	}
	
	public void deleteTree() {
		this.root = null;
	}
}
