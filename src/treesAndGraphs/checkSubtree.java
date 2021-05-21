package treesAndGraphs;

public class checkSubtree {
	public boolean isSubtree(treeNode t1, treeNode t2) {
		if (t1 == null)
			return false;
		
		if (t1.val == t2.val && subtreeMatches(t1, t2))
			return true;
		
		return isSubtree(t1.lefTreeNode, t2) || isSubtree(t1.righTreeNode, t2);
	}
	
	public boolean subtreeMatches(treeNode t1, treeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		else if (t1 == null || t2 == null)
			return false;
		else if (t1.val != t2.val)
			return false;
		else
			return subtreeMatches(t1.lefTreeNode, t2.lefTreeNode) && subtreeMatches(t1.righTreeNode, t2.righTreeNode);
	}
}
