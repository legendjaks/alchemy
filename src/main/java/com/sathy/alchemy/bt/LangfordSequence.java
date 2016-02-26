package com.sathy.alchemy.bt;

public class LangfordSequence {

  public static int[] findSolution(int n) {
    int[] sol = new int[2 * n];
    if (explore(sol, n))
      return sol;
    return null;
  }

  // backtrack like nqueens problem
  public static boolean explore(int[] sol, int gap) {
    if (gap == 0)
      return true;
    
    for (int i = sol.length - 1; i - gap > 0; i--) {
      
      if (sol[i] == 0 && sol[i - gap - 1] == 0) {
        sol[i] = gap;
        sol[i - gap - 1] = gap;
        
        if (explore(sol, gap - 1))
          return true;
        else {
          sol[i] = 0;
          sol[i - gap - 1] = 0;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] res = findSolution(7);
    if (res != null)
      for (int d : res)
        System.out.print(d);
  }
}
