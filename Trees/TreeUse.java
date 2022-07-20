import java.util.Scanner;

public class TreeUse {
	
	public static void preOrder(TreeNode<Integer> root) {
		if(root == null ) return;
		System.out.print(root.data + " ");
		for(int i=0;i<root.children.size();i++) {
			preOrder(root.children.get(i));
		}
	}
	
	public static void postOrder(TreeNode<Integer> root) {
		if(root == null) return;
		for(int i=0;i<root.children.size();i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}
	
 	public static int leafNode(TreeNode<Integer> root) {
		if(root == null) return 0;
		int count = 0;
		if(root.children.size()==0) count++;
		for(int i=0;i<root.children.size();i++) {
			count+=leafNode(root.children.get(i));
		}
		return count;
	}
	
	public static void printAtK(TreeNode<Integer> root,int k) {
		if(k<0) return;
		if(k==0){
			System.out.print(root.data);
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			printAtK(root.children.get(i),k-1);
		}
	}
	
	public static int largest(TreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int ans = root.data;
		for(int i=0;i<root.children.size();i++) {
			int childLargest = largest(root.children.get(i));
			if(childLargest > ans) {
				ans = childLargest;
			}
		}
		return ans;
	}
	
	public static int numNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int count = 1;
		for(int i=0;i<root.children.size();i++) {
			count += numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static TreeNode<Integer> takeInput(Scanner s){
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of chilren for "+ n);
		int childCount = s.nextInt();
		for(int i=0;i<childCount;i++) {
//			System.out.println("Enter chilren for "+ i+1);
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for(int i=0;i<root.children.size();i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	public static TreeNode<Integer> takeInputBFS(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes= new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of "+ frontNode.data);
				int numChildren = s.nextInt();
				for(int i=0;i< numChildren;i++) {
					System.out.println("Enter " + (i+1) + "th child of "+ frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch(QueueEmptyException e){
				//should'nt come here
				return null;
			}
			
		}
		return root;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		TreeNode<Integer> root = takeInput(s);
		TreeNode<Integer> root = takeInputBFS();

		print(root);
		System.out.println(largest(root));
		System.out.println(numNodes(root));
//		printAtK(root,2);
		postOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		System.out.println("LeafNodes Are " + leafNode(root));
//		
//	TreeNode<Integer> root  = new TreeNode<Integer>(4);
//	TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//	TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//	TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//	TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//	
//	root.children.add(node2);
//	root.children.add(node2);
//	root.children.add(node3);
//	node2.children.add(node4);
//	
//	System.out.println(root);
	}
}
