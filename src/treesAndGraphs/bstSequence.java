package treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;


public class bstSequence {
	public ArrayList<LinkedList<Integer>> getAllSequences(treeNode root) {
		ArrayList<LinkedList<Integer>> results = new ArrayList<LinkedList<Integer>>();
		if (root == null) {
			results.add(new LinkedList<Integer>());
			return results;
		}
		
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(root.val);
		
		ArrayList<LinkedList<Integer>> leftArrayList = getAllSequences(root.lefTreeNode);
		ArrayList<LinkedList<Integer>> rightArrayList = getAllSequences(root.righTreeNode);
		
		for (LinkedList<Integer> left: leftArrayList) {
			for (LinkedList<Integer> right: rightArrayList) {
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
				weaveList(left, right, weaved, prefix);
				results.addAll(weaved);
			}
		}
		
		return results;
	}
	
	public void weaveList(LinkedList<Integer> left, LinkedList<Integer> right, 
			ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
		
		if (left.size() == 0 || right.size() == 0) {
			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
			result.addAll(left);
			result.addAll(right);
			results.add(result);
			return;
		}
		
		int headLeft = left.removeFirst();
		prefix.addLast(headLeft);
		weaveList(left, right, results, prefix);
		prefix.removeLast();
		left.addFirst(headLeft);
		
		int headRight = right.removeFirst();
		prefix.addLast(headRight);
		weaveList(left, right, results, prefix);
		prefix.removeLast();
		right.addFirst(headRight);
	}
}
