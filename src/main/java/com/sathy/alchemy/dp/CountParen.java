package com.sathy.alchemy.dp;

public class CountParen {

  public static int count(int l, int r){
    
    if(l+r == 0)
      return 1;
    
    int c = 0;
    
    if(l>0)
      c += count(l-1, r);
    
    if(l<r)
      c += count(l, r-1);
    
    return c;
  }
  
  public static void main(String[] args) {
    for(int i=1;i<=10;i++)
      System.out.println(count(i, i));
  }
}
