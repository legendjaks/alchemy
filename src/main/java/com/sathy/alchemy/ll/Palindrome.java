package com.sathy.alchemy.ll;

public class Palindrome {

  public static class Result {
    boolean status;
    Node node;

    public Result(boolean status, Node node) {
      this.status = status;
      this.node = node;
    }
  }

  public static boolean isPalindrome(Node head) {
    int size = size(head);

    Result res = palindrome(head, size - 2);
    return res.status;
  }

  private static Result palindrome(Node n, int k) {

    if (k == 0)
      return new Result(n.data == n.next.data, n.next.next);

    if (k == 1)
      return new Result(n.data == n.next.next.data, n.next.next.next);

    Result r = palindrome(n.next, k - 2);
    if (!r.status)
      return new Result(false, null);

    return new Result(n.data == r.node.data, r.node.next);
  }

  private static int size(Node n) {

    if (n == null)
      return 0;

    return 1 + size(n.next);
  }

}
