package treesAndGraphs;

public class successor {
	public static int inorderSuccessor(treeNode node) {
		if (node.righTreeNode == null) {
			return node.parentNode.val;
		}
		else {
			treeNode righTreeNode = node.righTreeNode;
			
			while(righTreeNode.lefTreeNode != null) {
				righTreeNode =  righTreeNode.lefTreeNode;
			}
			return righTreeNode.val;
		}
	}
	
	public static void main(String[] args) {
		binarySearchTree bSearchTree = new binarySearchTree();
		bSearchTree.insert(10);
		bSearchTree.insert(5);
		bSearchTree.insert(15);
		bSearchTree.insert(4);
		bSearchTree.insert(13);
		bSearchTree.insert(18);
		bSearchTree.insert(8);
		bSearchTree.insert(9);
		
		int successor = inorderSuccessor(bSearchTree.rooTreeNode.lefTreeNode);
		System.out.println(successor);
	}
}
