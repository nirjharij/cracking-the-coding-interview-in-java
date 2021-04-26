package treesAndGraphs;

import java.util.Arrays;

public class minimalTree {
	 static treeNode minimalHeightTree(int[] arr) {
		 if (arr.length == 0)
			 return null;
		 
		 int mid = arr.length/2;
		 treeNode root = new treeNode(arr[mid]);
		 
		 int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
		 int[] rightArray = Arrays.copyOfRange(arr, mid+1, arr.length);
		 
		 root.lefTreeNode = minimalHeightTree(leftArray);
		 root.righTreeNode = minimalHeightTree(rightArray);
		 
		 return root;
	 }
	 
	 public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		 treeNode rooTreeNode = minimalHeightTree(arr);
		 int height = treeHeight.height(rooTreeNode);
		 System.out.println("Height of tree created: " + height);
	 }
	 
}
