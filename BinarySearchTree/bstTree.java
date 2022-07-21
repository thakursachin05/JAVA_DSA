package BinarySearchTree;

import java.util.Stack;

import BinaryTree.BinaryTreeNode;

class bsttree {
	int height;
	int min;
	int max;
	boolean isBst;
}

public class bstTree {

	public static bsttree maxHeight(BinaryTreeNode<Integer> root) {
		if(root == null) {
			bsttree output =  new bsttree();
			output.max = Integer.MIN_VALUE;
			output.min = Integer.MAX_VALUE;
			output.height = 0;
			output.isBst = true;
			return output;
		}
		
		bsttree left = maxHeight(root.left);
		bsttree right = maxHeight(root.right);
		
		if(!(right.isBst && right.min > root.data)) {
			right.isBst = false;
		}
		if(!(left.isBst && left.max < root.data)) {
			left.isBst = false;
		}
		bsttree output = new bsttree();
		if(!left.isBst || !right.isBst || root.data < left.max || root.data > right.min) {
			if(left.height > right.height) {
				left.isBst = false;
				return left;
			}
			else {
				right.isBst = false;
				return right;
			}
		}
		output.isBst = true;
		output.max = Math.max(left.max,Math.max(right.max, root.data));
		output.min = Math.min(left.min,Math.min(right.min, root.data));
		output.height = 1+ Math.max(left.height , right.height);
		return output;
	}

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root ==  null) return 0;
		return 1 + countNodes(root.left) + countNodes(root.right);
	}
	
	public static void pairSum(BinaryTreeNode<Integer> root,int sum) {
		if(root == null) return;
		int totalNodes  = countNodes(root);
		
		Stack<BinaryTreeNode<Integer>> inOrder = new Stack<>();
		Stack<BinaryTreeNode<Integer>> reverseInOrder = new Stack<>();
		
		BinaryTreeNode<Integer> temp = root;
		while(temp !=null) {
			inOrder.add(temp);
			temp = temp.left;
		}
		temp = root;
		while(temp!=null) {
			reverseInOrder.add(temp);
			temp = temp.right;
		}
		int countNode = 0;
		while(countNode<totalNodes-1) {
			BinaryTreeNode<Integer> top1 = inOrder.peek();
			BinaryTreeNode<Integer> top2 = reverseInOrder.peek();
			
			if(top1.data + top2.data == sum) {
				System.out.print(top1.data + " " + top2.data);
				BinaryTreeNode<Integer> top = top1;
				inOrder.pop();
				countNode++;
				if(top.right !=null) {
					top = top.right;
					while(top != null) {
						inOrder.push(top);
						top = top.left;
					}
				}
				top = top2;
				reverseInOrder.pop();
				countNode++;
				if(top.left!= null) {
					top = top.left;
					while(top != null) {
						reverseInOrder.add(top);
						top = top.right;
					}
				}
				else if(top1.data + top2.data > sum) {
					BinaryTreeNode<Integer> tip = top2;
					reverseInOrder.pop();
					countNode++;
					if(tip.left != null) {
						tip = tip.left;
						while(tip!=null) {
							reverseInOrder.push(tip);
							tip= tip.right;
						}
					}
				}
				else {
					BinaryTreeNode<Integer> tip1 = top1;
					inOrder.pop();
					countNode++;
					if(tip1.right!=null) {
						tip1 = tip1.right;
						while(tip1!=null) {
							inOrder.push(tip1);
							tip1 = tip1.left;
						
						}
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
