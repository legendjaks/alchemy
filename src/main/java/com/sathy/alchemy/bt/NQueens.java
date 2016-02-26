package com.sathy.alchemy.bt;

public class NQueens {

  private static boolean place(int a[], int r, int c) {

    for (int i = 0; i < a.length; i++) {
      // check column is used
      // (row - row) == (col - col) means attacking position
      if (a[i] == c || Math.abs(a[i] - c) == Math.abs(i - r))
        return false;
    }
    return true;
  }

  private static boolean solve(int a[], int r) {

    // break when n+1
    if (r == a.length)
      return true;

    for (int i = 0; i < a.length; i++) {

      if (place(a, r, i)) {
        a[r] = i;

        if (solve(a, r + 1))
          return true;
        else
          // placement is not suitable
          // set default value
          a[r] = Integer.MAX_VALUE;
      }
    }

    return false;
  }

  private static void print(int a[]) {
    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
  }

  public static void solveNQueens(int n) {
    int a[] = new int[n];

    // Initialize to default value
    // coz value is used to check the attacking position in place()
    for (int i = 0; i < a.length; i++)
      a[i] = Integer.MAX_VALUE;

    if (solve(a, 0)) {
      print(a);
    } else
      System.out.println("No solutions available");
  }

}
