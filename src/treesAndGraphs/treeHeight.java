package treesAndGraphs;

public class treeHeight {
	static int height(treeNode root) {
		if (root == null)
			return 0;
		int leftTreeHeight = height(root.lefTreeNode);
		int rightTreeHeight = height(root.righTreeNode);
		
		return Math.max(leftTreeHeight, rightTreeHeight) + 1;
	}
}
