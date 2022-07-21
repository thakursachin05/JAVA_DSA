package BinarySearchTree;

import BinaryTree.BinaryTreeNode;


public class BinarySearchTree {
	
	BinaryTreeNode<Integer> root;
	
	
	private BinaryTreeNode<Integer> insertDataHelper(BinaryTreeNode<Integer> root,int data) {
		if(root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if(root.data > data) {
			root.left = insertDataHelper(root.left,data);
		}else {
			root.right = insertDataHelper(root.right,data);
		}
		return root;
	}
	public void insertData(int data) {
		root = insertDataHelper(root,data);
	}

	public void deleteData(int data) {
		root = deleteData(root,data);
	}
	
	private BinaryTreeNode<Integer> deleteData(BinaryTreeNode<Integer> root, int data) {
		if(root == null) {
			
			return null;
		}
		if(root.data > data) {
			root.left = deleteData(root.left , data);
			return root;
		}
		else if(root.data < data) {
			root.right = deleteData(root.right , data);
			return root;
		}
		else {
			if(root.left == null && root.right == null) {
				return null;
			}
			else if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			else {
				BinaryTreeNode<Integer> minNode =  root.right;
				while(minNode.left!=null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right =  deleteData(root.right,minNode.data);
				return root;
			}
		}
	}
	private boolean hasDataHelper(BinaryTreeNode<Integer> root,int data) {
		if(root==null) {
			return false;
		}
		if(root.data == data) {
			return true;
		}
		else if(data > root.data) {
			//call right
			return hasDataHelper(root.right,data);
		}
		else {
			//call left
			return hasDataHelper(root.left,data);
		}
	}
	public boolean hasData(int data) {
		return hasDataHelper(root,data);
	}
	private void printDetailed(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printDetailed(root.left);
		printDetailed(root.right);
	}
	
	public void printTree() {
		printDetailed(root);
	}
	
	
	public static void main(String[] args) {
		 BinarySearchTree bst = new BinarySearchTree();
		 bst.insertData(10);
		 bst.insertData(20);
		 bst.insertData(5);
		 bst.insertData(15);
		 bst.insertData(3);
		 bst.insertData(7);
		 bst.printTree();
		 bst.deleteData(10);
		 bst.printTree();
		 
	}
}


