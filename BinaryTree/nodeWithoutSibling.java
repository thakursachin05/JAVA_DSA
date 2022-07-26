package BinaryTree;

public class nodeWithoutSibling {
	public static void NodeWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		if(root.left == null && root.right!=null) {
			System.out.print(root.right.data+" ");
		}
		else if(root.right == null && root.left!=null) {
			System.out.print(root.left.data+" ");
		}
		NodeWithoutSibling(root.left);
		NodeWithoutSibling(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
