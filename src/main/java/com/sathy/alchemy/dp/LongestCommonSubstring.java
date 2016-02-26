package com.sathy.alchemy.dp;

public class LongestCommonSubstring {

  public static int find(char x[], char y[]){
    int[][] l = new int[x.length][y.length];
    
    int max = 0;
    int m=-1;
    
    for(int i=0;i<x.length;i++){
      for(int j=0;j<y.length;j++){
        if(i==0 || j==0){
          l[i][j] = (x[i]==y[j])?1:0;
        }else if(x[i]==y[j]){
          l[i][j] = 1+ l[i-1][j-1];
          if(max<l[i][j]){
            max=l[i][j];
            m=i;
          }
        }
      }
    }
    
    char[] s = new char[max];
    int i = s.length - 1;
    
    while(i>=0){
      s[i] = x[m];
      i--;
      m--;
    }
    
    System.out.println("Common String: " + new String(s));
    
    return max;
  }
}
