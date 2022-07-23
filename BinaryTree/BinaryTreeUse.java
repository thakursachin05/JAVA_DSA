package BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> buildTree(int []in,int []pre,int inS,int inE,int preS,int preE){
		if(inS > inE) return null;
		int rootData = pre[preS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		int rootIndex = -1;
		for(int i=inS;i<=inE;i++) {
			if(in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}
		if(rootIndex == -1) return null;
		int leftinS = inS;
		int leftpreS = preS+1;
		int leftinE = rootIndex-1;
		int leftpreE = leftpreS + leftinE - leftinS;
		int rightinS = rootIndex+1;
		int rightpreS = leftpreE+1;
		int rightinE = inE;
		int rightpreE= preE;
		root.left = buildTree(in, pre,leftinS,leftinE,leftpreS,leftpreE);
		root.right = buildTree(in, pre,rightinS,rightinE,rightpreS,rightpreE);
		return root;
	}
	
	public static Pair<Integer,Integer> diameterBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			Pair<Integer,Integer> output = new Pair<>();
			output.first = 0;
			output.second = 0;
			return output;
		}
		Pair<Integer,Integer> lo = diameterBetter(root.left);
		Pair<Integer,Integer> ro = diameterBetter(root.right);
		int height = 1 + Math.max(lo.first, ro.first);
		int option1 = lo.first + ro.first ;
		int option2 = lo.second;
		int option3 = ro.second;
		int diameter = Math.max(option1, Math.max(option2, option3));
		Pair<Integer,Integer> output = new Pair<>();
		output.first = height;
		output.second = diameter;
		return output;
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root==null) return 0;
		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		return Math.max(option1, Math.max(option2, option3));
	}
	
 	public static void printAtK(BinaryTreeNode<Integer> root,int k) {
		if(root==null) return;
		if(k==0) {
			System.out.print(root.data + " ");
			return;
		}
		printAtK(root.left,k-1);
		printAtK(root.right,k-1);
		
		
	}
	
	public static int numLeafNodes(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		if(root.left == null && root.right == null) {
			return 1;
		}
		return numLeafNodes(root.left) + numLeafNodes(root.right);
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public static int largestNode(BinaryTreeNode<Integer> root) {
		if(root == null) return -1;
		int largestLeft = largestNode(root.left);
		int largestRight = largestNode(root.right);
		return Math.max(root.data,Math.max(largestLeft, largestRight));
		
	}
	
	
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		preOrder(root.left);
		System.out.println(root.data);
		preOrder(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data);
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
 	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		int left = numNodes(root.left);
		int right = numNodes(root.right);
		return 1+left+right;
	}

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of " + parentData);
			}
			else {
				System.out.println("Enter right child of " + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootdata = s.nextInt();
		 
		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
		BinaryTreeNode<Integer> leftchild = takeTreeInputBetter(false,rootdata,true);
		BinaryTreeNode<Integer> rightchild = takeTreeInputBetter(false,rootdata,false);
		root.left = leftchild;
		root.right = rightchild;
		
		return root;
		
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootdata = s.nextInt();
		 
		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
		BinaryTreeNode<Integer> leftchild = takeTreeInput();
		BinaryTreeNode<Integer> rightchild = takeTreeInput();
		root.left = leftchild;
		root.right = rightchild;
		
		return root;
		
	}
	
	public static void printDetailed(BinaryTreeNode<Integer> root) {
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
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		print(root.left);
		print(root.right);
	}
	
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if(root == null) return null;
		if(root.left==null && root.right==null) return null;
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
	
	public static void mirror(BinaryTreeNode<Integer> root) {
		if(root==null) return;
		mirror(root.left);
		mirror(root.right);
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	
	public static boolean isBalancedBinary(BinaryTreeNode<Integer> root) {
		if(root == null) return true;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if(Math.abs(rightHeight - leftHeight)>1) return false;
		boolean isLeftBalanced = isBalancedBinary(root.left);
		boolean isRightBalanced = isBalancedBinary(root.right);
		
		return isLeftBalanced && isRightBalanced;	
	}
	
	
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			BalancedTreeReturn result = new BalancedTreeReturn();
			result.height = 0;
			result.isBalanced = true;
			return result;
		}
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBalanced = true;
		int height = 1 + Math.max(leftOutput.height , rightOutput.height);
		
		if(Math.abs(leftOutput.height - rightOutput.height)>1) {
			isBalanced = false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBalanced = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBalanced;
		return ans;
	}
	public static int maximum (BinaryTreeNode<Integer> root) {
		if(root == null) return Integer.MIN_VALUE;
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}
	public static int minimum (BinaryTreeNode<Integer> root) {
		if(root == null) return Integer.MAX_VALUE;
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root ==  null) return true;
		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);
		
		if(root.data<leftMax) {
			return false;
		}
		if(root.data > rightMin) {
			return false;
		}
		boolean isLeftBst = isBST(root.left);
		boolean isRightBst = isBST(root.right);
		
		if(isRightBst && isLeftBst){
			return true;
		}else {
			return false;
		}
	}
	
	public static Pair<Boolean,Pair<Integer,Integer>> isBSTBetter(BinaryTreeNode<Integer> root){
		if(root== null) {
			Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
			output.first = true;
			output.second = new Pair<Integer,Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		Pair<Boolean,Pair<Integer,Integer>> leftOutput = isBSTBetter(root.left);
		Pair<Boolean,Pair<Integer,Integer>> rightOutput = isBSTBetter(root.right);
		
		int min = Math.min(root.data, Math.min(leftOutput.second.first,rightOutput.second.first));
		int max = Math.max(root.data, Math.max(leftOutput.second.second,rightOutput.second.second));
		
		boolean isBst = (root.data > leftOutput.second.second 
				&& root.data <=rightOutput.second.first
				&& leftOutput.first && rightOutput.first);
		
		Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
		output.first = isBst;
		output.second = new Pair<Integer,Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;
	}
	
	public static boolean isBst3(BinaryTreeNode<Integer> root,int min , int max) {
		if(root == null) return true;
		
		if(root.data<min || root.data > max) {
			return false;
		}
		boolean isLeftOk = isBst3(root.left,min,root.data-1);
		boolean isRightOk = isBst3(root.right,root.data,max);
		return isLeftOk && isRightOk;
		
	}
	
	public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root,int data){
		if(root == null) return null;
		if(root.data == data) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = getRootToNodePath(root.left,data);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput = getRootToNodePath(root.right,data);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//		root.right = rootRight;
//		root.left = rootLeft;
//		
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
//		BinaryTreeNode<Integer> root = takeTreeInputBetter(true,0,true);
//		
//		
//		printDetailed(root);
//		System.out.println("NumNodes " + numNodes(root));
//		System.out.println("largest " + largestNode(root));
//		System.out.println("Height " + height(root));
//		printAtK(root,2);
//		System.out.println("leaf nodes " + numLeafNodes(root));
//		System.out.println("Diameter is " + diameter(root));
//		System.out.println("Diameter is " + diameterBetter(root).second);
//		int in[] = {4,2,5,1,3,7};
//		int pre[] = {1,2,4,5,3,7}; 
//		BinaryTreeNode<Integer> root = buildTree(in,pre,0,in.length-1,0,pre.length-1);
//		printDetailed(root);
//		BinaryTreeNode<Integer> root = takeInput();
//		printDetailed(root);
	}

}
