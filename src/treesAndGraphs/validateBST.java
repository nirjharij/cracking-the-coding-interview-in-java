package treesAndGraphs;


public class validateBST {
	public boolean checkBst(treeNode root, int min, int max) {
		if (root == null)
			return true;
		
		if ((min != Integer.MIN_VALUE) && root.val < min || (max != Integer.MAX_VALUE) && root.val > max){
			return false;
		}
		
		if (!checkBst(root.lefTreeNode, min, root.val) || !checkBst(root.righTreeNode, root.val, max)) {
			return false;
		}
		
		return true;
	}
	
}
