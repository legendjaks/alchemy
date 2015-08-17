package com.sathy.alchemy.tree;

public class MinMax {

  private static class Result {
    TreeNode node;
    int n;

    public Result(TreeNode node, int n) {
      this.n = n;
      this.node = node;
    }
  }

  public static Result min(TreeNode root, int n) {

    if (root == null)
      return new Result(null, n);

    Result left = min(root.left, n);
    if (left.node != null)
      return left;

    n = left.n - 1;

    if (n == 0)
      return new Result(root, 0);

    return min(root.right, n);
  }

  public static Result max(TreeNode root, int n) {

    if (root == null)
      return new Result(null, n);

    Result right = max(root.right, n);
    if (right.node != null)
      return right;

    n = right.n - 1;

    if (n == 0)
      return new Result(root, 0);

    return max(root.left, n);
  }

  public static void main(String[] args) {

    TreeNode n1 = new TreeNode(1);
    TreeNode n2 = new TreeNode(2);
    TreeNode n3 = new TreeNode(3);
    TreeNode n4 = new TreeNode(4);
    TreeNode n5 = new TreeNode(5);
    TreeNode n6 = new TreeNode(6);
    TreeNode n7 = new TreeNode(7);
    TreeNode n8 = new TreeNode(8);
    TreeNode n9 = new TreeNode(9);

    n1.left = n2;
    n1.right = n3;

    n2.left = n4;
    n2.right = n5;

    n4.right = n6;
    n6.left = n7;

    n3.right = n8;
    n8.left = n9;

    System.out.println("Min:");
    for (int i = 1; i <= 9; i++) {
      Result r = min(n1, i);
      System.out.println(r.node.key);
    }
    
    System.out.println("Max:");
    for (int i = 1; i <= 9; i++) {
      Result r = max(n1, i);
      System.out.println(r.node.key);
    }
  }
}
