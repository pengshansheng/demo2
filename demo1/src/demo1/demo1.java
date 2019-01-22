package demo1;

import java.lang.reflect.Array;

public class demo1 {
	public static void main(String[] args) {
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(9);
		TreeNode c = new TreeNode(20);
		TreeNode d = new TreeNode(15);
		TreeNode e = new TreeNode(7);
		a.left=b;
		a.right=c;
		c.left=d;
		c.right=e;
		demo1 temp = new demo1();
		temp.maxDepth(a);
	}
	
	public int maxDepth(TreeNode root) {
	    if (root == null) {
	      return 0;
	    } else {
	      int left_height = maxDepth(root.left);
	      int right_height = maxDepth(root.right);
	      return java.lang.Math.max(left_height, right_height) + 1;
	      
	    }
	}
}
