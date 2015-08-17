package com.sathy.alchemy.dp;

public class Catalan {

  public static int catalan(int n){
    
    int[] cn = new int[n+1];
    cn[0] = 1;
    
    for(int i=0;i<n;i++){
      cn[i+1] = cn[i] * 2*(2*i+1)/(i+2);
    }
    
    return cn[n];
  }
  
  public static void main(String[] args) {
    for(int i=1;i<=10;i++)
      System.out.println(catalan(i));
  }
}
