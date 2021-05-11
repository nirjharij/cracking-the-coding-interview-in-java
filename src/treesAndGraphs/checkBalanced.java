package treesAndGraphs;


public class checkBalanced {
	public int checkHeight(treeNode root) {
		if (root == null)
			return -1;
		
		int leftHeight = checkHeight(root.lefTreeNode);
		if (leftHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		int rightHeight = checkHeight(root.righTreeNode);
		if (rightHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		int heightDiff = Math.abs(rightHeight - leftHeight);
		if (heightDiff > 1)
			return Integer.MIN_VALUE;
		
		return Math.max(rightHeight, leftHeight) + 1;
	}
	
	public boolean checkBalancedTree(treeNode root) {
		return (checkHeight(root) != Integer.MIN_VALUE);
	}
}
