package com.sathy.alchemy.array;

public class KMP {

  public static int[] precompute(char[] p){
    int[] pi = new int[p.length];
    
    int k = -1;
    pi[0] = -1;
    
    for(int i=1;i<pi.length;i++){
      while(k>-1 && p[k+1] != p[i])
        k = pi[k];
      
      if(p[k+1] == p[i])
        k++;
      
      pi[i] = k;
    }
    
    return pi;
  }
  
  public static boolean match(char[] t, char[] p){
    
    int[] pi = precompute(p);
    int q=-1;
    
    for(int i=0;i<t.length;i++){
      while(q>-1 && p[q+1]!=t[i])
        q=pi[q];
      
      if(p[q+1] == t[i])
        q++;
      
      if(q==p.length-1){
        return true;
      }
    }
    
    return false;
  }
}
