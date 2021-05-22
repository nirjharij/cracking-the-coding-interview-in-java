package treesAndGraphs;

import java.util.HashMap;

public class pathsWithSum {
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static int findPaths(treeNode root, int target, int running_sum) {
		if (root == null)
			return 0;
		
		int pathsWithSum = 0;
		running_sum += root.val;
		if (map.containsKey(running_sum - target) || running_sum == target)
			pathsWithSum = pathsWithSum + 1;
		
		map.put(running_sum, 1);
		
		pathsWithSum += findPaths(root.lefTreeNode, target, running_sum);
		pathsWithSum += findPaths(root.righTreeNode, target, running_sum);
		
		map.remove(running_sum);
		
		return pathsWithSum;
	}
	
	public static void main(String[] args) {
		binarySearchTree.insert(10);
		binarySearchTree.insert(11);
		binarySearchTree.insert(5);
		binarySearchTree.insert(2);
		binarySearchTree.insert(7);
		binarySearchTree.insert(3);
		binarySearchTree.insert(-12);
		
		System.out.println(findPaths(binarySearchTree.rooTreeNode, 5, 0)); 
	}
}
