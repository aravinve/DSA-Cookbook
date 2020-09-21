package tree;

public class TreeSample {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(1);
		tree.insert(4);
		tree.insert(3);
		tree.insert(5);
		tree.insert(9);
		System.out.println("\nPreorder");
		tree.preorder(tree.root);
		System.out.println("\nInorder");
		tree.inorder(tree.root);
		System.out.println("\nPostorder");
		tree.postorder(tree.root);
		System.out.println("\nLevelorder");
		tree.levelorder(tree.root);
		System.out.println();
		tree.search(10);
		tree.search(9);
		tree.search(1);
		
		tree.getDeepestNode();
		tree.deleteDeepestNode();
		System.out.println("\nLevelorder");
		tree.levelorder(tree.root);
		System.out.println();
		
		tree.getDeepestNode();
		tree.deleteDeepestNode();
		System.out.println("\nLevelorder");
		tree.levelorder(tree.root);
		System.out.println();
		
		tree.getDeepestNode();
		tree.delete(4);
		
		System.out.println("\nLevelorder");
		tree.levelorder(tree.root);
		System.out.println();
		
		tree.deleteTree();
		tree.search(10);
	}
}
