package com.sathy.alchemy.tree;

// http://www.geeksforgeeks.org/given-a-binary-tree-how-do-you-remove-all-the-half-nodes/
public class HalfChild {

  public static TreeNode deleteHalfNode(TreeNode root){
    
    if(root == null)
      return null;
    
    root.left = deleteHalfNode(root.left);
    root.right = deleteHalfNode(root.right);
    
    if(root.left == null && root.right == null)
      return root;
    
    if(root.left == null || root.right == null)
      return (root.left == null)?root.right:root.left;
    
    return root;
  }
  
  public static void main(String[] args) {
    
    TreeNode n1 = new TreeNode(1);
    TreeNode n2 = new TreeNode(2);
    TreeNode n3 = new TreeNode(3);
    TreeNode n4 = new TreeNode(4);
    TreeNode n5 = new TreeNode(5);
    TreeNode n6 = new TreeNode(6);
    TreeNode n7 = new TreeNode(7);
    
    n1.left = n2;
    n1.right = n3;
    
    n2.left = n4;
    n2.right = n6;
    
    n3.right = n5;
    
    n6.left = n7;
    
    TreeUtil.inorder(n1);
    System.out.println();
    TreeNode half = deleteHalfNode(n1);
    TreeUtil.inorder(half);
  }
}
