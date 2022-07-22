package BinaryTree;

public class BinaryTreeNode<T> {
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data){
		this.data = data;
		left = null;
		right = null;
	}
}
