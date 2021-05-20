package treesAndGraphs;


public class firstCommonAncestor {
	private static boolean node1Found = false;
	private static boolean node2Found = false;
	
	public static treeNode findAncestor(treeNode root, treeNode node1, treeNode node2) {
		if (root == null) {
			return null;
		}
		if (root == node1 && root == node2)
			return root;
		
		if (node1 == root) {
			node1Found = true;
			return node1;
		}
		
		if (node2 == root) {
			node2Found = true;
			return node2;
		}
		
		treeNode leftnode = findAncestor(root.lefTreeNode, node1, node2);
		treeNode rightnode = findAncestor(root.righTreeNode, node1, node2);
		
		if ((leftnode != null) && (rightnode != null))
			return root;
		else if (leftnode != null) {
			return leftnode;
		}
		else {
			return rightnode;
		}
	}
	
	public static void main(String[] args) {
		binarySearchTree.insert(20);
		binarySearchTree.insert(10);
		binarySearchTree.insert(5);
		binarySearchTree.insert(30);
		binarySearchTree.insert(14);
		binarySearchTree.insert(18);
		binarySearchTree.insert(3);
		binarySearchTree.insert(2);
		binarySearchTree.insert(1);
		treeNode node1 = binarySearchTree.rooTreeNode.lefTreeNode.lefTreeNode;
		treeNode node2 = binarySearchTree.rooTreeNode.lefTreeNode.righTreeNode.righTreeNode;
		treeNode ouTreeNode = findAncestor(binarySearchTree.rooTreeNode, node1, node2);
		if (node1Found && node2Found) {
			System.out.println("Found");
			System.out.println("FCA: " + ouTreeNode.val);
		}
		else {
			System.out.println("Not Found");
		}
	}
}
