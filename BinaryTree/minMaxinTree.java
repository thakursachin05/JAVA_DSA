package BinaryTree;

public class minMaxinTree {
	
	public static minMax<Integer,Integer> MinMaxInTree(BinaryTreeNode<Integer> root){
		if(root == null) {
			minMax<Integer,Integer> result = new minMax<>();
			result.min = 0;
			result.max = 0;
			return result; 
		}
		
		minMax<Integer,Integer> left = MinMaxInTree(root.left);
		minMax<Integer,Integer> right = MinMaxInTree(root.right);
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		min = Math.min(root.data,Math.min(left.min, right.min));
		max = Math.max(root.data,Math.max(left.max, right.max));
		minMax<Integer,Integer> ans = new minMax<>();
		ans.min = min;
		ans.max = max;
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
