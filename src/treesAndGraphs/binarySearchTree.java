package treesAndGraphs;

public class binarySearchTree {
	static treeNode rooTreeNode = null;
	
	public static void insert(int data) {
		treeNode newNode = new treeNode(data);
		if (rooTreeNode == null) {
			System.out.println("Root node inserted...");
			System.out.println(data);
			rooTreeNode = newNode;
		}
		else {
			treeNode tempNode = rooTreeNode;
			treeNode parentNode = null;
			boolean left = false;
			while (tempNode != null) {
				left = false;
				parentNode = tempNode;
				if (data < tempNode.val) {
					left = true;
					tempNode = tempNode.lefTreeNode;
				}
				else {
					tempNode = tempNode.righTreeNode;
				}
			}
			if (left) {
				System.out.println("Left node inserted...");
				System.out.println(data);
				parentNode.lefTreeNode = newNode;
			}
			else {
				System.out.println("Right node inserted...");
				System.out.println(data);
				parentNode.righTreeNode = newNode;
			}
			newNode.parentNode = parentNode;
		}
	}
	
	public static void inorderTraversal(treeNode root) {
		if (root == null)
			return;
		
		inorderTraversal(root.lefTreeNode);
		System.out.println(root.val);
		inorderTraversal(root.righTreeNode);
	}
	
	public static void main(String[] args) {
		insert(10);
		insert(5);
		insert(15);
		insert(4);
		insert(13);
		insert(18);
		insert(8);
		insert(9);
		
		inorderTraversal(rooTreeNode);
	}
}
