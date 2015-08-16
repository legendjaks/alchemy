package com.sathy.alchemy.dp;

public class MaximumA {

  public static int count(int n) {

    if (n <= 6)
      return n;

    int[] s = new int[n+1];

    for (int i = 0; i <= 6; i++)
      s[i] = i;

    for (int i = 7; i <= n; i++) {
      for (int b = i - 3; b >= 1; b--) {
        int curr = (i - b - 1) * s[b];
        if (curr > s[i])
          s[i] = curr;
      }
    }

    return s[n];
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++)
      System.out.println(count(i));
  }
}
