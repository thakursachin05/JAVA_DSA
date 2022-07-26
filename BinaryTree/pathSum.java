package BinaryTree;

public class pathSum {
	public static void pathSum(BinaryTreeNode<Integer> root,int k, int currentSum, String path){
		if(root==null) return;
		if(root.left == null && root.right == null) {
			currentSum += root.data;
		if(k==currentSum) {
			System.out.println(path + root.data + " ");
		}
		}
		pathSum(root.left,k,(currentSum + root.data) , (path + root.data + " "));
		pathSum(root.right,k,(currentSum + root.data) , (path + root.data + " ")) ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
