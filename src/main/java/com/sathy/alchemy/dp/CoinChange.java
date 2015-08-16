package com.sathy.alchemy.dp;

public class CoinChange {

  public static int countWays(int[] d, int sum){
    int[] s = new int[sum + 1];
    s[0]=1;
    
    for(int i=0;i<d.length;i++)
      for(int j=d[i];j<=sum;j++)
        s[j] += s[j-d[i]];
    
    return s[sum];
  }
  
  public static void main(String[] args) {
    int[] d = {3, 5, 10};
    System.out.println(countWays(d, 20));
  }
}
