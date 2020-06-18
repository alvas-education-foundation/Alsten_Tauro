import java.util.*;
class Node
{
	int data;
	Node left = null, right = null;

	Node(int data) {
		this.data = data;
	}
}
class Main
{
	public static Node insert(Node root, int key)
	{
		if (root == null) {
			return new Node(key);
		}
		if (key < root.data) {
			root.left = insert(root.left, key);
		}
		else {
			root.right = insert(root.right, key);
		}
		return root;
	}
	public static boolean isBST(Node node, int minKey, int maxKey)
	{
		if (node == null) {
			return true;
		}
		if (node.data < minKey || node.data > maxKey) {
			return false;
		}
		return isBST(node.left, minKey, node.data) &&
			isBST(node.right, node.data, maxKey);
	}
	public static void isBST(Node root)
	{
		if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
			System.out.println("This is a BST.");
		} else {
			System.out.println("This is NOT a BST!");
		}
	}
	private static void swap(Node root) {
		Node left = root.left;
		root.left = root.right;
		root.right = left;
	}
	public static void main(String[] args)
	{
		Node root = null;
		int i;
		int[] keys = new int[10];
		Scanner s = new Scanner(System.in);
        System.out.println("enter the no of elements :");
        int n=s.nextInt();
         System.out.println("enter the elements :");
        for(i=0;i<n;i++)
        {
        keys[i]=s.nextInt();
        }
		for (int key : keys) {
			root = insert(root, key);
		}
		swap(root);
		isBST(root);
	}
}