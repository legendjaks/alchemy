package com.sathy.alchemy.tree;

public class TreeUtil {

  public static void inorder(TreeNode node) {
    if (node == null)
      return;
    
    inorder(node.left);
    System.out.print(node.key + " ");
    inorder(node.right);
  }
}
