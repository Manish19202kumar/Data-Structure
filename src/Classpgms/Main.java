package Classpgms;

class TreeNode {
	 int value;
	 TreeNode left;
	 TreeNode right;
	 public TreeNode(int value) {
	 this.value = value;
	 this.left = null;
	 this.right = null;
	 }
	}
	class TreeTraversal {
	 public static void inorderTraversal(TreeNode node) {
	 
	if (node != null) {
	 inorderTraversal(node.left);
	 System.out.print(node.value + " ");
	 inorderTraversal(node.right);
	 }
	 }
	 public static void preorderTraversal(TreeNode node) {
	 if (node != null) {
	 System.out.print(node.value + " ");
	 preorderTraversal(node.left);
	 
	 preorderTraversal(node.right);
	 }
	 }
	 public static void postorderTraversal(TreeNode node) {
	 if (node != null) {
	 postorderTraversal(node.left);
	 postorderTraversal(node.right);
	 System.out.print(node.value + " ");
	 }
	 }
	}
	public class Main {
	 public static void main(String[] args) {
	 TreeNode root = new TreeNode(1);
	 root.left = new TreeNode(2);
	 root.right = new TreeNode(3);
	 root.left.left = new TreeNode(4);
	 root.left.right = new TreeNode(5);
	 
	 System.out.println("Inorder Traversal:");
	 TreeTraversal.inorderTraversal(root);
	 System.out.println();
	 System.out.println("Preorder Traversal:");
	 TreeTraversal.preorderTraversal(root);
	 System.out.println();
	 
	System.out.println("Postorder Traversal:");
	 TreeTraversal.postorderTraversal(root);
	 }
	}
