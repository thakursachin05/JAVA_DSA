package BinaryTree;

public class iisNodePresent {
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int k) {
		if(root==null) return false;
		if(root.data==k) return true;
		
		return (isNodePresent(root.right,k) || isNodePresent(root.right,k));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
