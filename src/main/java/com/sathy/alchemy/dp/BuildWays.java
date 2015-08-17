package com.sathy.alchemy.dp;

// http://www.geeksforgeeks.org/count-possible-ways-to-construct-buildings/
public class BuildWays {

  public static int count(int s, int b, int n, boolean space) {
    if (s + b == n) {
      return 1;
    }

    int c = 0;

    if (s > 0)
      c += count(s - 1, b, n, true);

    if (space && b >= s)
      c += count(s, b - 1, n, false);

    return c;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++)
      System.out.println(count(i, i, i, true));
  }
}
