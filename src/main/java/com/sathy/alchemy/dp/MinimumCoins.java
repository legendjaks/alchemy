package com.sathy.alchemy.dp;

public class MinimumCoins {

  public static int find(int sum, int denom[]) {

    int min[] = new int[sum + 1];

    for (int i = 1; i < min.length; i++)
      min[i] = Integer.MAX_VALUE;

    for (int i = 0; i < denom.length; i++)
      for (int j = denom[i]; j <= sum; j++) {

        int res = min[j - denom[i]];

        if (res != Integer.MAX_VALUE && min[j] > res) {
          min[j] = 1 + res;
        }
      }

    if (min[sum] == Integer.MAX_VALUE)
      return 0;

    return min[sum];
  }
}
