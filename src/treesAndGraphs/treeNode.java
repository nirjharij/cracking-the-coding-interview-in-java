package treesAndGraphs;

public class treeNode {
	int val;
	treeNode lefTreeNode;
	treeNode righTreeNode;
	treeNode parentNode;
	
	public treeNode(int val) {
		this.val = val;
		this.lefTreeNode = null;
		this.righTreeNode = null;
		this.parentNode = null;
	}
	
}
