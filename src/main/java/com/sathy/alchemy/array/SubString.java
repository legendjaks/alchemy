package com.sathy.alchemy.array;

public class SubString {

  public static boolean isSubstring(String s1, String s2){
    
    char[] s = s1.toCharArray();
    char[] p = s2.toCharArray();
    
    int x,y,l;
    
    x = y = 0;
    l = 0;
    
    while(x<s.length && y<p.length){
      
      if(y==0)
        l = x;
        
        if(s[x] == p[y]){
          x++;
          y++;
        }else{
          y=0;
          x = l+1;
        }
    }
    
    return (y==p.length);
  }
}
