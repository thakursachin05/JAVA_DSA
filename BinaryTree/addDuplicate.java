package BinaryTree;

public class addDuplicate {

	public static BinaryTreeNode<Integer> AddDuplicate(BinaryTreeNode<Integer> root){
		if(root == null) return root;
		BinaryTreeNode<Integer> left = AddDuplicate(root.left);
		BinaryTreeNode<Integer> right = AddDuplicate(root.right);
		BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<>(root.data);
		duplicate.left = left;
		root.left = duplicate;
		root.right = right;
		return root;
		
	}
	
	public static void InsertDuplicate(BinaryTreeNode<Integer> root) {
		
		if(root == null) return;
		BinaryTreeNode<Integer> left = root.left;
		BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<>(root.data);
		root.left = duplicate;
		duplicate.left = left;
		
		InsertDuplicate(root.left);
		InsertDuplicate(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
