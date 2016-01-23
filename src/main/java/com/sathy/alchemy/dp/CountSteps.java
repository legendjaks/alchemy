package com.sathy.alchemy.dp;

public class CountSteps {

  public static int count(int[] steps, int n){
    
    int[] w= new int[n+1];
    w[0] = 1;
    
    for(int i=0;i<steps.length;i++)
      for(int j=steps[i];j<=n;j++){
        w[j] += w[j-steps[i]];
      }
    
    return w[n];
  }
  
  public static int countR(int n, int[] res){
    if(n<0)
      return 0;
    
    if(n==0)
      return 1;
    
    if(res[n] > -1)
      return res[n];
    
    res[n] = countR(n-1, res) + countR(n-2,res) + countR(n-3,res);
    
    return res[n];
  }
  
  public static void main(String[] args) {

    int n = 10;
    
    System.out.println(count(new int[]{1,2,3}, n));
    
    int[] res = new int[n+1];
    for(int i=0;i<=n;i++)
      res[i]=-1;
    
    System.out.println(countR(n, res));
    
  }

}
