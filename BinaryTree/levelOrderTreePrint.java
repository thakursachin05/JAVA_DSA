package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTreePrint {
	
	public static void LevelOrderPrint(BinaryTreeNode<Integer> root) {
		if(root==null) return;
		Queue<BinaryTreeNode<Integer>> que = new LinkedList<>();
		que.add(root);
		que.add(null);
		
		while(!que.isEmpty()) {
			
			BinaryTreeNode<Integer> frontNode = que.poll();
			if(frontNode == null) {
				System.out.println();
				if(!que.isEmpty()) {
					que.add(null);
				}
			}else {
				System.out.print(frontNode.data + " ");
				if(frontNode.left !=null) {
					que.add(frontNode.left);
				}
				if(frontNode.right != null) {
					que.add(frontNode.right);
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
