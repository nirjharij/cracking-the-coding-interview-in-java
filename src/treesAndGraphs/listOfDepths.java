package treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class listOfDepths {
	
	public ArrayList<LinkedList<treeNode>> createLinkedLists(treeNode root) {
		ArrayList<LinkedList<treeNode>> listsOfTreeNodes = new ArrayList<LinkedList<treeNode>>();
		LinkedList<treeNode> treeNodesQueue = new LinkedList<treeNode>();
		
		if (root != null)
			treeNodesQueue.add(root);
		
		while (treeNodesQueue.size() > 0) {
			listsOfTreeNodes.add(treeNodesQueue);
			
			LinkedList<treeNode> parentsQueue = treeNodesQueue; 
			treeNodesQueue = new LinkedList<treeNode>();
			
			for(treeNode parent: parentsQueue) {
				if (parent.lefTreeNode != null)
					treeNodesQueue.add(parent.lefTreeNode);
				if (parent.righTreeNode != null)
					treeNodesQueue.add(parent.righTreeNode);
			}
			
		}
		return listsOfTreeNodes;
	}
}
