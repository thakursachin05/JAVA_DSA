package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.BinaryTreeNode;

public class bstToLL {

	public static Node<Integer> BSTTOLL(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		Node<Integer> left = BSTTOLL(root.left);
		Node<Integer> right = BSTTOLL(root.right);
		
		Node<Integer> midNode = new Node<>(root.data);
		midNode.next = right;
		
		Node<Integer> temp = left;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = midNode;
		return left;
		
		
	}
	
	public static Pair<Node<Integer>,Node<Integer>> bstToll1(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair<Node<Integer>,Node<Integer>> output = new Pair<>();
			output.first=null;
			output.second =null;
			return output;
		}
		Pair<Node<Integer>,Node<Integer>> first = bstToll1(root.left);
		Pair<Node<Integer>,Node<Integer>> second = bstToll1(root.right);
		
		Node<Integer> mid = new Node<>(root.data);
		Pair<Node<Integer>,Node<Integer>> output = new Pair<>();
		if(first.second!=null) {
			first.second.next = mid;
		}
		mid = second.first;
		if(first.first != null) {
			output.first = first.first;
		}
		else {
			output.first = mid;
		}
		if(second.second!=null) {
			output.second = second.second;
		}else {
			output.second = mid;
		}
		
		return output;
	}

	public static BinaryTreeNode<Integer> LCA(BinaryTreeNode<Integer> root,int a,int b){
		if(root == null || root.data == a || root.data == b) {
			return root;
		}
		
		if(root.data > a && root.data > b) {
			return LCA(root.left,a,b);
		}
		else if(root.data < a && root.data < b) {
			return LCA(root.right,a,b);
		}
		
		BinaryTreeNode<Integer> leftLca = LCA(root.left,a,b);
		BinaryTreeNode<Integer> rightLca = LCA(root.right,a,b);
		if(leftLca !=null && rightLca != null) {
			return root;
		}
		else if(leftLca!=null) {
			return leftLca;
			
		}
		return rightLca;
	}

	public static int sumOfNodes(BinaryTreeNode<Integer> root,int sum) {
		if(root == null) return sum;
		
		sum = sumOfNodes(root.right,sum);
		sum += root.data;
		root.data = sum;
		sum = sumOfNodes(root.left,sum);
		
		return sum;
	}
	
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x){
		if(root == null) {
			return null;
		}
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftOutput = nodeToRootPath(root.left , x);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput = nodeToRootPath(root.right,x);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		return null;
	}
	
	public static ArrayList<Node<Integer>> linkedListLevel(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return new ArrayList<Node<Integer>>();
		}
		
		Queue<BinaryTreeNode<Integer>> que = new LinkedList<>();
		que.add(root);
		que.add(null);
		
		int currentLevelRemaining = 1;
		int nextLevelCount = 0;
		Node<Integer> head = null;
		Node<Integer> tail = null;
		ArrayList<Node<Integer>> output = new ArrayList<>();
		while(!que.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			currentNode = que.remove();
			Node<Integer> newNode = new Node<>(currentNode.data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			if(currentNode.left !=null) {
				que.add(currentNode.left);
				nextLevelCount++;
			}
			if(currentNode.right != null ) {
				que.add(currentNode.right);
				nextLevelCount++;
			}
			currentLevelRemaining--;
			
			if(currentLevelRemaining == 0) {
				output.add(head);
				head = null;
				tail = null;
				currentLevelRemaining = nextLevelCount;
				nextLevelCount = 0;
			}
		}
		return output;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
