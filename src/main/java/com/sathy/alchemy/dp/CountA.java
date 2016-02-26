package com.sathy.alchemy.dp;

public class CountA {

  public static int count(int n){
    
    if(n<=6)
      return n;
    
    int[] res = new int[n+1];
    
    for(int i=1;i<=6;i++)
      res[i] = i;
    
    for(int i=7;i<=n;i++){
      int max = 0;
      //Select, Copy & Paste is two times of i-3
      int x = 2;
      
      for(int j=i-3;j>=1;j--){
        int c = x * res[j];
        
        if(c>max)
          max=c;
        
        // Every paste is one time of copied value
        x++;
      }
      
      res[i] = max;
    }
    
    return res[n];
  }
  
}
